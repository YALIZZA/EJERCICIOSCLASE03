import java.util.Scanner;

public class Ejercicio10MediaAritmetica {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("vamos a ingresar los datos para la media artmetica");
        System.out.println("Ingrese el numero 1: ");
        var num1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2: ");
        var num2 = scanner.nextInt();
        System.out.println("Ingrese el numero 3: ");
        var num3 = scanner.nextInt();
        System.out.printf("la media aritmetica es la suma de un determinado/n grupo de numeros dividido en/n  la cantidad de numeros  del grupo.");
        var mediaAritmetica = ( num1 + num2 + num3 )/3;
        System.out.println( " la media Aritmetica es: " + mediaAritmetica);

scanner.close();
        
    }
}
