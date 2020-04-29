/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kieran
 */
public class GUIUtility {
    static public boolean emptyInputValidation(JInternalFrame iframe)
    {
        boolean isEmpty = false;
        Component components[] = iframe.getContentPane().getComponents();
        for(int i =0; i< components.length;i++)
        {
            Component c = components[i];
            if(c instanceof JTextField)
            {
                JTextField textfield = (JTextField)c;
                if(textfield.getText().length()==0)
                {
                    isEmpty = true;
                    JOptionPane.showMessageDialog(iframe, "Please enter the value for "+textfield.getName());
                }
            }
        }
        return isEmpty;
    }
}
