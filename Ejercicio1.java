package EJERCICIOSCLASE03;
public class Ejercicio1 {
    
    public static void main(String[] args) {
        // 6 / 2 ( 1 + 2 )

        var num1 = 6;
        var num2 = 2;
        var num3 = 1;
        var num4 = num1 / num2 * ( num3 + num2 );
        System.out.println("la operacion es la siguiente: " + num1 + "/" + num2 + "(" + num3 + "+" + num2 + ")" );
        System.out.println(num4);
        
        //el resultado correcto de la operacion es 9
        /*la calcualdora dio como resultado 1, debido a que multiplico 2 por el resultado del parentesis que es 3, 
        dando como resultado 6, y dividio 6 en 6, el resultado es 1 , recordando  que cuando hay operaciones 
        con igual precedencia se realizan de izquierdaa derecha*/ 
    }
}
