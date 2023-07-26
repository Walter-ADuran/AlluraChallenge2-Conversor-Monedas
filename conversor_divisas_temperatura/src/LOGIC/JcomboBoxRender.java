/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

import java.awt.Component;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author LpaqP
 */
public class JcomboBoxRender extends JLabel implements ListCellRenderer {

    Hashtable<Object,ImageIcon>miElemento;
    ImageIcon mImg = new ImageIcon(this.getClass().getResource("/img/american.png"));    

    public JcomboBoxRender(Hashtable<Object, ImageIcon> miElemento) {
        this.miElemento = miElemento;
    }
    
    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (miElemento.get(value)==null) {
            setIcon(mImg);
            
        }else{
            setIcon(miElemento.get(value));
        }
        setText(value.toString());
        return this;
    }
    
}
