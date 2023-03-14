import java.sql.*;
import javax.swing.JOptionPane;
/*
*   VENTANA QUE SIRVE A MANERA VER, AÑADIR, Y MODIFICAR LOS DATOS DE LOS CONSUMOS HECHOS EN EL HOTEL
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Consumos extends javax.swing.JFrame implements textFieldConfig {

    /**
     * Creates new form Consumos
     */
    public Consumos() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtonEliminar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtcantiprod = new javax.swing.JTextField();
        ButtonBorrar = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        ButtonConsprod = new javax.swing.JButton();
        txtpreciototal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Lista de Consumo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel1.setText("Datos de Consumo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 400, 180));

        ButtonEliminar.setText("Eliminar");
        jPanel2.add(ButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        txtTotal.setText("Total: $");
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 580, 270));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Cantidas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("Precio total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setText("Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setText("Cliente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, -1));
        jPanel1.add(txtcantiprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        ButtonBorrar.setText("Borrar");
        jPanel1.add(ButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        ButtonNuevo.setText("Nuevo");
        jPanel1.add(ButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        ButtonGuardar.setText("Guardar");
        jPanel1.add(ButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        ButtonConsprod.setText("Buscar");
        ButtonConsprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsprodActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonConsprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, -1));

        txtpreciototal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel1.add(txtpreciototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void ButtonConsprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsprodActionPerformed
       // Codigos necesarios para mostrar la subventana de Lista de Productos
        Lista_Productos ven = new Lista_Productos();
        ven.setVisible(true);
    }//GEN-LAST:event_ButtonConsprodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonConsprod;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcantiprod;
    private javax.swing.JFormattedTextField txtpreciototal;
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
