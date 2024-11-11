package EJERCICIOSCLASE03;

public class Ejercicio5Ordenador {
    
    public static void main(String[] args) {
        
        var ordenador = 600;
        var descuento = ( ordenador * 10 ) / 100;
        var pagoTotal = ordenador - descuento;
        System.out.println("el valor total a pagar es: " + pagoTotal + " € ");
    }
}
