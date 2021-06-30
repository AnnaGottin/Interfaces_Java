/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author vittorio
 */
public class BackGrouds {
    ArrayList bg_Names;

    public BackGrouds() {
        this.bg_Names = new ArrayList();
    }

    public ArrayList getBg_Names() {
        return bg_Names;
    }

    public void setBg_Names(String bg_Names) {
        this.bg_Names.add(bg_Names);
    }
    
    
}
