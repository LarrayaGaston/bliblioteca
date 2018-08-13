/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_adicionales;

import Clases.estado_libro;
import Clases.nivel_bibliografico;
import Clases.nivel_institucional;
import Clases.tipo_registro;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaston
 */
public class Leer {
    
    public estado_libro [] leer_estado_libro(){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From estadoconservacion";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
             estado_libro miEstadoL[] = new estado_libro[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
                  miEstadoL[rs.getRow()-1]= new estado_libro();
                  
                 miEstadoL[rs.getRow()-1].setIdEstadoconservacion(rs.getInt("idEstadoconservacion"));
                 miEstadoL[rs.getRow()-1].setNombrestadoconservacion(rs.getString("nombrestadoconservacion"));
                  
              
              }
             
              
              rs.close();
              
              return miEstadoL;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }
    
     public  nivel_bibliografico []  leer_nivel_bibliografico(){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From nivelbibliografico";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
            nivel_bibliografico miNivelB[] = new nivel_bibliografico[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
                 miNivelB[rs.getRow()-1]= new nivel_bibliografico();
                  
               miNivelB[rs.getRow()-1].setIdNivelbibliografico(rs.getInt("idNivelbibliografico"));
                 miNivelB[rs.getRow()-1].setNombreivelbibliografico(rs.getString("nombreivelbibliografico"));
                  
              
              }
             
              
              rs.close();
              
              return miNivelB;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }
     
      public  nivel_institucional [] leer_nivel_institucional(){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From nivelinstitucional";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
           nivel_institucional miNivelInst[] = new nivel_institucional[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
                miNivelInst[rs.getRow()-1]= new nivel_institucional();
                  
              miNivelInst[rs.getRow()-1].setIdNivelinstitucional(rs.getInt("idNivelinstitucional"));
                miNivelInst[rs.getRow()-1].setNombrenivelinstitucional(rs.getString("nombrenivelinstitucional"));
                  
              
              }
             
              
              rs.close();
              
              return miNivelInst;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }
      
       public  tipo_registro [] leer_tipo_registro(){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From tiporegistro";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
          tipo_registro miTipoRegistro[] = new tipo_registro[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
               miTipoRegistro[rs.getRow()-1]= new tipo_registro();
                  
             miTipoRegistro[rs.getRow()-1].setIdTiporegistro(rs.getInt("idTiporegistro"));
               miTipoRegistro[rs.getRow()-1].setNombretiporegistro(rs.getString("nombretiporegistro"));
                  
              
              }
             
              
              rs.close();
              
              return miTipoRegistro;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }
}
