/**
     *Este programa indica loa numeros primos entre el 0 y el 1000
     * @author Samantha Charlize Palomo Valle
     * @version 1.0
     */


public class CicloWhile{
    /**
     *Esta es la clase main 
     *@param args para la clase main
     */
    public static void main(String[] args){

	/**
	 *Constructores
	 *@parm int i es igual a 2
         *@param boolean primo sera true
         */
	    System.out.println("Numeros primos entre el 0 y 1000");
	    int i = 2;
	    boolean primo = true;
	    /**
	 *Segundo constructor
	 *@param while i mayor que 1000 primo sera true 
         *@param boolean primo sera true
         *@param int j es igual a 2 
         */
          
	    while(i<1000){
		primo = true;
		int j = 2;
		 /**
	 *tercer constructor 
	 *@param while j menor que i 
         *@param if entonces i entre j si es igual a 0 o i!=j primo sera false
         *@param break se rompe el ciclo
         */
		while(j<i){
		    if(i%j==0 && i!=j){
			primo = false;
			break;
			/**
	 *cuarto constructor
	 *@param j +1 es para que aumente de uno por uno 
         *@param if primo entonces aparecera un cartel
         */
		    }
		    j = j + i;
		}
		if(primo){
		    System.out.println("Es primo:" + i);
		}
		i=i + 1;
	    }
	}
}
		     
