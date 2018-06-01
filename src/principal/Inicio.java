/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;
//import javax.swing.*;
//import javax.swing.UIManager.*;
import vista.Index;
//import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

/**
 *
 * @author dyjho
 */
public class Inicio {

    public static void main(String[] args) {
        //synt theme
        /*
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        Index prin = new Index();
        prin.setVisible(true);
        
    }
    
}
