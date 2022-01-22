import java.util.Scanner;
 /**
     *Este programa indica el numero de mayor y menor valor
     * @author Samantha Charlize Palomo Valle
     * @version 1.0
     */
public class Condicionales {
     /**
     *Esta es la clase main
     * @param args de la clase main
     * 
     */
    public static void main(String[]args) {
	 /**
     *Contructores
     * @param Scanner es para que el usuariopueda introducir el valor que quiera y el programa pueda leerlo
     * @param int v1 junto con el scanner es para que el usuario introduzca el primer valor
     *@param int v2 junto con el scanner es para que el usuario introduzca el segundo valor
     */
	Scanner sc = new Scanner(System.in);
	System.out.println("Dame el valor numero 1: ");
	int v1 = sc.nextInt();
	System.out.println("Dame el valor numero 2: ");
	int v2 = sc.nextInt();
	/**
     * @param if si v1 es menor que v2 aparece un letrero
     * @return else si es lo contrario el numero conmayor valor se aparece
     */
	if (v1 > v2){
	    System.out.println("El numero con mayor valor es: "+v1);
	} else{System.out.println("El numero con mayor valor es: "+v2);
	}
    }
}
