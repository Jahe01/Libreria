
package Negocio;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author johanna.huaraca
 */
public class Fecha {
    private int dia, mes, anio;
    
    public Fecha(String fecha){
        setFecha(fecha);
    }

    private void setFecha(String fecha) {
        StringTokenizer tk= new StringTokenizer(fecha,"/");
        this.dia=Integer.parseInt(tk.nextToken());
        this.mes=Integer.parseInt(tk.nextToken());
        this.anio=Integer.parseInt(tk.nextToken());
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
     public boolean validarFecha(Fecha fecha){
        boolean validoFecha=true;
        if (anio < 0) {
      return false;
    }
    if (mes < 1 || mes > 12) {
      return false;
    }
    if (dia < 1 || dia > 31) {
      return false;
    }
    if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
      return false;
    }
    if (mes == 2) {
      if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
        if (dia > 29) {
          return false;
        }
      } else {
        if (dia > 28) {
          return false;
        }
      }
    }
    return true;
        }
   
    @Override
    public String toString() {
        return "( "+dia + "/" + mes + "/" + anio +" )";
      }
   
}
