import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
*   VENTANA QUE SIRVE A MANERA DE VER TODOS LOS CLIENTES REGISTRADOS
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Lista_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Clientes
     */
    public Lista_Clientes() {
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
        ButtonBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBuscar.setText("Buscar");
        background.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        txtBuscar.setText("Ingrese el ID del cliente.");
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
        background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, -1));

        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Cliente", "CURP", "Nombre", "Apellido Paterno", "Apellido Materno", "Núm. Pasaporte", "Télefono", "Correo", "Tipo Cliente", "¿Es externo?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClients.getTableHeader().setReorderingAllowed(false);
        tableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClients);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 680, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        // Se analiza si el valor del campo de texto es igual al mensaje por defecto
        if(txtBuscar.getText().equals("Ingrese el ID del cliente."))
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
            txtBuscar.setText("Ingrese el ID del cliente.");
        }
    }//GEN-LAST:event_txtBuscarFocusLost

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
    String dato = txtBuscar.getText().toString(); // Se declara una variable para el dato que se capture en el campo de texto 
        String num = dato.length()+""; // Se declara una cariable que cuenta los caracteres que tiene el dato 
        loadTableClients(dato,num); // Se pasan estas dos cariables al metodo
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tableClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientsMouseClicked
        DefaultTableModel modeloTabla = (DefaultTableModel) tableClients.getModel();
        String dato = String.valueOf(modeloTabla.getValueAt(tableClients.getSelectedRow(),0));
        Reservacion ventana = new Reservacion(dato);
        ventana.setVisible(true);
    }//GEN-LAST:event_tableClientsMouseClicked

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
            java.util.logging.Logger.getLogger(Lista_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClients;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    
    // Metodo encargado de llenar la tabla de los recepcionistas
    private void loadTableClients(String dato, String num)
    {
        DefaultTableModel modeloTabla = (DefaultTableModel) tableClients.getModel();   // Se crea un nuevo modelo de tabla referenciando a la tabla de la ventana
        modeloTabla.setRowCount(0);                                                     // Se establece la primera fila para comenzar desde esa posicion
        
        PreparedStatement ps;           // Variable que se encarga de almacenar la sentencia de la consulta
        ResultSet rs;                   // Variable que se encarga de almacenar los resultados de la consulta
        ResultSetMetaData rsmd;         // Variable que se encarga de almacenar la informacion de la tabla
        int columnas;                   // Cantidad de columnas que tiene la tabla
        
        try
        {
            Conexion cx = new Conexion();                           // Se crea una nueva conexion
            Connection cn = cx.connect();                           // Se ejecuta el metodo connect() de la clase Conexion
            
            if(dato.equals(""))                                     // Se crea un If que evalua el valor de dato 
            {
            ps = cn.prepareStatement("CALL `SEARCHclient`");     // Se prepara la linea de codigo para ejecutar el PROCEDURE
            }
            else 
            {
            ps = cn.prepareStatement("CALL `SEARCHclientUNIQUEinList`(?,?)"); //Se prepara la linea de codigo para ejecutar el PROCEDURE
            ps.setString(1, dato);                                  //Valor de entrada del primer dato
            ps.setString(2, num);                                   //Valor de entrada del Segundo dato
            }

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
                    
                    // Se analiza si el valor contenido en la fila 9 es verdadero
                    if(i == 9 && fila[9].equals(true))
                    {
                        // Se sustituye el valor de la fila 9 por "Si"
                        fila[9] = "Si";
                    }
                    // Sin embargo, se analiza si el valor contenido en la fila 9 es falso
                    else if(i == 9 && fila[9].equals(false))
                    {
                        // Se sustituye el valor de la fila 9 por "No"
                        fila[9] = "No";
                    }
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

}
