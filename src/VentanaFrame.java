
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

/*
 * Creamos un paint!!
*/

/**
 *
 * @author adrianmunoz
 */
public class VentanaFrame extends javax.swing.JFrame {

    // esta variable es para optimizar la imagen
    BufferedImage buffer = null;
    
    
    public VentanaFrame() {
        initComponents();
        // creamos un metodo para inicializar 
        inicializaBuffers();
    }
    // metodo para crear una imagen del mismo ancho y alto que el lienzo
    private void inicializaBuffers(){
        
        buffer = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        // una vez declarada le indicamos que cree una imagen, con trozos de a memoria
        // creo una imagen modificable "G2"
        Graphics2D g2 = buffer.createGraphics();
        // dibujamos un rectangulo blanco del tamaño del lienzo en color blanco
        g2.setColor(Color.white);
        // creamoz un rectangulo en la posicion 0,0
        g2.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
        // apuntamos al lienzo, para "castear" se pone el metodo al que lo quieres convertir entre 
        // parentesis antes del objeto que se va a convertir
      
        //g2 = (Graphics2D) lienzo.getGraphics();
        //g2.drawImage(buffer, 0, 0, null);
    }
    //@override sirve para poder modificar la superclase, en este caso paint de una clase superior
    // sobrescribiendo parametros
    @Override
    // sobrescribimos el metodo paint() para que tenga modificaciones que necesitamos en un futuro
    public void paint(Graphics g){
       // se añade super para ejecutar el codigo del metodo paint de la clase superior "jFrame"
       // garantiza que funcione como antes 
     super.paint(g);
     // creamos variable
     
     Graphics2D g2 = (Graphics2D) lienzo.getGraphics();
       
     g2.drawImage(buffer, 0, 0, null);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
}
