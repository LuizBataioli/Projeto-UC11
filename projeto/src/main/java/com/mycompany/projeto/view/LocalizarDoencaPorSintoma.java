package com.mycompany.projeto.view;

import com.mycompany.projeto.Navegador;
import static com.mycompany.projeto.DatabaseConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LocalizarDoencaPorSintoma extends javax.swing.JFrame {

    public LocalizarDoencaPorSintoma() {
        initComponents();
        carregarSintomas();
        btnAvancar.setEnabled(false);
        txtNomeSintoma.setEditable(false);

        vincular.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vincular.rowAtPoint(evt.getPoint());
                String sintomaSelecionado = (String) vincular.getValueAt(row, 0);
                txtNomeSintoma.setText(sintomaSelecionado);
                btnIdentificarDoenca.setEnabled(true); // Ativar o botão para identificar doenças
            }
        });
    }

    private void carregarSintomas() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT nome FROM sintomas")) {

            DefaultTableModel model = (DefaultTableModel) vincular.getModel();
            model.setRowCount(0); // Limpar a tabela existente

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("nome")});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtNomeSintoma = new javax.swing.JTextField();
        btnIdentificarDoenca = new javax.swing.JButton();
        tableSintomas = new javax.swing.JScrollPane();
        vincular = new javax.swing.JTable();
        tablePossiveisDoencasESintomas = new javax.swing.JScrollPane();
        doencasEsintomas = new javax.swing.JTable();
        pnlLeft = new javax.swing.JPanel();
        Up = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        Down = new javax.swing.JPanel();
        btnAvancar = new javax.swing.JButton();
        lblContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Identificação de Doenças por Sintomas");

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Identifique seu problema de acordo com os sintomas");

        txtNomeSintoma.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtNomeSintoma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeSintoma.setBorder(null);
        txtNomeSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSintomaActionPerformed(evt);
            }
        });

        btnIdentificarDoenca.setText("Identificar Doença");
        btnIdentificarDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificarDoencaActionPerformed(evt);
            }
        });

        vincular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        vincular.setForeground(new java.awt.Color(0, 0, 0));
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
                "Selecione um Sintoma"
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
        tableSintomas.setViewportView(vincular);

        doencasEsintomas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        doencasEsintomas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Possiveis Doencas", "Sintomas"
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
        doencasEsintomas.setShowGrid(false);
        doencasEsintomas.setShowVerticalLines(true);
        tablePossiveisDoencasESintomas.setViewportView(doencasEsintomas);

        pnlLeft.setBackground(new java.awt.Color(204, 255, 204));

        Up.setBackground(new java.awt.Color(204, 255, 204));

        btnVoltar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVoltar.setText(">");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpLayout = new javax.swing.GroupLayout(Up);
        Up.setLayout(UpLayout);
        UpLayout.setHorizontalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        UpLayout.setVerticalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        Down.setBackground(new java.awt.Color(204, 255, 204));
        Down.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout DownLayout = new javax.swing.GroupLayout(Down);
        Down.setLayout(DownLayout);
        DownLayout.setHorizontalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DownLayout.setVerticalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        btnAvancar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAvancar.setText("<");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        lblContador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContador.setForeground(new java.awt.Color(0, 0, 0));
        lblContador.setText("1");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContador)
                            .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIdentificarDoenca)
                .addGap(281, 281, 281))
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addComponent(tableSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(tablePossiveisDoencasESintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblTitulo)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtNomeSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablePossiveisDoencasESintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tableSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIdentificarDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Navegador.mostrarConexSintomasDoencas();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnIdentificarDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarDoencaActionPerformed
        String sintoma = txtNomeSintoma.getText();

        if (sintoma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um sintoma.");
            return;
        }

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(
                "SELECT ds.doenca_nome AS doenca, ds.sintoma_nome AS sintoma "
                + "FROM doenca_sintoma ds "
                + "WHERE ds.sintoma_nome = ?")) {

            stmt.setString(1, sintoma);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) doencasEsintomas.getModel();
            model.setRowCount(0); // Limpar a tabela existente

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("doenca"), rs.getString("sintoma")});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnIdentificarDoencaActionPerformed

    private void txtNomeSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSintomaActionPerformed
    txtNomeSintoma.setEditable(false);
    }//GEN-LAST:event_txtNomeSintomaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalizarDoencaPorSintoma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Down;
    private javax.swing.JPanel Up;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnIdentificarDoenca;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTable doencasEsintomas;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JScrollPane tablePossiveisDoencasESintomas;
    private javax.swing.JScrollPane tableSintomas;
    private javax.swing.JTextField txtNomeSintoma;
    private javax.swing.JTable vincular;
    // End of variables declaration//GEN-END:variables
}
