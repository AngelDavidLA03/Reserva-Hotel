import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
*   VENTANA QUE SIRVE A MANERA DE VISUALIZAR LAS HABITACIONES DEL HOTEL
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Lista_habitaciones extends javax.swing.JFrame {

    /**
     * Creates new form Lista_habitaciones
     */
    public Lista_habitaciones() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHabitacion = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número Habitación", "Tipo Habitación", "Piso", "Costo", "Caracteristicas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHabitacion.getTableHeader().setReorderingAllowed(false);
        tableHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHabitacion);
        if (tableHabitacion.getColumnModel().getColumnCount() > 0) {
            tableHabitacion.getColumnModel().getColumn(0).setResizable(false);
            tableHabitacion.getColumnModel().getColumn(1).setResizable(false);
            tableHabitacion.getColumnModel().getColumn(2).setResizable(false);
            tableHabitacion.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableHabitacion.getColumnModel().getColumn(3).setResizable(false);
            tableHabitacion.getColumnModel().getColumn(4).setResizable(false);
        }

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 560, -1));

        txtBuscar.setEditable(false);
        txtBuscar.setText("Ingrese el número de la habitacion.");
        txtBuscar.setEnabled(false);
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarFocusLost(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, -1));

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        background.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        // Se analiza si el valor del campo de texto es igual al mensaje por defecto
        if(txtBuscar.getText().equals("Ingrese el número de la habitacion."))
        {
            // Si el valor es igual al mensaje, este mismo se quita
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_txtBuscarFocusGained

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
        // Se analiza si el valor del campo de texto es nulo
        if(txtBuscar.getText().equals(""))
        {
            // Si el valor es nulo, se vuelve a colocar el mensaje
            txtBuscar.setText("Ingrese el número de la habitacion.");
        }
    }//GEN-LAST:event_txtBuscarFocusLost

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        if(txtBuscar.getText().equals("Ingrese el número de la habitacion."))
        {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR ALGO DIFERENTE","BUSQUEDA ERRONEA", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            //SEARCHinTable(txtBuscar.getText());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tableHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHabitacionMouseClicked
        DefaultTableModel modeloTabla = (DefaultTableModel) tableHabitacion.getModel();
        String dato = String.valueOf(modeloTabla.getValueAt(tableHabitacion.getSelectedRow(),0));
        
        Reservacion ventana = new Reservacion(dato);
        ventana.setVisible(true);
    }//GEN-LAST:event_tableHabitacionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lista_habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHabitacion;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    
    //private void SEARCHinTable()

}
