import java.sql.*;
import javax.swing.JOptionPane;
/*
*   VENTANA ENCARGADA DE INICIAR SESION EN EL PROGRAMA
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Login extends javax.swing.JFrame {

    private static int trys = 5;        // Intentos de inicio de sesion antes de cerrar el programa 
    
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        descUsuario = new javax.swing.JLabel();
        txtRecId = new javax.swing.JTextField();
        descPass = new javax.swing.JLabel();
        txtPassRec = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        tittle = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        descUsuario.setText("Codigo de Usuario:");
        jPanel1.add(descUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 130, -1));

        txtRecId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtRecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, -1));

        descPass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        descPass.setText("Contraseña:");
        jPanel1.add(descPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 80, -1));

        txtPassRec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPassRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 150, -1));

        btnLogin.setBackground(new java.awt.Color(102, 102, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("INGRESAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 90, -1));

        tittle.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        tittle.setText("Iniciar Sesión");
        jPanel1.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginIcon.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginBackground.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Evento mandado a llamar siempre que se pulse el boton de acceso
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Variables en las que se almacenaran lo almacenado en los espacios de la ventana
        String recID = txtRecId.getText();
        String passRec = txtPassRec.getText();
        
        // Se comprueba si los campos tienen valores nulos
        if(recID.equals("") || passRec.equals(""))
        {
            // Se lanza un mensaje de advertencia en caso de que se detecten los campos vacios
            JOptionPane.showMessageDialog(null, "Campos de Usuario y/o Contraseña vacios", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
        }
        // Sin embargo, si no estan los campos vacios
        else
        {
            // Se comprueba el valor del metodo loginCheck en caso de que sea igual a verdadero
            if(loginCheck(recID,passRec))
            {
                JOptionPane.showMessageDialog(null, "BIENVENIDO","LOGIN EXITOSO", JOptionPane.INFORMATION_MESSAGE);
                new Interfaz().setVisible(true);    // Se instancia una nueva interfaz del menu principal
                this.dispose();                     // La ventana actual (login) se cierra

            }
            // Sin embargo, si el valor es falso
            else
            {
                // Se resta 1 al valor actual de trys y se lanza un mensaje de error
                trys --;
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos"+ 
                                                    "\nIntentos restantes = " + trys + ".","LOGIN FALLIDO", JOptionPane.ERROR_MESSAGE);

                // Se analiza si el valor actual de trys es igual o menor a 0
                if(trys <= 0)
                {
                    // Se notifica al usuario del cierre del programa
                    JOptionPane.showMessageDialog(null, "Intentos de inicio de sesion gastados", "CERRANDO PROGRAMA", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);     // Se cierra el programa
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel descPass;
    private javax.swing.JLabel descUsuario;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tittle;
    private javax.swing.JPasswordField txtPassRec;
    private javax.swing.JTextField txtRecId;
    // End of variables declaration//GEN-END:variables

    
    // Metodo loginCheck de tipo SDSR con parametros de usuario y contraseña
    private boolean loginCheck(String user, String pass) {
        PreparedStatement ps;           // Variable que se encarga de almacenar la sentencia de la consulta
        ResultSet rs;                   // Variable que se encarga de almacenar los resultados de la consulta
        boolean isExist = false;        // Valor que se regresara, por defecto tiene valor falso

        try {
            Conexion cx = new Conexion();                           // Se crea una nueva conexion
            Connection cn = cx.connect();                           // Se ejecuta el metodo connect() de la clase Conexion

            ps = cn.prepareStatement("CALL `LOGINrec`(?, ?)");      // Se prepara la linea de codigo para ejecutar el PROCEDURE
            ps.setString(1, user);                                  // Se asigna el valor del parametro user a la consulta
            ps.setString(2, pass);                                  // Se asigna el valor del parametro pass a la consulta

            rs = ps.executeQuery();                                 // Se ejecuta la consulta

            // Se comprueba si el valor arrojado de la consulta es diferente a nulo
            if(rs != null)
            {
                // Ciclo while donde se comprueba si existe un registro siguiente
                while(rs.next())
                {
                    // Se analiza el valor arrojado por la consulta
                    if(rs.getInt(1) == 1)
                    {
                        isExist = true;         // Si existen resultados de la consulta, se asigna el valor de verdadero
                    }
                    else
                    {
                        isExist = false;        // Si no existen resultados de la consulta, se asigna el valor de falso
                    }
                }
            }
            cx.disconnect();    // Se cierra la conexion con la base de datos
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error = " + ex);     // Se notifica via consola que ha ocurrido un error
        }
        return isExist;         // Se regresa el valor de la variable isExist
    }
}
