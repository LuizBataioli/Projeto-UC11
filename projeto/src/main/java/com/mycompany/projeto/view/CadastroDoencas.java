package com.mycompany.projeto.view;

import com.mycompany.projeto.DatabaseConnection;
import com.mycompany.projeto.Navegador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroDoencas extends javax.swing.JFrame {

    private ArrayList<Doenca> listaDoencas;
    private int proximoId;

    public CadastroDoencas() {
        initComponents();
        listaDoencas = new ArrayList<>();
        proximoId = 1;
        atualizarTabela();
        tableDoencas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && tableDoencas.getSelectedRow() != -1) {
                    int selectedRow = tableDoencas.getSelectedRow();
                    String doenca = (String) tableDoencas.getValueAt(selectedRow, 1);
                    txtInserirDoenca.setText(doenca);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeDoenca = new javax.swing.JLabel();
        txtInserirDoenca = new javax.swing.JTextField();
        btnSalvarDoenca = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblPesquisaDoenca = new javax.swing.JLabel();
        txtNomeDoencaPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        Doencas = new javax.swing.JScrollPane();
        tableDoencas = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlLeft = new javax.swing.JPanel();
        btnAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Doenças");

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastrar uma doença");

        lblNomeDoenca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNomeDoenca.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeDoenca.setText("Nome da Doença:");

        txtInserirDoenca.setBorder(null);
        txtInserirDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInserirDoencaActionPerformed(evt);
            }
        });

        btnSalvarDoenca.setText("Salvar");
        btnSalvarDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDoencaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblPesquisaDoenca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPesquisaDoenca.setForeground(new java.awt.Color(0, 0, 0));
        lblPesquisaDoenca.setText("Pesquisar doença:");

        txtNomeDoencaPesquisa.setBorder(null);
        txtNomeDoencaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoencaPesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tableDoencas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableDoencas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Doença"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class
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
        tableDoencas.setShowVerticalLines(true);
        Doencas.setViewportView(tableDoencas);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

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
        lblContador.setText("3");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContador)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPesquisaDoenca)
                            .addComponent(lblNomeDoenca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInserirDoenca)
                            .addComponent(txtNomeDoencaPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addComponent(btnSalvarDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Doencas, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(186, 186, 186))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addComponent(pnlLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInserirDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeDoenca)
                    .addComponent(btnSalvarDoenca)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisaDoenca)
                    .addComponent(txtNomeDoencaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Doencas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Navegador.mostrarCadastroSintomas();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        Navegador.mostrarConexSintomasDoencas();
        this.dispose();
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnSalvarDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDoencaActionPerformed
        String doenca = txtInserirDoenca.getText().trim();
        if (!doenca.isEmpty()) {
            try (Connection conn = DatabaseConnection.getConnection()) {
                String sql = "INSERT INTO doencas (nome) VALUES (?)";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, doenca);
                    stmt.executeUpdate();
                }
                atualizarTabela();
                txtInserirDoenca.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar a doença: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma doença.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarDoencaActionPerformed

    private void txtInserirDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInserirDoencaActionPerformed

    }//GEN-LAST:event_txtInserirDoencaActionPerformed

    private void txtNomeDoencaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoencaPesquisaActionPerformed

    }//GEN-LAST:event_txtNomeDoencaPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String searchText = txtNomeDoencaPesquisa.getText().trim().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) tableDoencas.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tableDoencas.setRowSorter(sorter);

        if (searchText.length() == 0) {
            sorter.setRowFilter(null); // Exibe todos os dados novamente
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
            if (sorter.getViewRowCount() == 0) {
                JOptionPane.showMessageDialog(this,
                        "Nenhuma doença encontrada com o texto \"" + searchText + "\".",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE
                );
                sorter.setRowFilter(null); // Exibe todos os dados novamente
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int selectedRow = tableDoencas.getSelectedRow();
        if (selectedRow != -1) {
            String novaDoenca = txtInserirDoenca.getText().trim();
            if (!novaDoenca.isEmpty()) {
                int id = (Integer) tableDoencas.getValueAt(selectedRow, 0);
                try (Connection conn = DatabaseConnection.getConnection()) {
                    String sql = "UPDATE doencas SET nome = ? WHERE id = ?";
                    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                        stmt.setString(1, novaDoenca);
                        stmt.setInt(2, id);
                        stmt.executeUpdate();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar a doença: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
                atualizarTabela();
                txtInserirDoenca.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, insira uma doença.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma doença para alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tableDoencas.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) tableDoencas.getValueAt(selectedRow, 0);
            try (Connection conn = DatabaseConnection.getConnection()) {

                String sql = "DELETE FROM doencas WHERE id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, id);
                    stmt.executeUpdate();
                }
                String resetAutoIncrementSql = "ALTER TABLE doencas AUTO_INCREMENT = 1";
                try (PreparedStatement stmt = conn.prepareStatement(resetAutoIncrementSql)) {
                    stmt.executeUpdate();
                }
                atualizarTabela();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a doença: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma doença para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tableDoencas.getModel();
        model.setRowCount(0);
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM doencas";
            try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    model.addRow(new Object[]{id, nome});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar a tabela: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtInserirDoenca.setText("");
        txtNomeDoencaPesquisa.setText("");
        TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) tableDoencas.getRowSorter();
        if (sorter != null) {
            sorter.setRowFilter(null);
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDoencas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Doencas;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarDoenca;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblNomeDoenca;
    private javax.swing.JLabel lblPesquisaDoenca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JTable tableDoencas;
    private javax.swing.JTextField txtInserirDoenca;
    private javax.swing.JTextField txtNomeDoencaPesquisa;
    // End of variables declaration//GEN-END:variables
}

class Doenca {

    private int id;
    private String nome;

    public Doenca(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
