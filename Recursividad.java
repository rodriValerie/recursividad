import java.util.Scanner;
 
public class Recursividad {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        teclado.close();
		Ejecucion eje=new Ejecucion();
                eje.Potencia(base, exponente);
        System.out.println(base+" elevado a "+exponente+" es igual a "+eje.Potencia(base, exponente));
    }
         
 
}