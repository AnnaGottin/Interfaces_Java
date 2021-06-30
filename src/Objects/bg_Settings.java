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
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author vittorio
 */
public class bg_Settings implements Icon {
    String[] Backgrounds =  {"bg_0001.jpg","bg_0002.jpg","bg_0003.jpg","bg_0004.png","bg_0005.png","bg_0006.png",
    "bg_0007.jpg","bg_0008.jpg","bg_0009.jpg","bg_0010.jpg","bg_0011.jpg"};
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Random Rand = new Random();
        int Num = Rand.nextInt(Backgrounds.length - 1);
        Image image = new ImageIcon(getClass().getResource("/LoadScreen/"+Backgrounds[Num])).getImage();
        
        //g.drawImage(image, x, y, c);
        g.drawImage(image, x, y, screenSize.width, screenSize.height, c);
    }

    @Override
    public int getIconWidth() {
        return screenSize.width;
    }

    @Override
    public int getIconHeight() {
        return screenSize.height;
    }
}
