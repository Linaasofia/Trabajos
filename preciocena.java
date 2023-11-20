import java.util.Scanner;

public class preciocena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Ingresar el valor de la comida
        System.out.print("Ingrese el valor de la comida: ");
        double valorComida = scanner.nextDouble();


        //Ingresar el recargo por cubiertos en %
        System.out.print("Ingrese el recagrgo por cubiertos (en porcentaje):");
        double recargoCubiertos = scanner.nextDouble() ;


        //Ingresr el % de propina
        System.out.print("Ingrese el porcentaje de propina: ") ;
        double Propina = scanner.nextDouble() ;
 

        //Calcular el total
        double precioTotal = calcularPrecioTotal(valorComida,recargoCubiertos,Propina) ;


        //Ver el resultado
        System.out.println("El precio total a pagar por la comida es : $" + precioTotal) ;


        scanner.close() ;

    }
    public static double calcularPrecioTotal(double valorComida, double recargoCubiertos, double Propina ) {
        //Calcular recargo por cubiertos y propina
        double montorecargoCubiertos = valorComida * (recargoCubiertos/ 100);
        double montoPropina = valorComida * (Propina/ 100);

    
        //Precio total
        double precioTotal = valorComida + montorecargoCubiertos + montoPropina;

        return precioTotal;
    }
}
