package des;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.Accessible;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser4 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mensajeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        claveTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cifradoTxt = new javax.swing.JComboBox<>();
        cifrarBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rutaTxt = new javax.swing.JTextField();
        seleccionarBtn = new javax.swing.JButton();
        descifrarBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cifrar");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel2.setText("Mensaje");

        mensajeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel5.setText("Clave");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel4.setText("Cifrado");

        cifradoTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DES", "AES-128", "AES-192", "AES-256" }));
        cifradoTxt.setKeySelectionManager(null);
        cifradoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifradoTxtActionPerformed(evt);
            }
        });

        cifrarBtn.setText("Cifrar");
        cifrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descifrar");

        rutaTxt.setEditable(false);

        seleccionarBtn.setText("Seleccionar Archivo");
        seleccionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarBtnActionPerformed(evt);
            }
        });

        descifrarBtn.setText("Descifrar");
        descifrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(cifradoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cifrarBtn))
                            .addComponent(claveTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccionarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descifrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cifradoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cifrarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seleccionarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descifrarBtn)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cifradoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifradoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cifradoTxtActionPerformed
    Path ruta;
    CifradoAES cifrador = new CifradoAES();
    private void seleccionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarBtnActionPerformed
        //Desplegar el selector de archivos
        JFileChooser selector = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "txt");
        selector.setFileFilter(filtro);
        int returnVal = selector.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("ARCHIVO SELECCIONADO: " + selector.getSelectedFile().getPath());
            ruta = Paths.get(selector.getSelectedFile().getPath());
            rutaTxt.setText(selector.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_seleccionarBtnActionPerformed

    private void cifrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarBtnActionPerformed
        String mensaje = "", clave = "", cifrado = "", mensajeCifrado = "";

        //Obtener los componentes
        mensaje = mensajeTxt.getText();
        clave = claveTxt.getText();
        cifrado = cifradoTxt.getSelectedItem().toString();
        //Verificar que ninguno esté vacio
        if ("".equals(mensaje) || "".equals(clave) || "".equals(cifrado)) {
            JOptionPane.showMessageDialog(null, "Favor de introducir todos los datos");
        } else {
            clave = cifrador.AdaptarLlave(clave);
            if (cifrador.ValidarLlave(clave, cifrado)) {
                //Imprimir los datos
                System.out.println("TIPO DE CIFRADO: " + cifrado);
                System.out.println("MENSAJE: " + mensaje);
                System.out.println("CLAVE: " + clave);
                switch (cifrado) {
                    case "DES":
                        break;
                    default:
                        mensajeCifrado = cifrador.CifrarAES(clave, mensaje);
                        System.out.println("MENSAJE CIFRADO: " + mensajeCifrado);
                         {
                            try {
                                System.out.println(cifrador.DescifrarAES(clave, mensajeCifrado));
                            } catch (NoSuchAlgorithmException ex) {
                                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (NoSuchPaddingException ex) {
                                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                try {
                    cifrador.EscribirArchivo(clave, mensajeCifrado, cifrado);
                } catch (IOException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Favor de introducir una clave valida para el tipo de dato cifrado");
            }
        }

    }//GEN-LAST:event_cifrarBtnActionPerformed

    private void descifrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarBtnActionPerformed
        String clave = "";
        try {
            clave = cifrador.AdaptarLlave(clave);

            String mensajeCifrado = "", mensajeOriginal = "prueba", XD = "";
            cifrador.LeerArchivo(ruta);
            clave = cifrador.getdClave();
            mensajeCifrado = cifrador.getdMensajeCifrado();
            System.out.println("CLAVE:  " + clave);
            System.out.println("MENSAJE CIFFRADO: " + mensajeCifrado);
            try {
                XD = cifrador.CifrarAES(clave, XD);
                mensajeOriginal = cifrador.DescifrarAES(clave, mensajeCifrado);
                System.out.println(mensajeOriginal);
                cifrador.EscribirArchivoDescifrado(mensajeOriginal);
                JOptionPane.showMessageDialog(null, "Archivo Descifrado");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Mensaje Descifrado: " + mensajeOriginal);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            JOptionPane.showMessageDialog(null, "Selecciona un archivo valido");
        }
    }//GEN-LAST:event_descifrarBtnActionPerformed

    private void mensajeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeTxtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cifradoTxt;
    private javax.swing.JButton cifrarBtn;
    private javax.swing.JTextField claveTxt;
    private javax.swing.JButton descifrarBtn;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JFileChooser jFileChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mensajeTxt;
    private javax.swing.JTextField rutaTxt;
    private javax.swing.JButton seleccionarBtn;
    // End of variables declaration//GEN-END:variables
}
