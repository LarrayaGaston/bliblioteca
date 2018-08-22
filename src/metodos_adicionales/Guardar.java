/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_adicionales;

import Clases.libro;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaston
 */
public class Guardar {
    
     public void GuardarLibro(libro miLibro){
      
        try{
            
            Conectar miConectar = new Conectar();
       
            
            String SentenciaInsert = ("INSERT into libros "+
                    "( idLibros, idtipoderegistro, nrodeinventarioanterior, idnivelbibliografico, "
                    + "idnivelinstitucional, isbn, issn, otrosindicadores, codigodeubicacion,"
                    + " procedencia, aniopublicacion, edicion, lugar, titulo, subtitulo, "
                    + "terminosdescriptivos, necesidadinterferencia, idanio, resumen, "
                    + "numerodeinventario, idestadoconservacion ) "+
                    "values "+
                    "( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )");
            miConectar.psPrepararSentencias = miConectar.miconexion.prepareStatement(SentenciaInsert);
       
           
            miConectar.psPrepararSentencias.setInt(1, miLibro.getIdLibros());
            miConectar.psPrepararSentencias.setInt(2, miLibro.getIdtipoderegistro());
            miConectar.psPrepararSentencias.setString(3,miLibro.getNrodeinventarioanterior());
            miConectar.psPrepararSentencias.setInt(4, miLibro.getIdnivelbibliografico());
           
            miConectar.psPrepararSentencias.setInt(5, miLibro.getIdnivelinstitucional());
            miConectar.psPrepararSentencias.setString(6, miLibro.getIsbn());
            miConectar.psPrepararSentencias.setString(7, miLibro.getIssn());
            miConectar.psPrepararSentencias.setString(8, miLibro.getOtrosindicadores()); 
            miConectar.psPrepararSentencias.setInt(9, miLibro.getIntcodigodeubicacion());
           
            miConectar.psPrepararSentencias.setInt(10, miLibro.getProcedencia());
            miConectar.psPrepararSentencias.setDate(11, miLibro.getAniopublicacion());
            miConectar.psPrepararSentencias.setString(12, miLibro.getEdicion());
            miConectar.psPrepararSentencias.setInt(13, miLibro.getLugar());
            miConectar.psPrepararSentencias.setString(14, miLibro.getTitulo());
            miConectar.psPrepararSentencias.setString(15, miLibro.getSubtitulo());
            
            miConectar.psPrepararSentencias.setInt(16, miLibro.getTerminosdescriptivos());
            miConectar.psPrepararSentencias.setInt(17, miLibro.getNecesidadinterferencia());
            miConectar.psPrepararSentencias.setInt(18, miLibro.getIdanio());
            miConectar.psPrepararSentencias.setString(19, miLibro.getResumen());
           
            miConectar.psPrepararSentencias.setString(20, miLibro.getNumerodeinventario());
            miConectar.psPrepararSentencias.setInt(21, miLibro.getIdestadoconservacion());
            
            
            
             
            
            miConectar.psPrepararSentencias.executeUpdate();
         
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error: "+e);
            
        }
    }
    
}
