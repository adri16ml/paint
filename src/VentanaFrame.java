
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

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
    
   // creamos el segundo buffer para no eliminar el primer objeto que se ha dibujado
     BufferedImage buffer2 = null;
    
    
    Circulo auxiliar;
 
    
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
        
        //inicializo el segundo buffer que se llama buffer2
        buffer2 = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        // una vez declarada le indicamos que cree una imagen, con trozos de a memoria
        // creo una imagen modificable "G2"
        g2 = buffer2.createGraphics();
        // dibujamos un rectangulo blanco del tamaño del lienzo en color blanco
        g2.setColor(Color.white);
        // creamoz un rectangulo en la posicion 0,0
        g2.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
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

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lienzo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

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

        jButton1.setText("COLOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
    
        auxiliar = new Circulo(evt.getX(),evt.getY(),1, Color.GREEN, true );
        // para que se vea la imagen hay que dibujar sobre el buffer 
        // apunta al objeto al que voy a hacer el dibujo
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        // para que el objeto se complete 
        auxiliar.dibujate(g2);
        // hay que utilizar un metodo para dibujar el objeto en la pantalla
        // 0,0 son cordenadas y el 1,1 es el ancho y algo 
        repaint(0,0,1,1);
        
    }//GEN-LAST:event_lienzoMousePressed

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
      
        // se cambia lienzo por buffer
     Graphics2D g2 = (Graphics2D) buffer.getGraphics();
     // borro lo que hubiera en el lienzo
     //g2.setColor(Color.white);
      g2.drawImage(buffer2, 0, 0, null);
     //g2.fillRect(0, 0, getWidth(), getHeight());
        
       // añadimos el metodo M.Dragged para que al arrastrar el cursor se aumente
       // el tamaño del objeto que esta dibujando hasta que soltemos el raton
       int radio = Math.abs ((int) auxiliar.x - evt.getX());
       // math.abs es valor absoluto para que no de error al ser un valor negativo
       auxiliar.width = radio;
       auxiliar.height = radio;
       
      auxiliar.dibujate(g2);
       
       g2 = (Graphics2D) buffer.getGraphics();
       
       g2.drawImage(buffer, 0, 0, null);
       
       repaint(0,0,1,1);
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        // evento que actua al soltar el click del raton 
        Graphics2D g2 = (Graphics2D) buffer2.getGraphics();
        
        auxiliar.dibujate(g2);
    }//GEN-LAST:event_lienzoMouseReleased

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
}
