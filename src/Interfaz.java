import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*
*   VENTANA QUE SIRVE A MANERA DE MENU PRINCIPAL DEL PROGRAMA
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Interfaz extends javax.swing.JFrame implements Runnable{
    
    private static String rolRec;           // Atributo para almacenar el rol del usuario logeado
    public static String recID;            // Atributo para almacenar el rol del usuario logeado
    Thread dateTime;                    // Identificador del thread del metodo calcDateTime
    
    public Interfaz(String rol, String id) {
        initComponents();
        
        // Se asigna el valor para el atributo de rolRec
        rolRec = rol;
        recID = id;
        
        dateTime = new Thread(this);    // Se construye el thread
        dateTime.start();               // Se inicializa el thread
        
        // Se analiza si rol es igual a Normal
        if(rol.equals("Normal"))
        {
            // Si lo es, se bloquea el acceso a estos menús ocultandolos
            addhab.setVisible(false);
            addprod.setVisible(false);
            Usuarios.setVisible(false);
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/Escritorio.png"));
        Image image = icon.getImage();
        Ventana = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menres = new javax.swing.JMenu();
        Resypro = new javax.swing.JMenuItem();
        menadd = new javax.swing.JMenu();
        addhab = new javax.swing.JMenuItem();
        addprod = new javax.swing.JMenuItem();
        addcli = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenu();
        Usu = new javax.swing.JMenuItem();
        Close = new javax.swing.JMenu();
        CerrarS = new javax.swing.JMenuItem();
        CerrarP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(910, 416));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ganancia.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Ventana.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 50, 50));

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calculator.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Ventana.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 50, 50));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        Ventana.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 111, 30));

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        Ventana.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 111, 30));

        getContentPane().add(Ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));

        menres.setText("Reservar");

        Resypro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Resypro.setText("Reservas y productos");
        Resypro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResyproActionPerformed(evt);
            }
        });
        menres.add(Resypro);

        menubar.add(menres);

        menadd.setText("Añadir");

        addhab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addhab.setText("Habitación");
        addhab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhabActionPerformed(evt);
            }
        });
        menadd.add(addhab);

        addprod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addprod.setText("Producto");
        addprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprodActionPerformed(evt);
            }
        });
        menadd.add(addprod);

        addcli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addcli.setText("Cliente");
        addcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcliActionPerformed(evt);
            }
        });
        menadd.add(addcli);

        menubar.add(menadd);

        Usuarios.setText("Configurar");

        Usu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Usu.setText("Usuarios");
        Usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuActionPerformed(evt);
            }
        });
        Usuarios.add(Usu);

        menubar.add(Usuarios);

        Close.setText("Salir");

        CerrarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CerrarS.setText("Cerrar Sesión");
        CerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSActionPerformed(evt);
            }
        });
        Close.add(CerrarS);

        CerrarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CerrarP.setText("Cerrar Programa");
        CerrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarPActionPerformed(evt);
            }
        });
        Close.add(CerrarP);

        menubar.add(Close);

        setJMenuBar(menubar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcliActionPerformed
        // Codigos necesarios para mostrar la subventana de clientes en la interfaz
        addCliente clientes = new addCliente();
        Ventana.add(clientes, new AbsoluteConstraints(0,0,-1,-1));
        clientes.show();
    }//GEN-LAST:event_addcliActionPerformed

    private void UsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuActionPerformed
        // Codigos necesarios para mostrar la subventana de usuarios en la interfaz
        Usuarios usuarios = new Usuarios();
        Ventana.add(usuarios, new AbsoluteConstraints(0,0,-1,-1));
        usuarios.show();
    }//GEN-LAST:event_UsuActionPerformed

    private void CerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSActionPerformed
        // Se notifica al usuario que se cerrara la sesion
        JOptionPane.showMessageDialog(null, "FINALIZANDO LA SESION ACTUAL","SESION CERRADA", JOptionPane.INFORMATION_MESSAGE);

        // Codigos necesarios para mostrar la ventana de login y cerrar el menu principal
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSActionPerformed

    private void CerrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarPActionPerformed
        // Se cierra la ventana y finaliza la ejecucion
        System.exit(0);     
    }//GEN-LAST:event_CerrarPActionPerformed

    private void addhabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhabActionPerformed
        // Codigos necesarios para mostrar la subventana de habitaciones en la interfaz
        addHabitacion habitacion = new addHabitacion();
        Ventana.add(habitacion, new AbsoluteConstraints(0,0,-1,-1));
        habitacion.show();
    }//GEN-LAST:event_addhabActionPerformed

    private void addprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprodActionPerformed
        // Codigos necesarios para mostrar la subventana de productos en la interfaz
        addProducto producto = new addProducto();
        Ventana.add(producto, new AbsoluteConstraints(0,0,-1,-1));
        producto.show();
    }//GEN-LAST:event_addprodActionPerformed

    private void ResyproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResyproActionPerformed
        // Codigos necesarios para mostrar la subventana de reservaciones en la interfaz
        Reservacion reservacion = new Reservacion();
        Ventana.add(reservacion, new AbsoluteConstraints(0,0,-1,-1));
        reservacion.show();
    }//GEN-LAST:event_ResyproActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Calculadora cal = new Calculadora();
        cal.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Ganancias vent = new Ganancias();
      vent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz(rolRec, recID).setVisible(true);
            }
        });
    }
    
     // Metodo derivado de la implementacion de Runnable
    public void run()
    {
        // Se instancia un nuevo thread
        Thread ct = Thread.currentThread();
        while(ct == dateTime)           // Se analiza si el thread es igual al constructor de dateTime
        {   
            calcDateTime();             // Se ejecuta el metodo calcDateTime para calcular la fecha
        try 
        {
            Thread.sleep(1000);         // El programa se espera 1 segundo en volver a ejecutarse
        }
        catch(InterruptedException e) {}
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarP;
    private javax.swing.JMenuItem CerrarS;
    private javax.swing.JMenu Close;
    private javax.swing.JMenuItem Resypro;
    private javax.swing.JMenuItem Usu;
    private javax.swing.JMenu Usuarios;
    private javax.swing.JDesktopPane Ventana;
    private javax.swing.JMenuItem addcli;
    private javax.swing.JMenuItem addhab;
    private javax.swing.JMenuItem addprod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu menadd;
    private javax.swing.JMenu menres;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    // End of variables declaration//GEN-END:variables


        // Metodo calcDateTime para determinar la fecha y hora del dispositivo
    private void calcDateTime()
    {
        DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");            // Se establece un nuevo formato para la hora
        String time = timeFormat.format(Calendar.getInstance().getTime());      // Se instancia un nuevo objeto para obtener la fecha actual del dispositivo
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");             // Se establece un nuevo formato para la fecha, de forma en que se presenten los ultimos 2 digitos del año, el numero de mes y numero de dia
        String date = dateFormat.format(Calendar.getInstance().getTime());      // Se instancia un nuevo objeto para obtener la fecha actual del dispositivo
        
        // Se asigna la fecha y hora a los apartados necesarios
        txtHora.setText(time);
        txtFecha.setText(date);
        
    }
}
