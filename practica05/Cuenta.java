/**
     *Este programa es get y set de la clase principal cuenta
     * @author Samantha Charlize Palomo Valle
     * @version 1.0
     */

public class Cuenta{
    	/**
	 *Private string y double de la clase Main cuenta
	 *@param String Titular
         *@param double para dineroDisponible
         */
    private String Titular;
    private double dineroDisponible;
    /**
	 *Public cuenta set y get de la clase Main cuenta
	 *@param set y get Titular=Titular; dineroDisponible=0;
         *@param double set y get public double getdineroDisponible(){
         */

    public Cuenta (String Titular)
    {
	this.Titular=Titular;
	dineroDisponible=0;
    }

    public String getTitular (){
	return this.Titular;
    }
    public void setTitular(String Titular){
	this.Titular = Titular;
    }
    public double getdineroDisponible(){
	return this.dineroDisponible;
    }
    public void setdineroDisponible(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }
}
    
