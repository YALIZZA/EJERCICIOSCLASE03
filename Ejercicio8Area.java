import java.util.Scanner;

public class Ejercicio8Area {
    
    public static void main(String[] args) {
        
         var scanner = new Scanner(System.in);

        System.out.println("Vamos a hallar el area y perimetro de un rectangulo" );
        System.out.println("Ingrese la longitud: " );
        var longitud = scanner.nextInt();
        System.out.println("Ingrese el ancho: " );
        var ancho = scanner.nextInt();

        System.out.println(" la formula  de Area es: Longitud*Ancho");
        var area = longitud * ancho;
        System.out.println("el area es: " + area );
        System.out.println(" la formula  de perimetro es: (2*Longitud)+(2*Ancho)");
        var perimetro = ( 2 * longitud) + ( 2 * ancho );
        System.out.println("el perimetro es: " + perimetro );


        scanner.close();
    }
}
