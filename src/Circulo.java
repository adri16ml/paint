/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 *
 * @author adrianmunoz
 */
// creamos la clase ciruclo y le pasamos los primeros valores
public class Circulo extends Ellipse2D.Double{
    // creamos una variable para el color, dandole el valor nulo
    Color color = null;
    // creamos la variable booleana para el reyeno del objeto
    boolean relleno = false;
    
    public Circulo (int _posX, int _posY, int _radio, Color _color, boolean _relleno){
        // pasamos los valores de la posicion tamaño y el color
        this.x = _posX;
        this.y = _posY;
        this.width = _radio;
        this.height = _radio;
        this.color = _color;
        this.relleno = _relleno;
    }
    //creamos un metodo propio del circulo para que se dibuje
    public void dibujate( Graphics2D g2){
    
        // le pasamos el color
        g2.setColor(color);
        // creamos un if para colorear el circulo segun true/false
        if (relleno){
            g2.fill(this);
        }
        else { 
            g2.draw(this);
        }
}
}
