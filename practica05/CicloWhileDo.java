/**
     *Programa para saber cuales son los numeros primos del 1 al 100 pero con el ciclo do while
     * @author Samantha Charlize Palomo Valle
     * @version 1.0
     */
public class CicloWhileDo{
    /**
     *Inicia la clase principal
     * @param args paa el programa main
     * @param int i es igual a 2
     *@param boolean nos sirve para identificar false o true de los numeros primos
     */
    public static void main(String[] args){
	System.out.println("Numeros primos del 0 al 100 con ciclo While Do");
	int i = 2;
	boolean primos = true;}
     /**
     *Constructores
     * @param int j es igual a 2
     * @param Do while nos indicara que sucedera en dos tipos de cas0s
     *@param if nos dira  si int i entre int j es igual a 0 o i!=j el primo serafalse y se rommpe el parametro
     */
            
	do{
	    primos = true;
	    int j = 2;
	    do{
		if(i%j==0 && i!=j){
		    primos = false;
		    break;
		    /**
     *@param while nos indicara como hacer una sucesion de numeros del 1 al 100 lo demas se encargara el programa de decidir si son o no primos
     * @return while si i es menor o igual a j y si son primos entonces se aparecera un letrero
     * 
     */
		}
		j = j + 1;
	    }while(j<=i);
	    if(primos){
		System.out.println("El numero es primo: " + i);
	    }
	    i=i+1;
	}while(i<1000);
    }
}
