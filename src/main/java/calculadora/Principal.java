
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    
    public boolean Validacion (){//falso si contiene caracteres invalidos y verdadero si tiene un entero
        
        int n1, n2;
        
        try{
            n1 = Integer.parseInt(numero1.getText());//el Interger.parseInt()es para convertir en entero
            n2 = Integer.parseInt(numero2.getText());
            return true;
        }
   
        catch(Exception e){
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        SUMA = new javax.swing.JButton();
        MULTIPLICACION = new javax.swing.JButton();
        DIVISION = new javax.swing.JButton();
        RESTA = new javax.swing.JButton();
        RESULTADO = new javax.swing.JLabel();
        LIMPIAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        SUMA.setText("+");
        SUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMAActionPerformed(evt);
            }
        });

        MULTIPLICACION.setText("x");
        MULTIPLICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLICACIONActionPerformed(evt);
            }
        });

        DIVISION.setText("/");
        DIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVISIONActionPerformed(evt);
            }
        });

        RESTA.setText("-");
        RESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTAActionPerformed(evt);
            }
        });

        RESULTADO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        RESULTADO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RESULTADO.setText("0");

        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SUMA)
                            .addComponent(MULTIPLICACION))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RESTA)
                            .addComponent(DIVISION))
                        .addGap(98, 98, 98))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RESULTADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LIMPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MULTIPLICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(RESULTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void MULTIPLICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLICACIONActionPerformed
      
        if(Validacion() ==true){
            
            int resultado;
            
            resultado = Integer.parseInt(numero1.getText()) * Integer.parseInt(numero2.getText());
            
            RESULTADO.setText(String.valueOf(resultado));
        }
        
        else{
            
            JOptionPane.showMessageDialog(null,"Alguno de los valores digitados son erroneos");            
            
        }      
    }//GEN-LAST:event_MULTIPLICACIONActionPerformed

    private void DIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVISIONActionPerformed
      
        if(Validacion() ==true){
            
            int resultado;
            
            resultado = Integer.parseInt(numero1.getText()) / Integer.parseInt(numero2.getText());
            
            RESULTADO.setText(String.valueOf(resultado));
        }
        
        else{
            
            JOptionPane.showMessageDialog(null,"Alguno de los valores digitados son erroneos");            
            
        }      
    }//GEN-LAST:event_DIVISIONActionPerformed

    private void RESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTAActionPerformed
    
        if(Validacion() ==true){
            
            int resultado;
            
            resultado = Integer.parseInt(numero1.getText()) - Integer.parseInt(numero2.getText());
            
            RESULTADO.setText(String.valueOf(resultado));
        }
        
        else{
            
            JOptionPane.showMessageDialog(null,"Alguno de los valores digitados son erroneos");            
            
        }      
         
            
    }//GEN-LAST:event_RESTAActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
     
        numero1.setText(null);
        
        numero2.setText(" ");
        
        
        RESULTADO.setText("0");     
             
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void SUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMAActionPerformed
 
        if(Validacion() ==true){
            
            int resultado;
            
            resultado = Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText());
            
            RESULTADO.setText(String.valueOf(resultado));
        }
        
        else{
            
            JOptionPane.showMessageDialog(null,"Alguno de los valores digitados son erroneos");            
            
        }        
        
    }//GEN-LAST:event_SUMAActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DIVISION;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton MULTIPLICACION;
    private javax.swing.JButton RESTA;
    private javax.swing.JLabel RESULTADO;
    private javax.swing.JButton SUMA;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    // End of variables declaration//GEN-END:variables
}
