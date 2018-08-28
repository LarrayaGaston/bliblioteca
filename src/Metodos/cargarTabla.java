/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import Clases.Autor;
import Clases.alumno;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gaston
 */
public class cargarTabla {
    
    public JTable cargar_tabla_autor(JTable miTabla, Autor [] miAutor, String titulos[]){
        
        DefaultTableModel ObjTabla = new DefaultTableModel(); // Creamos el obj tabla
        
        ObjTabla.setColumnCount(0);  // ponemos las columnas en cero
        ObjTabla.setRowCount(0);    // ponemos las filas en 0
        ObjTabla.setColumnIdentifiers(titulos);  // se le asignan los titulos a la tabla 
        
        miTabla.setModel(ObjTabla);
        
        String datos [] = new String[titulos.length];
        
        for(int i=0; i<miAutor.length; i++ ){
            
            datos[0]= String.valueOf(miAutor[i].getIdautor());
            datos[1]= (miAutor[i].getNombre_autor());
            datos[2]= (miAutor[i].getApellido_autor());
            datos[3]= (miAutor[i].getNacionalidad());
            
            ObjTabla.addRow(datos);
        
        }
        
       
       return miTabla;
    }
    
    public JTable cargar_tabla_alumno(JTable miTabla, alumno [] miAlumno, String titulos[]){
        
        DefaultTableModel ObjTabla = new DefaultTableModel(); // Creamos el obj tabla
        
        ObjTabla.setColumnCount(0);  // ponemos las columnas en cero
        ObjTabla.setRowCount(0);    // ponemos las filas en 0
        ObjTabla.setColumnIdentifiers(titulos);  // se le asignan los titulos a la tabla 
        
        miTabla.setModel(ObjTabla);
        
        String datos [] = new String[titulos.length];
        
        for(int i=0; i<miAlumno.length; i++ ){
            
            datos[0]= String.valueOf(miAlumno[i].getIdalumno());
            datos[1]= (miAlumno[i].getNombre_alumno());
            datos[2]= (miAlumno[i].getDireccion());
            datos[3]= String.valueOf(miAlumno[i].getIdcurso());
            
            datos[4]= String.valueOf(miAlumno[i].getIdturno());
            datos[5]= String.valueOf(miAlumno[i].getFechadenacimiento());
            datos[6]= String.valueOf(miAlumno[i].getDni());
            datos[7]= (miAlumno[i].getEmail());
            
            
            
            ObjTabla.addRow(datos);
        
        }
        
       
       return miTabla;
    }
    
     
    
}
