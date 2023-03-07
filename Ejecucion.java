  
import java.io.*;

public class Ejecucion{
    int base, exponente;

    public Ejecucion() {
    }

    
    public Ejecucion(int base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

public double Potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return Potencia(base, exponente+1) / base;
        } else {
            return base * Potencia(base, exponente-1);
        }
    }

    
    
}