package com.mycompany.projeto.view;

import com.mycompany.projeto.DatabaseConnection;
import com.mycompany.projeto.Navegador;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroSintomas extends javax.swing.JFrame {

    private ArrayList<Sintoma> listaSintomas;
    private int proximoId;

    public CadastroSintomas() {
        initComponents();

        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Nome"}, 0);
        tableSintomas.setModel(model);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tableSintomas.setRowSorter(sorter);

        btnVoltar.setEnabled(false);
        listaSintomas = new ArrayList<>();
        proximoId = 1;
        atualizarTabela();
        tableSintomas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && tableSintomas.getSelectedRow() != -1) {
                    int selectedRow = tableSintomas.getSelectedRow();
                    String sintoma = (String) tableSintomas.getValueAt(selectedRow, 1);
                    txtInserirSintoma.setText(sintoma);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeSintoma = new javax.swing.JLabel();
        txtInserirSintoma = new javax.swing.JTextField();
        lblPesquisarSintoma = new javax.swing.JLabel();
        txtPesquisarSintoma = new javax.swing.JTextField();
        btnSalvarSintoma = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        sintomas = new javax.swing.JScrollPane();
        tableSintomas = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlLeft = new javax.swing.JPanel();
        btnAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Sintomas");
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastrar um sintoma");

        lblNomeSintoma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNomeSintoma.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeSintoma.setText("Nome do Sintoma:");

        txtInserirSintoma.setBorder(null);

        lblPesquisarSintoma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPesquisarSintoma.setForeground(new java.awt.Color(0, 0, 0));
        lblPesquisarSintoma.setText("Pesquisar sintoma:");

        txtPesquisarSintoma.setBorder(null);
        txtPesquisarSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarSintomaActionPerformed(evt);
            }
        });

        btnSalvarSintoma.setText("Salvar");
        btnSalvarSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSintomaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tableSintomas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableSintomas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Sintomas"
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
        tableSintomas.setShowVerticalLines(true);
        sintomas.setViewportView(tableSintomas);

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
        lblContador.setText("4");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContador)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblTitulo))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblNomeSintoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInserirSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSalvarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sintomas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRightLayout.createSequentialGroup()
                                    .addComponent(lblPesquisarSintoma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPesquisarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInserirSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeSintoma)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvarSintoma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisarSintoma)
                    .addComponent(txtPesquisarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(sintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        Navegador.mostrarCadastroDoencas();
        this.dispose();
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSintomaActionPerformed
        String sintoma = txtInserirSintoma.getText().trim();
    if (!sintoma.isEmpty()) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            
            // Encontrar o menor ID disponível
            int menorIdDisponivel = getMenorIdDisponivel(conn);
            Sintoma novoSintoma = new Sintoma(menorIdDisponivel, sintoma);

            String sql = "INSERT INTO sintomas (id, nome) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, novoSintoma.getId());
                stmt.setString(2, novoSintoma.getNome());
                stmt.executeUpdate();
            }

            listaSintomas.add(novoSintoma);
            atualizarTabela();
            txtInserirSintoma.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o sintoma no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, insira um sintoma.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSalvarSintomaActionPerformed

    private int getMenorIdDisponivel(Connection conn) throws SQLException {
    String sql = "SELECT id FROM sintomas ORDER BY id ASC";
    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        int expectedId = 1; // Começando do 1
        while (rs.next()) {
            int currentId = rs.getInt("id");
            if (currentId != expectedId) {
                // Encontrou um buraco no ID, retorna expectedId
                return expectedId;
            }
            expectedId++;
        }
        // Se não encontrou buracos, retorna o próximo ID disponível
        return expectedId;
    }
    }
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int selectedRow = tableSintomas.getSelectedRow();
        if (selectedRow != -1) {
            String novoSintoma = txtInserirSintoma.getText().trim();
            if (!novoSintoma.isEmpty()) {
                int id = (int) tableSintomas.getValueAt(selectedRow, 0);
                try (Connection conn = DatabaseConnection.getConnection()) {
                    String sql = "UPDATE sintomas SET nome = ? WHERE id = ?";
                    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                        stmt.setString(1, novoSintoma);
                        stmt.setInt(2, id);
                        stmt.executeUpdate();
                    }
                    tableSintomas.setValueAt(novoSintoma, selectedRow, 1);
                    txtInserirSintoma.setText("");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar o sintoma no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, insira um sintoma.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um sintoma para alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtInserirSintoma.setText("");
        txtPesquisarSintoma.setText("");
        TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) tableSintomas.getRowSorter();
        if (sorter != null) {
            sorter.setRowFilter(null);
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tableSintomas.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) tableSintomas.getValueAt(selectedRow, 0);
            try (Connection conn = DatabaseConnection.getConnection()) {

                // Deletar o sintoma selecionado
                String sql = "DELETE FROM sintomas WHERE id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, id);
                    stmt.executeUpdate();
                }

                atualizarTabela();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o sintoma: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um sintoma para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tableSintomas.getModel();
        model.setRowCount(0);
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM sintomas";
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

    private void txtPesquisarSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarSintomaActionPerformed

    }//GEN-LAST:event_txtPesquisarSintomaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String texto = txtPesquisarSintoma.getText().trim();
        TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) tableSintomas.getRowSorter();

        if (texto.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto));

            if (tableSintomas.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Nenhum sintoma encontrado com o texto \"" + texto + "\".", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                sorter.setRowFilter(null);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Navegador.mostrarCadastroSintomas();
                new CadastroSintomas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarSintoma;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblNomeSintoma;
    private javax.swing.JLabel lblPesquisarSintoma;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JScrollPane sintomas;
    private javax.swing.JTable tableSintomas;
    private javax.swing.JTextField txtInserirSintoma;
    private javax.swing.JTextField txtPesquisarSintoma;
    // End of variables declaration//GEN-END:variables
}

class Sintoma {

    private int id;
    private String nome;

    public Sintoma(int id, String nome) {
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
