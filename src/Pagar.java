import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
*   VENTANA QUE SIRVE A MANERA DE REGISTRAR LOS PAGOS EN EL SISTEMA
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Pagar extends javax.swing.JFrame implements textFieldConfig {

    private static String[] habitaciones;       // Atributo para almacenar la habitacion
    private static String cliente;              // Atributo para almacenar al cliente
    private static double costo;                // Atributo para almacenar el costo
    private static Reservacion referencia;      // Se referencia a la ventana de consumos 
    
    public Pagar(String[] habitaciones, String cliente, double costo, Reservacion referencia)
    {
        initComponents();
        
        this.habitaciones = habitaciones;
        this.cliente = cliente;
        this.costo = costo;
        
        this.referencia = referencia;
        
        for(int i = 0; i < habitaciones.length; i++)
        {
            if(txtHabitacion.getText().equals(""))
            {
                txtHabitacion.setText(habitaciones[0]);
            }
            else
            {
                String habitacionRegistrada = txtHabitacion.getText();
                txtHabitacion.setText(habitacionRegistrada + "," + habitaciones[i]);
            }
        }
        
        btnCancel.setVisible(false);
        btnAccept.setVisible(false);
        
        
        txtCliente.setText(cliente);
        txttotalreserva.setText("$ "+ costo + "0");
        
        Tablecons(cliente);
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
        tablepago = new javax.swing.JTable();
        txtIngreso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableconsum = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txttotalreserva = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JFormattedTextField();
        txtdescuento = new javax.swing.JFormattedTextField();
        txtcostototal = new javax.swing.JFormattedTextField();
        btnCancel = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Lista de pagos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel1.setText("Registrar Pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablepago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Descuento", "Costo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablepago.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablepago);
        if (tablepago.getColumnModel().getColumnCount() > 0) {
            tablepago.getColumnModel().getColumn(0).setResizable(false);
            tablepago.getColumnModel().getColumn(1).setResizable(false);
            tablepago.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 130));

        txtIngreso.setText("Total: $");
        jPanel3.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 190, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 580, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setText("Total: $");
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 190, 30));

        tableconsum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Código Producto", "Cantidad", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableconsum.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableconsum);
        if (tableconsum.getColumnModel().getColumnCount() > 0) {
            tableconsum.getColumnModel().getColumn(0).setResizable(false);
            tableconsum.getColumnModel().getColumn(1).setResizable(false);
            tableconsum.getColumnModel().getColumn(2).setResizable(false);
            tableconsum.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 580, 190));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Total Reserva");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Sub-Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setText("Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setText("Habitación");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setText("Descuento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel10.setText("Costo Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));
        jPanel1.add(txttotalreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));
        jPanel1.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, -1));

        jLabel11.setText("Banco ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtsubtotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jPanel1.add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        txtdescuento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getPercentInstance())));
        jPanel1.add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        txtcostototal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jPanel1.add(txtcostototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 20));

        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, 20));

        ButtonNuevo.setText("Pagar");
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 400));

        jLabel12.setText("Lista de consumos");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        JOptionPane.showMessageDialog(null,"SE HA CANCELADO EL PAGO");
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        // Se analiza si existe algun campo vacio en los campos de texto
        if(txtBanco.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Existe algun campo vacio, favor de llenarlo o cambiar el valor del desplegable", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        }
        // Sin embargo, si no existen campos vacios
        else
        {

            // Se hace una concatenacion entre las iniciales y la fecha
            String banc = txtBanco.getText();
            String desc = txtdescuento.getText();
            String costot = txtcostototal.getText();
            
            

            // Se ejecuta el metodo para añadir los valores a la tabla de productos
            realizarcompra(banc, desc, costot);

            // Se llama al metodo para bloquear los campos de texto
            lockTextEdit();

            // Se ocultan los botones de aceptar y cancelar
            btnCancel.setVisible(false);
            btnAccept.setVisible(false);

            // Se muestran los demas botones de accion
            ButtonNuevo.setVisible(true);
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuevoActionPerformed
        // Se llama al metodo para desbloquear los campos de texto
        unlockTextEdit();

        // Se muestran los botones de aceptar y cancelar
        btnCancel.setVisible(true);
        btnAccept.setVisible(true);

        // Se ocultan los demas botones de accion
        ButtonNuevo.setVisible(false);
    }//GEN-LAST:event_ButtonNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableconsum;
    private javax.swing.JTable tablepago;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JFormattedTextField txtcostototal;
    private javax.swing.JFormattedTextField txtdescuento;
    private javax.swing.JFormattedTextField txtsubtotal;
    private javax.swing.JTextField txttotalreserva;
    // End of variables declaration//GEN-END:variables

    // Metodo encargado para bloquear los campos de texto
    @Override
    public void lockTextEdit()
    {
        // Se bloquea la edicion de los campos de texto
        txtCliente.setEnabled(false);
        txtHabitacion.setEnabled(false);
        txttotalreserva.setEnabled(false);
        txtBanco.setEnabled(false);
        txtsubtotal.setEnabled(false);
        txtdescuento.setEnabled(false);
        txtcostototal.setEnabled(false);
    }
    
    // Metodo encargado para desbloquear los campos de texto
    @Override
    public void unlockTextEdit()
    {
        // Se desbloquea la edicion de los campos de texto
        txtBanco.setEnabled(true);
        txtdescuento.setEnabled(true);
    }
    
    // Metodo encargado para vaciar los campos de texto
    @Override
    public void clearTextField()
    {
        // Se vacian los campos de texto
        txtCliente.setText("");
        txtHabitacion.setText("");
        txttotalreserva.setText("");
        txtBanco.setText("");
        txtsubtotal.setText("");
        txtdescuento.setText("");
        txtcostototal.setText("");
    }
    
    private void Tablecons(String clien ) 
    {
        DefaultTableModel modeloTabla = (DefaultTableModel) tableconsum.getModel();   // Se crea un nuevo modelo de tabla referenciando a la tabla de la ventana
        modeloTabla.setRowCount(0);                                                     // Se establece la primera fila para comenzar desde esa posicion
        
        PreparedStatement ps;           // Variable que se encarga de almacenar la sentencia de la consulta
        ResultSet rs;                   // Variable que se encarga de almacenar los resultados de la consulta
        ResultSetMetaData rsmd;         // Variable que se encarga de almacenar la informacion de la tabla
        int columnas;                   // Cantidad de columnas que tiene la tabla
      
        
        try
        {
            Conexion cx = new Conexion();                           // Se crea una nueva conexion
            Connection cn = cx.connect();                           // Se ejecuta el metodo connect() de la clase Conexion
            
            ps = cn.prepareStatement("CALL `SERCHcompra` (?)");         // Se prepara la linea de codigo para ejecutar el PROCEDURE
           
            // Se asignan los valores de los parametros a la consulta
            ps.setString(1, clien);
            
            rs = ps.executeQuery();                     // Se ejecuta la consulta
            rsmd = rs.getMetaData();                    // Se consigue la informacion de la 
            columnas = rsmd.getColumnCount();           // Se asigna la cantidad de columnas
            
            // Ciclo while donde se comprueba si existe un registro siguiente
            while(rs.next())
            {
                Object[] fila = new Object[columnas];           // Se establece un arreglo en el que se almacenaran los datos
                for(int i = 0; i < columnas; i++)               // Ciclo que termina hasta haber llenado el arreglo anterior
                {
                    fila[i] = rs.getObject(i + 1);              // Se añade el valor de la consulta almacenado en el arreglo
                }
                modeloTabla.addRow(fila);                       // Se añade la fila a la tabla
            }
            cx.disconnect();    // Se cierra la conexion con la base de datos
        }
        catch (SQLException ex) 
        {
            System.out.println("Error = " + ex);     // Se notifica via consola que ha ocurrido un error
        }    
    }
    
    // Metodo encargado de añadir los valores en la tabla de recepcionistas
    private void realizarcompra(String banc, String desc, String costot)
    {
          DateFormat dateFormat = new SimpleDateFormat("yyMMdd");             // Se establece un nuevo formato para la fecha, de forma en que se presenten los ultimos 2 digitos del año, el numero de mes y numero de dia
          String date = dateFormat.format(Calendar.getInstance().getTime());  // Se instancia un nuevo objeto para obtener la fecha actual del dispositivo

          SimpleDateFormat horaformat = new SimpleDateFormat("hh:mm:ss");
          String hora = horaformat.format(Calendar.getInstance().getTime());
         
            String name = txtCliente.getText();;
            String[] names = name.split(" ");
            
            char nomInitial = 'X';
            char secondNomInitial = 'X';
            if(names.length == 2)
            {
                nomInitial = names[0].charAt(0);
                secondNomInitial = names[1].charAt(0);
            }
            else
            {
                nomInitial = names[0].charAt(0);
            }
            
            String habit = txtHabitacion.getText();
            
            String codpag = String.valueOf(nomInitial) + String.valueOf(secondNomInitial) + habit + date;
            
            int isdesc = 0;
            
            if (desc != "" ){
                isdesc = 1;
            }
                
        PreparedStatement ps;           // Variable que se encarga de almacenar la sentencia de la consulta

        try
        {
            Conexion cx = new Conexion();                                   // Se crea una nueva conexion
            Connection cn = cx.connect();                                   // Se ejecuta el metodo connect() de la clase Conexion
            
            ps = cn.prepareStatement("CALL `ADDgasto`(?,?,?,?)");  // Se prepara la linea de codigo para ejecutar el PROCEDURE
            
            // Se asignan los valores de los parametros a la modificacion
            ps.setString(1, codpag);
            ps.setInt(2, isdesc);
            ps.setString(3, desc);
            ps.setString(4, costot);
            
           
            
            ps = cn.prepareStatement("CALL `ADDpago`(?,?,?,?,?)");  // Se prepara la linea de codigo para ejecutar el PROCEDURE
            
            // Se asignan los valores de los parametros a la modificacion
            
            ps.setString(1, codpag);
            ps.setString(2, name);
            ps.setString(3, date);
            ps.setString(4, hora);
            ps.setString(5, banc);

            ps.executeUpdate();         // Se ejecuta la actualizacion de los registros
            
            // Se notifica al usuario que se ha registrado el producto
            JOptionPane.showMessageDialog(null, "SE HA REGISTRADO AL NUEVO CLIENTE");
           

            ps.executeUpdate();         // Se ejecuta la actualizacion de los registros

            cx.disconnect();            // Se cierra la conexion con la base de datos
            loadtablepago(name);        // Se actualiza la tabla 
        }
        
        
        catch(Exception e)
        {
            System.out.println("ERROR. - " + e);
        }
    }

    private void loadtablepago(String clien ) {
    DefaultTableModel modeloTabla = (DefaultTableModel) tablepago.getModel();           // Se crea un nuevo modelo de tabla referenciando a la tabla de la ventana
        modeloTabla.setRowCount(0);                                                     // Se establece la primera fila para comenzar desde esa posicion
        
        PreparedStatement ps;           // Variable que se encarga de almacenar la sentencia de la consulta
        ResultSet rs;                   // Variable que se encarga de almacenar los resultados de la consulta
        ResultSetMetaData rsmd;         // Variable que se encarga de almacenar la informacion de la tabla
        int columnas;                   // Cantidad de columnas que tiene la tabla
      
        
        try
        {
            Conexion cx = new Conexion();                           // Se crea una nueva conexion
            Connection cn = cx.connect();                           // Se ejecuta el metodo connect() de la clase Conexion
            
            ps = cn.prepareStatement("CALL `SEARCHpagototal` (?)");         // Se prepara la linea de codigo para ejecutar el PROCEDURE
           
            // Se asignan los valores de los parametros a la consulta
            ps.setString(1, clien);
            
            rs = ps.executeQuery();                     // Se ejecuta la consulta
            rsmd = rs.getMetaData();                    // Se consigue la informacion de la 
            columnas = rsmd.getColumnCount();           // Se asigna la cantidad de columnas
            
            // Ciclo while donde se comprueba si existe un registro siguiente
            while(rs.next())
            {
                Object[] fila = new Object[columnas];           // Se establece un arreglo en el que se almacenaran los datos
                for(int i = 0; i < columnas; i++)               // Ciclo que termina hasta haber llenado el arreglo anterior
                {
                    fila[i] = rs.getObject(i + 1);              // Se añade el valor de la consulta almacenado en el arreglo
                }
                modeloTabla.addRow(fila);                       // Se añade la fila a la tabla
            }
            cx.disconnect();    // Se cierra la conexion con la base de datos
        }
        catch (SQLException ex) 
        {
            System.out.println("Error = " + ex);     // Se notifica via consola que ha ocurrido un error
        }    
    }
    
    private void test()
    {
        double valres = 0;
        double valpro = 0;
        double subtot = 0;
        double desc = 0;
        double total = 0;
        
        valres = Float.valueOf(referencia.txtCosto.getText());
        valpro = Float.valueOf(txtTotal.getText());
        subtot = valres + valpro;
        String su = Double.toString(subtot);
        txtsubtotal.setText(su);
        
        PreparedStatement ps;           // Variable que se encarga de almacenar la sentencia de la consulta
        ResultSet rs;                   // Variable que se encarga de almacenar los resultados de la consulta
        ResultSetMetaData rsmd;         // Variable que se encarga de almacenar la informacion de la tabla
        
        try
        {
            Conexion cx = new Conexion();                           // Se crea una nueva conexion
            Connection cn = cx.connect();                           // Se ejecuta el metodo connect() de la clase Conexion

            ps = cn.prepareStatement("CALL `descuento` (?)");         // Se prepara la linea de codigo para ejecutar el PROCEDURE

            // Se asignan los valores de los parametros a la consulta
            ps.setString(1, cliente);
            rs = ps.executeQuery();                     // Se ejecuta la consulta
            rsmd = rs.getMetaData();                    // Se consigue la informacion de la
            txtdescuento.setText(rsmd.toString() + "%");

            desc = Float.valueOf(txtdescuento.getText());
            total = (float) ((subtot-(subtot*(desc/100)))*0.16);
            
            txtcostototal.setText("$ " + total + "0");

            ps = cn.prepareStatement("CALL `SUMconsumos` (?)");
            ps.setString(1, cliente);
            rs = ps.executeQuery();                     // Se ejecuta la consulta

            txtTotal.setText(rs.getDouble("precioTotalC") + "");

            
            ps = cn.prepareStatement("CALL `Ingresostot`");
            rs = ps.executeQuery();                     // Se ejecuta la consulta
            
            txtIngreso.setText(rs.getDouble("gastoTotal") + "");
            
            cx.disconnect();    // Se cierra la conexion con la base de datos
        }
        catch(SQLException ex)
        {
            System.out.println("Error = " + ex);     // Se notifica via consola que ha ocurrido un error
        }
    }
}
