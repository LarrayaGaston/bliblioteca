/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import Clases.estado_libro;
import Clases.necesidad_Intervencion;
import Clases.nivel_bibliografico;
import Clases.nivel_institucional;
import Clases.procedencia;
import Clases.tipo_registro;
import javax.swing.DefaultComboBoxModel;
import metodos_adicionales.JItem;

/**
 *
 * @author Gaston
 */
public class CargarCombo {
    
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
        public DefaultComboBoxModel cargar_combo_necesidadInterv (DefaultComboBoxModel MiObjCombo, necesidad_Intervencion [] miNecesidad){
        
         for(int i=0; i<miNecesidad.length; i++)
            {
                JItem miJItem = new JItem();
               
                miJItem.setItemData(miNecesidad[i].getIdNecesidadInt());
                miJItem.setItem(miNecesidad[i].getNecesidadinterferencia());
                
                MiObjCombo.addElement(miJItem);
                
              
            }
         
         return MiObjCombo;
    }
   
     public DefaultComboBoxModel cargar_combo_procencia (DefaultComboBoxModel MiObjCombo, procedencia [] miProcencia){
        
         for(int i=0; i<miProcencia.length; i++)
            {
                JItem miJItem = new JItem();
               
                miJItem.setItemData(miProcencia[i].getIdprocendia());
                miJItem.setItem(miProcencia[i].getNombre_procencia());
                
                MiObjCombo.addElement(miJItem);
                
              
            }
         
         return MiObjCombo;
    }
}
    

