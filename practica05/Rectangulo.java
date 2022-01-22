/**
     *parametros get y set de el programa main rectangulo
     *@author Samantha Charlize Palomo Valle
     *@version 1.0
     */
import java.io.IOException;
public class Rectangulo{
    /**
     *Clase publica y privada para la altura y vbase ademas de que se dirige a la clase principal
     *@param private double base;
     *@param private double altura;
     *@param public Rectangulo(double b, double h)
     */

    private double base;
    private double altura;
    public Rectangulo(double b, double h)
	/**
     *Asignamos valores y hacemos los constructores para saber el arrea y perimetro de lo uqe nos piden ademas de get y set para la altura y base
     *@param public void setBase(double b)        base=b;
     *@param public void setAltura(double h) que es la altura
     *@param public Rectangulo(double b, double h)
     */
	
    {
	base = b;
	altura=h;
    }
    public void setBase(double b)
    {
	base=b;
    }
    public void setAltura(double h)
    {
	altura=h;
    }
    public double getBase()
    {
	return base;
    }
    public double getAltura()
    {
	return altura;
    }
    /**
     *Las operaciones para la clase principal
     *@param double area()
     *@return base*altura;
     *@param double perimetro()
     *@return 2*base+2*altura;
     *Al final lo que regresara es la base y altura y las calculara 
     *@return "base = "+base+"  "+altura;
     */
    public double area()
    {
	return base*altura;
    }
    public double perimetro()
    {
	return 2*base+2*altura;
    }
    public String toString()
    {
	return "base = "+base+"  "+altura;
    }
}
   
       
