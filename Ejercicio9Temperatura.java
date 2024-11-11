import java.util.Scanner;

public class Ejercicio9Temperatura {
    
    public static void main(String[] args) {
        
     var scanner = new Scanner(System.in);

        System.out.println("Vamos a convertir celsius a Fahrenheit" );
        System.out.println("Ingrese el grado celsius: " );
        var celsius1 = scanner.nextInt();
        var Fahrenheit1 = ( celsius1 * ( 9/5d )) + 32;
        System.out.println(" la formula es: Celsius * 9/5 + 32 ");
        System.out.println("El resultado es: " + Fahrenheit1);
        
        System.out.println("Vamos a convertir celsius a Kelvin" );
        System.out.println("Ingrese el grado celsius: " );
        var celsius2 = scanner.nextInt();
        var Kelvin1 = celsius2 + 273.15;
        System.out.println(" la formula es: Celsius + 273.15 ");
        System.out.println("El resultado es: " + Kelvin1);



        scanner.close();

    }
}
