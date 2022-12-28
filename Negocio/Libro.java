
package Negocio;

import Negocio.Fecha;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/** 
 *
 * @author USUARIO
 */
public class Libro { 
  private String titulo;
  private String autor;
  private Fecha fechaNacimiento;
  private Fecha fechaPublicacion;
  private Double costo;

public Libro(String autor,String titulo,Double costo, Fecha fechaNacimiento, Fecha fechaPublicacion){
    setEmpleado(autor, titulo, costo, fechaNacimiento, fechaPublicacion);
}

    private void setEmpleado(String autor, String titulo,Double costo, Fecha fechaNacimiento, Fecha fechaPublicacion) {
       this.autor=autor;
       this.costo=costo;
       this.fechaPublicacion=fechaPublicacion;
       this.fechaNacimiento=fechaNacimiento;
       this.titulo=titulo;
    }
    
    public String getNombre() {
        return titulo;
    }

    public void setNombre(String nombre) {
        this.titulo = nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
  
    public boolean fechacorrecta(Fecha fechaPublicacion,Fecha fechaNacimiento){
    return (fechaNacimiento.getAnio() >= fechaPublicacion.getAnio());
    }
    
    @Override
    public String toString() {
        return  "\n Autor:" +  autor +"\n Titulo: "+ titulo+ "\n Fecha de nacimiento:" + fechaNacimiento + 
                "\n Fecha de publicación:" + fechaPublicacion + "\n Costo:" + costo;
    }
    
}
