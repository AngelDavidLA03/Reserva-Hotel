/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kalan
 */
public class Pagar extends javax.swing.JFrame {

    /**
     * Creates new form Pagar
     */
    public Pagar() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtTotal1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txttotalreserva = new javax.swing.JTextField();
        ButtonBorrar = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        Comboboxmodopago = new javax.swing.JComboBox<>();
        txtTarjeta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JFormattedTextField();
        txtdescuento = new javax.swing.JFormattedTextField();
        txtIVA = new javax.swing.JFormattedTextField();
        txtcostototal = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Lista de pagos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel1.setText("Registrar Pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Modo de pago", "Núm Tarjeta", "Sub-Total", "Descuento", "IVA", "Costo Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 130));

        txtTotal1.setText("Total: $");
        jPanel3.add(txtTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 160, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 580, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setText("Total: $");
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 160, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 580, 190));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Total Reserva");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("Modo de pago");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setText("Sub-Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setText("Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setText("Habitación");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setText("Descuento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel9.setText("IVA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel10.setText("Costo Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));
        jPanel1.add(txttotalreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        ButtonBorrar.setText("Borrar");
        jPanel1.add(ButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        ButtonNuevo.setText("Nuevo");
        jPanel1.add(ButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        ButtonGuardar.setText("Guardar");
        jPanel1.add(ButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        Comboboxmodopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Tarjeta ", "Efectivo", " " }));
        jPanel1.add(Comboboxmodopago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel1.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        jLabel11.setText("Núm Tarjeta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtsubtotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jPanel1.add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        txtdescuento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getPercentInstance())));
        jPanel1.add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, -1));

        txtIVA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getPercentInstance())));
        jPanel1.add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        txtcostototal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jPanel1.add(txtcostototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 400));

        jLabel12.setText("Lista de consumos");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JComboBox<String> Comboboxmodopago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JFormattedTextField txtIVA;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotal1;
    private javax.swing.JFormattedTextField txtcostototal;
    private javax.swing.JFormattedTextField txtdescuento;
    private javax.swing.JFormattedTextField txtsubtotal;
    private javax.swing.JTextField txttotalreserva;
    // End of variables declaration//GEN-END:variables
}
