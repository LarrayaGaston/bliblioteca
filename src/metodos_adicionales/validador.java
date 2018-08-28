/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_adicionales;

/**
 *
 * @author Usuario
 */
public class validador {

    public validador() {
    }
    
    public boolean validarletras(java.awt.event.KeyEvent evt){
        
        char c;
        c=evt.getKeyChar();
        if(Character.isDigit(c)==false)   //Character tiene muchos metodos, uno de ellos es saber si lo cargado es digito.
            {    
             return false;
            }
        else
            {
             return true;
            }
    }
}
