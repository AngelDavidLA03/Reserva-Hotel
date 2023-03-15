import java.sql.*;
import javax.swing.JOptionPane;
/*
*   SUBVENTANA ENCARGADA DE VER Y AÑADIR LOS DATOS DE RESERVACION EN EL PROGRAMA
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/
public class Reservacion extends javax.swing.JInternalFrame implements textFieldConfig {

    /**
     * Creates new form Recervacion
     */
    public Reservacion() {
        initComponents();
    }

    Reservacion(String dato) {
        if(dato.substring(1, 2)=="CL")
        {
        txtCliente.setText(dato);
        }
        else
        {
        txtHabitacion.setText(dato);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtTrabajador = new javax.swing.JTextField();
        txtcantdias = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        ButtonBorrar = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboboxEstado = new javax.swing.JComboBox<>();
        ButtonConshabi = new javax.swing.JButton();
        ButtonConscli = new javax.swing.JButton();
        Comboboxtiporeserva = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Trabajador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setText("Fecha de Reserva");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setText("Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setText("Habitación");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setText("Hora de Reserva");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setText("Cantidad de días");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setText("Costo Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, -1));
        jPanel1.add(txtTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));
        jPanel1.add(txtcantdias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, -1));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        ButtonBorrar.setText("Borrar");
        jPanel1.add(ButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        ButtonNuevo.setText("Nuevo");
        jPanel1.add(ButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        ButtonGuardar.setText("Guardar");
        jPanel1.add(ButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, -1));

        jLabel11.setText("Estado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        ComboboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "Alquiler", "Pagado", "Anulada" }));
        jPanel1.add(ComboboxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        ButtonConshabi.setText("Buscar");
        ButtonConshabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConshabiActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonConshabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 70, -1));

        ButtonConscli.setText("Buscar");
        ButtonConscli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConscliActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonConscli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 70, -1));

        Comboboxtiporeserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Reserva", "Alquiler" }));
        jPanel1.add(Comboboxtiporeserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 370));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Núm Habitación", "Cliente", "Trabajador", "Tipo", "Fecha Reserva", "Hora Reserva", "Cantidad días", "Costo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 560, 280));

        txtBuscar.setText("Buscar");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        ButtonBuscar.setText("Buscar");
        jPanel2.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        ButtonEliminar.setText("Eliminar");
        jPanel2.add(ButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        txtTotal.setText("Total: $");
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 160, 30));

        jButton6.setText("Consumo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 335, -1, -1));

        jButton7.setText("Pagar");
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 335, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 580, 370));

        jLabel1.setText("Datos de la Reserva");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Lista de Habitaciones Reservadas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Consumos lProducts = new Consumos();
        lProducts.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ButtonConshabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConshabiActionPerformed
        Lista_habitaciones lHabitacion = new Lista_habitaciones();
        lHabitacion.setVisible(true);
    }//GEN-LAST:event_ButtonConshabiActionPerformed

    private void ButtonConscliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConscliActionPerformed
        Lista_Clientes lClient = new Lista_Clientes();
        lClient.setVisible(true);
    }//GEN-LAST:event_ButtonConscliActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonConscli;
    private javax.swing.JButton ButtonConshabi;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JComboBox<String> ComboboxEstado;
    private javax.swing.JComboBox<String> Comboboxtiporeserva;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTrabajador;
    private javax.swing.JTextField txtcantdias;
    // End of variables declaration//GEN-END:variables

    // Metodo encargado para bloquear los campos de texto
    @Override
    public void lockTextEdit()
    {
        // Se bloquea la edicion de los campos de texto
        
    }
    
    // Metodo encargado para desbloquear los campos de texto
    @Override
    public void unlockTextEdit()
    {
        // Se desbloquea la edicion de los campos de texto
        
    }
    
    // Metodo encargado para vaciar los campos de texto
    @Override
    public void clearTextField()
    {
        // Se vacian los campos de texto
        
    }

}
