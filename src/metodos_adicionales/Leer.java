/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_adicionales;

import Clases.Autor;
import Clases.alumno;
import Clases.estado_libro;
import Clases.necesidad_Intervencion;
import Clases.nivel_bibliografico;
import Clases.nivel_institucional;
import Clases.procedencia;
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
       
       public  necesidad_Intervencion [] leer_necesidad_de_intervencion(){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From necesidadintervencion";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
          necesidad_Intervencion miNecesidad [] = new necesidad_Intervencion[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
               miNecesidad[rs.getRow()-1]= new necesidad_Intervencion();
                  
             miNecesidad[rs.getRow()-1].setIdNecesidadInt(rs.getInt("idNecesidadInt"));
                miNecesidad[rs.getRow()-1].setNecesidadinterferencia(rs.getString("necesidadinterferencia"));
                  
              
              }
             
              
              rs.close();
              
              return miNecesidad;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }
   
    public  Autor [] leer_autor(String valordeBusqueda){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From autor where nombre_autor like '%" + valordeBusqueda + "%'";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
         Autor miAutor [] = new Autor[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
              miAutor[rs.getRow()-1]= new Autor();
                  
             miAutor[rs.getRow()-1].setIdautor(rs.getInt("idautor"));
             miAutor[rs.getRow()-1].setNombre_autor(rs.getString("nombre_autor"));
             miAutor[rs.getRow()-1].setApellido_autor(rs.getString("apellido_autor"));      
             miAutor[rs.getRow()-1].setNacionalidad(rs.getString("nacionalidad"));  
              }
             
              
              rs.close();
              
              return miAutor;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }    
    
    public  procedencia [] leer_procencia(){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From procedencia";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
          procedencia miProcedencia [] = new procedencia[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
              miProcedencia[rs.getRow()-1]= new procedencia();
                  
             miProcedencia[rs.getRow()-1].setIdprocendia(rs.getInt("idprocedencia"));
             miProcedencia[rs.getRow()-1].setNombre_procencia(rs.getString("nombre_procedencia"));
            
              }
             
              
              rs.close();
              
              return miProcedencia;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    } 
    
     public  alumno [] leer_alumno(String valordeBusqueda){
        
          try{
              Conectar miConec = new Conectar();   // Instancia el conector
              
              String consultaSQL = "Select * From alumno where nombre_alumno like '%" + valordeBusqueda + "%'";   // escribo la consulta SQL
              
              ResultSet rs = miConec.consulta(consultaSQL);      // rs crea un Resulset de datos (creamos un contenedor de datos)
              
              rs.last(); // se va al ultimo registro
              
         alumno miAlumno [] = new alumno[rs.getRow()];   // trae la fila en la q esta parado el puntero
              
              rs.beforeFirst(); // se vuelve arriba 
              while(rs.next()){
                  
              miAlumno[rs.getRow()-1]= new alumno();
                  
             miAlumno[rs.getRow()-1].setIdalumno(rs.getInt("idalumno"));
             miAlumno[rs.getRow()-1].setNombre_alumno(rs.getString("nombre_alumno"));
             miAlumno[rs.getRow()-1].setIdcurso(rs.getInt("idcurso"));
             miAlumno[rs.getRow()-1].setIdturno(rs.getInt("idturno"));
             miAlumno[rs.getRow()-1].setFechadenacimiento(rs.getDate("fechadenacimiento"));
             miAlumno[rs.getRow()-1].setDni(rs.getInt("dni"));
             miAlumno[rs.getRow()-1].setDireccion(rs.getString("direccion"));      
             miAlumno[rs.getRow()-1].setEmail(rs.getString("email"));  
              }
             
              
              rs.close();
              
              return miAlumno;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    } 

   
}
