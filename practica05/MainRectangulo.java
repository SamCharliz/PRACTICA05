
/**
     *Este programa calcula un rectangulo area y perimetro
     *@author Samantha Charlize Palomo Valle
     *@version 1.0
     *@param import java.io es para que se pueda leer este programa
     */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainRectangulo{
    /**
     *Args de la clase main
     *@param  args de la clase main
     */

    public static void main(String[] args)throws IOException{

	/**
     *Constructor 1
     *@param BufferedReader br es un tipo scanner
     *@param double b, h; son la base y la altura
     *@param Rectangulo R;
     */

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double b, h;
	Rectangulo R;

		/**
     *Constructor 2
     *@param  h=Double.parseDouble(br.readLine()); para que lea la linea de la otra clase y la ejecute ademas de el numero que ingreso el usuario
     *@param b=Double.parseDouble(br.readLine());para que lea la linea de la otra clase y la ejecute ademas de el numero que ingreso el usuario pero este para la base
     */

	System.out.print("Ingrese base : ");
	b=Double.parseDouble(br.readLine());
	System.out.print("Ingrese altura : ");
	h=Double.parseDouble(br.readLine());

		/**
     *Constructor 3
     *@param R = new Rectangulo(b,h); para el rectangulo el total de la base y altura
     *@param +R lo que ingreso el usuario
     *@param +R.area()); el total del area
     *@param +R.perimetro()) el total del perimeto del rectsngulo
     */
	R = new Rectangulo(b,h);
	System.out.println("Rectangulo: " +R);
	System.out.println("Area: " +R.area());
	System.out.println("Perimetro: " +R.perimetro());
    }
}
 
