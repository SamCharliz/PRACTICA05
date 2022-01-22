/**
     *Este programa es la clase principal cuenta
     * @author Samantha Charlize Palomo Valle
     * @version 1.0
     */

/**
     *Inicia la clase principal
     * @param Scanner para que se la la cantidad que introduce el usuario
     */
import java.util.Scanner;
public class mainCuenta{
    /**
     *Arg para la clase principal
     * @param args clase main
     */
    public static void main(String [] args){

	Scanner scan = new Scanner(System.in);}
     /**
     *Constructor 1
     *@param  Cuenta Titular1 = new Cuenta("Samantha");
     *@param Titular1.setdineroDisponible(7000); por que es una cantidad del primer usuario o titular
     *@param Titular1.getdineroDisponible()); todo esto se encuentra en la otra clase no nla principal 
     */

	Cuenta Titular1 = new Cuenta("Samantha");
	System.out.println("Usuario: "+ Titular1.getTitular());
	Titular1.setdineroDisponible(7000);
	System.out.println("Dinero: " + Titular1.getdineroDisponible());
    /**
     *Constructor 2
     *@param  Cuenta Titular2 = new Cuenta("Veronica");
     *@param Titular2.setdineroDisponible(7000); por que es una cantidad del segundo titular usuario o titular
     *@param Titular2.getdineroDisponible()); todo esto se encuentra en la otra clase no nla principal 
     */
	
	Cuenta Titular2 = new Cuenta("Veronica");
	System.out.println("Usuario: "+ Titular2.getTitular());	   
	Titular2.setdineroDisponible(7000);	
        System.out.println("Dinero: "+ Titular2.getdineroDisponible());
    }
}
		    
