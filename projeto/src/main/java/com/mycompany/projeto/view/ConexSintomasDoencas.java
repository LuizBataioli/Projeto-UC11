package com.mycompany.projeto.view;

import static com.mycompany.projeto.DatabaseConnection.getConnection;
import com.mycompany.projeto.Navegador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConexSintomasDoencas extends javax.swing.JFrame {

    public ConexSintomasDoencas() {
        initComponents();
        atualizarTabelaVinculos();
    }

    private void atualizarTabelaVinculos() {
        try {
            Connection conn = getConnection();
            String query = "SELECT doenca_nome, sintoma_nome FROM doenca_sintoma";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) vinculosCadastrados.getModel();
            model.setRowCount(0); // Limpa a tabela existente

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("doenca_nome"), rs.getString("sintoma_nome")});
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela de vínculos: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeDoenca = new javax.swing.JLabel();
        txtNomeDoenca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        txtMostrarDoencaDigitada = new javax.swing.JTextField();
        btnVincular = new javax.swing.JButton();
        tableVincularSintomaComDoenca = new javax.swing.JScrollPane();
        vincular = new javax.swing.JTable();
        tableMostrarVinculos = new javax.swing.JScrollPane();
        vinculosCadastrados = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblSubDesc = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlLeft = new javax.swing.JPanel();
        btnAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vinculo de Doenças e Sintomas");

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setText("Vincular doenças e sintomas");

        lblNomeDoenca.setBackground(new java.awt.Color(0, 0, 0));
        lblNomeDoenca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNomeDoenca.setText("Digite a Doença:");

        txtNomeDoenca.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeDoenca.setBorder(null);
        txtNomeDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoencaActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtMostrarDoencaDigitada.setForeground(new java.awt.Color(0, 0, 0));
        txtMostrarDoencaDigitada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMostrarDoencaDigitada.setBorder(null);

        btnVincular.setText("Vincular Sintomas");
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });

        vincular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vincular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Sintoma que deseja vincular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vincular.setShowGrid(true);
        tableVincularSintomaComDoenca.setViewportView(vincular);

        vinculosCadastrados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        vinculosCadastrados.setForeground(new java.awt.Color(0, 0, 0));
        vinculosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doenca", "Sintoma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vinculosCadastrados.setAlignmentX(0.05F);
        vinculosCadastrados.setAlignmentY(0.05F);
        vinculosCadastrados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vinculosCadastrados.setGridColor(new java.awt.Color(255, 255, 255));
        tableMostrarVinculos.setViewportView(vinculosCadastrados);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblSubDesc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSubDesc.setText("Doenças e sintomas ja cadastrados");

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        pnlLeft.setBackground(new java.awt.Color(204, 255, 204));

        btnAvancar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAvancar.setText("<");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVoltar.setText(">");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblContador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContador.setForeground(new java.awt.Color(0, 0, 0));
        lblContador.setText("2");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContador)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblNomeDoenca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                                                .addComponent(lblSubDesc)
                                                .addGap(156, 156, 156))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                                                .addComponent(btnExcluir)
                                                .addGap(283, 283, 283))))
                                    .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMostrarDoencaDigitada, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnVincular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tableVincularSintomaComDoenca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(tableMostrarVinculos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lblTitulo)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(pnlLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeDoenca)
                            .addComponent(txtNomeDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMostrarDoencaDigitada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVincular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tableVincularSintomaComDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tableMostrarVinculos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        Navegador.mostrarLocalizarDoencaPorSintoma();
        this.dispose();
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Navegador.mostrarCadastroDoencas();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nomeDoenca = txtNomeDoenca.getText().trim();

        if (nomeDoenca.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o nome da doença.");
            return;
        }

        try {
            Connection conn = getConnection();

            // Verifica se a doença existe
            String query = "SELECT * FROM doencas WHERE nome = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nomeDoenca);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Doença encontrada, exibe no campo txtMostrarDoencaDigitada
                txtMostrarDoencaDigitada.setText(nomeDoenca);

                // Atualiza a tabela com todos os sintomas cadastrados
                String sintomasQuery = "SELECT * FROM sintomas";
                PreparedStatement sintomasStmt = conn.prepareStatement(sintomasQuery);
                ResultSet sintomasRs = sintomasStmt.executeQuery();

                DefaultTableModel model = (DefaultTableModel) vincular.getModel();
                model.setRowCount(0); // Limpa as linhas existentes

                while (sintomasRs.next()) {
                    model.addRow(new Object[]{sintomasRs.getString("nome")});
                }

                // Habilita o botão Vincular
                btnVincular.setEnabled(true);
            } else {
                // Doença não encontrada
                JOptionPane.showMessageDialog(this, "Doença não encontrada.");
                txtMostrarDoencaDigitada.setText("");
                btnVincular.setEnabled(false);

                DefaultTableModel model = (DefaultTableModel) vincular.getModel();
                model.setRowCount(0); // Limpa as linhas existentes
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar a doença: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        String nomeDoenca = txtMostrarDoencaDigitada.getText().trim();

    if (nomeDoenca.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nenhuma doença selecionada para vincular.");
        return;
    }

    int[] selectedRows = vincular.getSelectedRows();
    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione pelo menos um sintoma.");
        return;
    }

    try {
        Connection conn = getConnection();
        String doencaQuery = "SELECT nome FROM doencas WHERE nome = ?";
        PreparedStatement doencaStmt = conn.prepareStatement(doencaQuery);
        doencaStmt.setString(1, nomeDoenca);
        ResultSet doencaRs = doencaStmt.executeQuery();

        if (doencaRs.next()) {
            String insertQuery = "INSERT INTO doenca_sintoma (doenca_nome, sintoma_nome) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);

            for (int row : selectedRows) {
                String sintomaNome = (String) vincular.getValueAt(row, 0);
                String sintomaQuery = "SELECT nome FROM sintomas WHERE nome = ?";
                PreparedStatement sintomaStmt = conn.prepareStatement(sintomaQuery);
                sintomaStmt.setString(1, sintomaNome);
                ResultSet sintomaRs = sintomaStmt.executeQuery();

                if (sintomaRs.next()) {
                    insertStmt.setString(1, nomeDoenca);
                    insertStmt.setString(2, sintomaNome);
                    insertStmt.addBatch();
                } else {
                    JOptionPane.showMessageDialog(this, "Sintoma " + sintomaNome + " não encontrado.");
                    return;
                }
            }

            insertStmt.executeBatch();
            JOptionPane.showMessageDialog(this, "Sintomas vinculados com sucesso.");

            // Limpa os campos e atualiza a tabela
            txtNomeDoenca.setText("");
            txtMostrarDoencaDigitada.setText("");
            DefaultTableModel model = (DefaultTableModel) vincular.getModel();
            model.setRowCount(0);
            atualizarTabelaVinculos();
        } else {
            JOptionPane.showMessageDialog(this, "Doença não encontrada.");
        }

        conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erro ao vincular sintomas: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnVincularActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = vinculosCadastrados.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um vínculo para excluir.");
        return;
    }

    String doencaNome = (String) vinculosCadastrados.getValueAt(selectedRow, 0);
    String sintomaNome = (String) vinculosCadastrados.getValueAt(selectedRow, 1);

    int confirm = JOptionPane.showConfirmDialog(this, 
        "Tem certeza de que deseja excluir o vínculo entre a doença \"" + doencaNome + "\" e o sintoma \"" + sintomaNome + "\"?", 
        "Excluir Vínculo", 
        JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            Connection conn = getConnection();
            String deleteQuery = "DELETE FROM doenca_sintoma WHERE doenca_nome = ? AND sintoma_nome = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
            deleteStmt.setString(1, doencaNome);
            deleteStmt.setString(2, sintomaNome);
            deleteStmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Vínculo excluído com sucesso.");

            // Atualize a tabela após a exclusão
            atualizarTabelaVinculos();

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir vínculo: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNomeDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDoencaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConexSintomasDoencas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVincular;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblNomeDoenca;
    private javax.swing.JLabel lblSubDesc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JScrollPane tableMostrarVinculos;
    private javax.swing.JScrollPane tableVincularSintomaComDoenca;
    private javax.swing.JTextField txtMostrarDoencaDigitada;
    private javax.swing.JTextField txtNomeDoenca;
    private javax.swing.JTable vincular;
    private javax.swing.JTable vinculosCadastrados;
    // End of variables declaration//GEN-END:variables
}
