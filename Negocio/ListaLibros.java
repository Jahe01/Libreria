
package Negocio;
import Negocio.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ListaLibros {
    ArrayList<Libro> listaLibros;
    public ListaLibros(){
       this.listaLibros=new ArrayList<>();
      
    }
    
    public void addLibro(Libro libros){
        this.listaLibros.add(libros);
    }
    public void returnLibro(Libro libros){
        this.listaLibros.remove(libros);
     
    }
    
    
   public Libro libroReciente() {
        Libro Reciente = this.listaLibros.get(0);
        for (Libro max : this.listaLibros) {
            if (max.getFechaPublicacion().getAnio() > Reciente.getFechaPublicacion().getAnio()) {
                Reciente = max;
            } else if (max.getFechaPublicacion().getAnio() > Reciente.getFechaPublicacion().getAnio()) {
                if (max.getFechaPublicacion().getMes() > Reciente.getFechaPublicacion().getMes()) {
                    Reciente = max;
                } else if (max.getFechaPublicacion().getMes() == Reciente.getFechaPublicacion().getMes()) {
                    if (max.getFechaPublicacion().getDia() > Reciente.getFechaPublicacion().getDia()){
                        Reciente=max;
                    }
                }
            }
        }
        return Reciente;
    }
   
    public Libro libroAntiguo() {
        Libro Antiguo = this.listaLibros.get(0);
        for (Libro min : this.listaLibros) {
            if (min.getFechaPublicacion().getAnio() < Antiguo.getFechaPublicacion().getAnio()) {
                Antiguo = min;
            } else if (min.getFechaPublicacion().getAnio() < Antiguo.getFechaPublicacion().getAnio()) {
                if (min.getFechaPublicacion().getMes() < Antiguo.getFechaPublicacion().getMes()) {
                    Antiguo = min;
                } else if (min.getFechaPublicacion().getMes() == Antiguo.getFechaPublicacion().getMes()) {
                    if (min.getFechaPublicacion().getDia() < Antiguo.getFechaPublicacion().getDia()){
                        Antiguo=min;
                    }
                }
            }
        }
        return Antiguo;
    }
   
    public Libro Costoso(){
        Libro costoso = this.listaLibros.get(0);
        for(Libro caro: this.listaLibros){
          if(caro.getCosto()>costoso.getCosto()){
              costoso=caro;
          }
          
        }
        return costoso;
        
    }
    
    public Libro Economico(){
        Libro economico = this.listaLibros.get(0);
        for(Libro barato: this.listaLibros){
          if(barato.getCosto()<economico.getCosto()){
              economico=barato;}
           
        }
        return economico;  
    }
    
   
    @Override
    public String toString() {
        String salida="";
        for(Libro aux: listaLibros)
            salida+=aux.toString()+" \n";
        return salida;
    }
   
   
    
}
