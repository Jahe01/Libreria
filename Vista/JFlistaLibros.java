
package Vista;

import Negocio.Libro;
import Negocio.Fecha;
import Negocio.ListaLibros;
import javax.swing.JOptionPane;

/**
 *
 * @author johanna.huaraca
 */
public class JFlistaLibros extends javax.swing.JFrame {
public ListaLibros listaLibros;
public Libro libro;
 private String salida,salida1,salida2;
    public JFlistaLibros() {
        initComponents();
        this.setLocationRelativeTo(this);
        listaLibros=new ListaLibros();
        this.jComboBox1.setVisible(false);
        this.jLabel8.setVisible(false);
        this.jTextArea1.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFAutor = new javax.swing.JTextField();
        jTFFechaPublicacion = new javax.swing.JTextField();
        jTFFechaNacimiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Costo = new javax.swing.JLabel();
        jTFCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTALibro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAListaLibros = new javax.swing.JTextArea();
        jBAceptar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de datos del libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel1.setText("Autor");

        jTFAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAutorActionPerformed(evt);
            }
        });
        jTFAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAutorKeyTyped(evt);
            }
        });

        jTFFechaPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaPublicacionActionPerformed(evt);
            }
        });
        jTFFechaPublicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFFechaPublicacionKeyTyped(evt);
            }
        });

        jTFFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaNacimientoActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Publicación");

        jLabel3.setText("Fecha nacimiento");

        Costo.setText("Costo$");

        jTFCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCostoActionPerformed(evt);
            }
        });
        jTFCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCostoKeyTyped(evt);
            }
        });

        jLabel5.setText("(dd/mm/aaaa)");

        jLabel6.setText("(dd/mm/aaaa)");

        jLabel4.setText("Título");

        jTFTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTituloActionPerformed(evt);
            }
        });
        jTFTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTituloKeyTyped(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/Opera Captura de pantalla_2021-12-23_190455_www.google.com.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro más Antiguo", "Libro más Nuevo", "Libro más Económico", "Libro más Caro", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(Costo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFFechaNacimiento)
                            .addComponent(jTFFechaPublicacion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Costo))
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTALibro.setEditable(false);
        jTALibro.setColumns(20);
        jTALibro.setRows(5);
        jTALibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(jTALibro);

        jTAListaLibros.setEditable(false);
        jTAListaLibros.setColumns(20);
        jTAListaLibros.setRows(5);
        jTAListaLibros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jScrollPane2.setViewportView(jTAListaLibros);

        jBAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/Opera Captura de pantalla_2021-12-23_235128_www.google.com.png"))); // NOI18N
        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/Opera Captura de pantalla_2021-12-23_235404_www.google.com.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/Opera Captura de pantalla_2021-12-23_235605_www.google.com.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jBAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jBNuevo)
                .addGap(98, 98, 98)
                .addComponent(jBSalir)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
       this.jComboBox1.setVisible(true);
       this.jLabel8.setVisible(true);
      
       String salida1=" ";
       String salida2=" ";
       
       
       String input1 = this.jTFAutor.getText();
       String Autor = input1.substring(0, 1).toUpperCase() + input1.substring(1).toLowerCase();
    
       String input2 = this.jTFTitulo.getText();
       String Titulo = input2.substring(0, 1).toUpperCase() + input2.substring(1).toLowerCase();
       
       Fecha fechanacimientoAux=new Fecha(this.jTFFechaNacimiento.getText());
       Fecha fechapublicacionAux=new Fecha(this.jTFFechaPublicacion.getText());
       Libro libroAux= new Libro(Autor,Titulo,
            Double.parseDouble(this.jTFCosto.getText()),fechanacimientoAux,fechapublicacionAux);
        
            salida1+=libroAux.toString();
            listaLibros.addLibro(libroAux);
            salida2+=listaLibros.toString();
            this.jTALibro.setText(salida1);
            this.jTAListaLibros.setText(salida2);
        
         if(fechanacimientoAux.validarFecha(fechanacimientoAux)==false){ //validamos los años bisciestos
          this.jTFFechaNacimiento.setText("");
          this.jTALibro.setText("");
          listaLibros.returnLibro(libroAux);
          this.jTAListaLibros.setText("");
          JOptionPane.showMessageDialog(null, "Fecha de nacimiento inválida");
          this.jComboBox1.setVisible(false);
          this.jLabel8.setVisible(false); 
         
         }
         
         if(fechapublicacionAux.validarFecha(fechapublicacionAux)==false){//validamos los años biciestos
          this.jTFFechaPublicacion.setText("");
          this.jTALibro.setText("");
          this.jTAListaLibros.setText("");
          listaLibros.returnLibro(libroAux);
          JOptionPane.showMessageDialog(null, "Fecha de ingreso inválida");
          this.jComboBox1.setVisible(false);
          this.jLabel8.setVisible(false);
          
         }
        
        if((libroAux.fechacorrecta(fechapublicacionAux, fechanacimientoAux))==true){
          //validar que no puede publicar antes de su nacimiento
          this.jTFFechaPublicacion.setText("");
          this.jTFFechaNacimiento.setText("");
          this.jTALibro.setText("");
          this.jTAListaLibros.setText("");
          listaLibros.returnLibro(libroAux);
          JOptionPane.showMessageDialog(null, "Fechas inválidas, porfavor revise");
          this.jComboBox1.setVisible(false);
          this.jLabel8.setVisible(false);
          
         }
        
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jTFFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaNacimientoActionPerformed
     this.jTFCosto.requestFocus();  
     this.jBAceptar.requestFocus();     
    }//GEN-LAST:event_jTFFechaNacimientoActionPerformed

    private void jTFFechaPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaPublicacionActionPerformed
     this.jBAceptar.requestFocus();
     this.jTFFechaNacimiento.requestFocus();       
    }//GEN-LAST:event_jTFFechaPublicacionActionPerformed

    private void jTFCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCostoActionPerformed
      this.jBAceptar.requestFocus();
    }//GEN-LAST:event_jTFCostoActionPerformed

    private void jTFAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAutorActionPerformed
     this.jTFTitulo.requestFocus(); 
     this.jBAceptar.requestFocus();
    }//GEN-LAST:event_jTFAutorActionPerformed

    private void jTFAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAutorKeyTyped
   char variablenom = evt.getKeyChar();
   if (Character.isDigit(variablenom)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo letras");
   }
    }//GEN-LAST:event_jTFAutorKeyTyped

    private void jTFCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCostoKeyTyped
        char variablecedula = evt.getKeyChar();
   if (Character.isLetter(variablecedula)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo números");
   }         
    }//GEN-LAST:event_jTFCostoKeyTyped

    private void jTFFechaPublicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFechaPublicacionKeyTyped
        
    }//GEN-LAST:event_jTFFechaPublicacionKeyTyped

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
          this.jTFFechaNacimiento.setText("");
          this.jTFTitulo.setText("");
          this.jTALibro.setText("");
          this.jTFCosto.setText("");
          this.jTFAutor.setText("");
          this.jTFFechaPublicacion.setText("");
          this.jComboBox1.setVisible(false);
          this.jLabel8.setVisible(false);
          this.jTextArea1.setVisible(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        salida=" ";
        
        switch(jComboBox1.getSelectedIndex()){
             case 0:{
                this.jTextArea1.setVisible(true);
                salida+="\n El libro mas antiguo es: "+listaLibros.libroAntiguo();
                break; }
            case 1:{
                this.jTextArea1.setVisible(true);
                salida+="\n El libro mas nuevo es: "+listaLibros.libroReciente();
                break;}
            case 2:{
               this.jTextArea1.setVisible(true);
               salida+="\n El libro mas económico es: "+listaLibros.Economico();
               break;}
             case 3:{ 
                this.jTextArea1.setVisible(true);
                salida+="\n El libro mas costoso es: "+listaLibros.Costoso();
                break;}
             
        }
        this.jTextArea1.setText(salida);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTFTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTituloKeyTyped
        char variablenom = evt.getKeyChar();
   if (Character.isDigit(variablenom)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(null, "Ingrese solo letras");
   }
    }//GEN-LAST:event_jTFTituloKeyTyped

    private void jTFTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTituloActionPerformed
       this.jTFFechaPublicacion.requestFocus();
       this.jBAceptar.requestFocus();
    }//GEN-LAST:event_jTFTituloActionPerformed

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
            java.util.logging.Logger.getLogger(JFlistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFlistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFlistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFlistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFlistaLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Costo;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTALibro;
    private javax.swing.JTextArea jTAListaLibros;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JTextField jTFCosto;
    private javax.swing.JTextField jTFFechaNacimiento;
    private javax.swing.JTextField jTFFechaPublicacion;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
