import java.util.Scanner;
public class Bisiesto{
    /**
     *Este programa define que año sera bisiesto
     * @author Samantha Charlize Palomo Valle
     * @version 11/0/12
     */
    public static void main(String []args){
	Scanner in = new Scanner(System.in);
	System.out.println("Ingresa el año del que deseas saber si es bisiesto o no: ");
	/**
         * Constructores
         *@param int año se refiere al año que se va a ingresar
         *@param if ((año % 400 == 0) || ((año % 4 == 0)  (año % 100 != 0))){ realiza las cuentas para saber el año bisiesto
         */
	int año = in.nextInt();

	    if((año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0))){
		System.out.println("el año " + año +  " es bisiesto");

		/**
     * @return si el año no es bisiesto se aparecera este cartel
     * 
     */
	    } else {
		System.out.println("el año " + año + " no es bisiesto");
	    }
    }

}
