/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.eliminardocumentos;

import datosbd.Conexion;
import datosbd.ReposteriaGrupal;
import gui.crearclase.InterfazClase;
import gui.tarea.InicioDocente;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jessica Trujillo
 */
public class Archivos extends javax.swing.JFrame {
String ID;
    /**
     * Creates new form Archivos
     */
    public Archivos() {
        initComponents();
        Conexion.conectarFirebase();
        //initComponents();
        this.setLocationRelativeTo(null);
         ArchivosProvider.cargarTablaArchivos(jTableArchivo);
        txtID.setEnabled(false);
        
    }
    /*
    private void crear() {
        int id = (int) (Math.random() * 100000);
        
        try {
            Map<String, Object> datosTarea = new HashMap<>();
            datosTarea.put("SELCCIONE ARCHIVOS", txtNombre.getText());
            datosTarea.put("ESCRIBIR ARCHIVOS", txtarchivos.getText());
            //datosTarea.put("Adjuntar", "");
            
            TareaProvider.crearTarea("Tarea", String.valueOf(id), datosTarea);
            JOptionPane.showMessageDialog(null, "Se creó la tarea");
            borrarCampos();
        }catch(HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }
    */
    private void borrarCampos() {
        txtNombre.setText("");
        txtarchivos.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarchivos = new javax.swing.JTextArea();
        txtcrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableArchivo = new javax.swing.JTable();
        txtcrear1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 255, 255));

        panel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("ARCHIVOS");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(378, 378, 378))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRE\n");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("DESCRIPCION");

        txtarchivos.setColumns(20);
        txtarchivos.setRows(5);
        jScrollPane1.setViewportView(txtarchivos);

        txtcrear.setBackground(new java.awt.Color(0, 204, 255));
        txtcrear.setText("CREAR");
        txtcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcrearActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jTableArchivo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableArchivoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableArchivo);

        txtcrear1.setBackground(new java.awt.Color(0, 204, 255));
        txtcrear1.setActionCommand("ACTUALIZAR");
        txtcrear1.setLabel("ACTUALIZAR");
        txtcrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcrear1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setLabel("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtcrear)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)
                        .addGap(106, 106, 106)
                        .addComponent(txtcrear1)
                        .addGap(108, 108, 108)
                        .addComponent(jButton3)
                        .addGap(102, 102, 102)
                        .addComponent(jButton2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                    .addComponent(txtNombre))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtcrear)
                    .addComponent(txtcrear1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        jMenu1.setText("File");

        jMenu3.setText("OPEN");

        jMenuItem1.setText("Seleccionar Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcrearActionPerformed
        crear();
       /* String nombreArchivo = txtNombre.getText();
      String carpeta = System.getProperty("user.dir");
      String direccionCompleta = carpeta + "/" + nombreArchivo + ".txt";
      FileWriter ubicacion = null;
      try{
          ubicacion = new FileWriter(direccionCompleta);}
       catch (IOException ex){
          Logger.getLogger(ReposteriaGrupal.class.getName()).log(Level.SEVERE,null,ex);
      } try{
          BufferedWriter escritor  = new BufferedWriter(ubicacion);
          escritor.write(txtarchivos.getText());
          escritor.close();
      }catch(Exception ex){
      
      }  */ // TODO add your handling code here:
    }//GEN-LAST:event_txtcrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Limpiar();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtcrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcrear1ActionPerformed
       actualizararchivos(); // TODO add your handling code here:
    }//GEN-LAST:event_txtcrear1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminararchivos();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableArchivoMouseClicked
      int seleccion =jTableArchivo.getSelectedRow();
      txtID.setText(jTableArchivo.getValueAt(seleccion, 0)+"");
      txtNombre.setText(jTableArchivo.getValueAt(seleccion, 1)+"");
      txtarchivos.setText(jTableArchivo.getValueAt(seleccion, 2)+"");
             // TODO add your handling code here:
    }//GEN-LAST:event_jTableArchivoMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser filechoose=new JFileChooser();
       int opcion=filechoose.showOpenDialog(this);
       if(opcion==JFileChooser.APPROVE_OPTION){
       String nombre_archivo=filechoose.getSelectedFile().getName(); //// Obtener el nombre archivo
       String ruta=filechoose.getSelectedFile().getPath();
       
       txtNombre.setText(nombre_archivo);// setear 
       txtarchivos.setText(ruta);
       }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new InicioDocente().setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableArchivo;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtarchivos;
    private javax.swing.JButton txtcrear;
    private javax.swing.JButton txtcrear1;
    // End of variables declaration//GEN-END:variables

 private void Limpiar() {
        txtNombre.setText("");
        txtarchivos.setText("");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 }
 public void crear(){
  int id = (int) (Math.random() * 100000);

        try {

            Map<String, Object> datos = new HashMap<>();
            datos.put("Nombre", txtNombre.getText());
            datos.put("Descripcion", txtarchivos.getText());
            

            ArchivosProvider.guardaArchivos("Archivos", String.valueOf(id), datos);
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            clearForm();
        } catch (HeadlessException e) {
            System.err.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally{
            ArchivosProvider.cargarTablaArchivos(jTableArchivo);
        }
    }

      private void actualizararchivos() {
          String idDoc =txtID.getText();
          
          try {

            Map<String, Object> datos = new HashMap<>();
            datos.put("Nombre", txtNombre.getText());
            datos.put("Descripcion", txtarchivos.getText());
            

            ArchivosProvider.actualizarArchivos("Archivos",idDoc, datos);
            JOptionPane.showMessageDialog(null, "Actualizado con éxito");
            clearForm();
        } catch (HeadlessException e) {
            System.err.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally{
            ArchivosProvider.cargarTablaArchivos(jTableArchivo);
        }
      }
    
    void clearForm(){
        txtNombre.setText("");
        txtarchivos.setText("");
        txtID.setText("");
       
    }

    private void eliminararchivos() {
        String idDoc =txtID.getText();
         try {
            ArchivosProvider.eliminarArchivos("Archivos", idDoc);
            JOptionPane.showMessageDialog(null, "Eliminado con éxito");
            clearForm();
        } catch (HeadlessException e) {
            System.err.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
        finally{
            ArchivosProvider.cargarTablaArchivos(jTableArchivo);
        }
    }

  
    }
