/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author vittorio
 */
public class ico_Settings implements Icon{
    String[] Backgrounds =  {"AzuIco1.png"};
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("/Iconos/"+Backgrounds[0])).getImage();
        //g.drawImage(image, x, y, c);
        g.drawImage(image, x, y, 25, 25, c);
    }

    @Override
    public int getIconWidth() {
        return 25;
    }

    @Override
    public int getIconHeight() {
        return 25;
    }
}
