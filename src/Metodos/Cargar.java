/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import Clases.estado_libro;
import Clases.nivel_bibliografico;
import Clases.nivel_institucional;
import Clases.tipo_registro;
import javax.swing.DefaultComboBoxModel;
import metodos_adicionales.JItem;

/**
 *
 * @author Gaston
 */
public class Cargar {
    
    public DefaultComboBoxModel cargar_combo_estadoLibro (DefaultComboBoxModel MiObjCombo, estado_libro [] miEstadoL){
        
         for(int i=0; i<miEstadoL.length; i++)
            {
                JItem miJItem = new JItem();
               
                miJItem.setItemData(miEstadoL[i].getIdEstadoconservacion());
                miJItem.setItem(miEstadoL[i].getNombrestadoconservacion());
                
                MiObjCombo.addElement(miJItem);
                
              
            }
         
         return MiObjCombo;
    }
    
     public DefaultComboBoxModel cargar_combo_NBibliografico (DefaultComboBoxModel MiObjCombo, nivel_bibliografico [] miNivelB){
        
         for(int i=0; i<miNivelB.length; i++)
            {
                JItem miJItem = new JItem();
               
                miJItem.setItemData(miNivelB[i].getIdNivelbibliografico());
                miJItem.setItem(miNivelB[i].getNombreivelbibliografico());
                
                MiObjCombo.addElement(miJItem);
                
              
            }
         
         return MiObjCombo;
    }
     
      public DefaultComboBoxModel cargar_combo_NInstitucional (DefaultComboBoxModel MiObjCombo, nivel_institucional [] miNivelInst){
        
         for(int i=0; i<miNivelInst.length; i++)
            {
                JItem miJItem = new JItem();
               
                miJItem.setItemData(miNivelInst[i].getIdNivelinstitucional());
                miJItem.setItem(miNivelInst[i].getNombrenivelinstitucional());
                
                MiObjCombo.addElement(miJItem);
                
              
            }
         
         return MiObjCombo;
    }
      
       public DefaultComboBoxModel cargar_combo_tipoRegistro (DefaultComboBoxModel MiObjCombo, tipo_registro [] miTipoRegistro){
        
         for(int i=0; i<miTipoRegistro.length; i++)
            {
                JItem miJItem = new JItem();
               
                miJItem.setItemData(miTipoRegistro[i].getIdTiporegistro());
                miJItem.setItem(miTipoRegistro[i].getNombretiporegistro());
                
                MiObjCombo.addElement(miJItem);
                
              
            }
         
         return MiObjCombo;
    }
}
    

