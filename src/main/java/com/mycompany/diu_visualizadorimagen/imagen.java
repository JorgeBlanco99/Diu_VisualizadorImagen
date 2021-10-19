/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_visualizadorimagen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import static utils.UtilsImagen.*;

/**
 *
 * @author jorge
 */
public class imagen  extends JPanel{
    private BufferedImage imagen = null;
    private BufferedImage logo = null;
    private BufferedImage copia = null;
    private Graphics g;
    
    private int x = 0;
    private int y = 0;

    public imagen () {
        try {
            imagen = ImageIO.read(new URL("https://etcanada.com/wp-content/uploads/2016/09/astley.jpg?quality=80&strip=all&w=720&h=480&crop=1"));
            logo = ImageIO.read(new URL("https://i.imgur.com/uxi7KBj.png"));
            copia = imagen;
            this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        g.drawImage(logo, x, y, null);
    }
    
    public void setCordenadas(int x, int y) {
        this.x = x;
        this.y = y;
        this.repaint();
    }
    
    public void capas(boolean rojo, boolean verde, boolean azul) {
        imagen = seleccionarComponentes(copia,rojo,verde,azul);        
        this.repaint();
    }
   
}
