public class CicloFor{
       /**
     *Este programa muestra que numero es primo y cual no
     * @author Samantha Charlize Palomo Valle
     * @version 1.0
     */
       /**
     *Esto es un metodo main
     * @param args son los args del main
     */
    public static void main(String[] args)
    {
	   /**
     *Aqui inician los contructores
     *@param int es lo que equivale  
     *@param boolean indicara cual es primo y cual no
     */
	int[] x = new int[1000];
	boolean esPrimo = true;
	int i;

	System.out.println("Comienza la validacion de numeros primos...");
	
       /**
	*Constructores
        *@param el ciclo for indica desde el numero 1 al 1000
        *@param esPrimo indica si es primo y sera true 
	*/

	for(i =1; i <= 1000; i++)

	    {
		
	    esPrimo = true;

	    /**  
             *@param el siguiente ciclo for hace una cuenta para saber si no es primo j sera igual al valor de 2
             */
	    
	    for(int j = 2; j<i; j++)
	        {
		    /**
	*
        *@return si un numero entre j que el valor es 2 sera false y regresara un letrero de que es primo
        *
	*/
	    
	            if(i%j==0)
		        {
		             esPrimo = false;
	                }
		}
		if(esPrimo)
		    System.out.println("Es primo: " + i);
	    }
    }
}
	
	    
