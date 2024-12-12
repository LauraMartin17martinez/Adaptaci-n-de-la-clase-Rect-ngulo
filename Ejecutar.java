
import daw.com.Pantalla;

public class Ejecutar {

	public static void main(String[] args) {
		
		Rectangulo prueba = new Rectangulo(4, new Punto(5,7), 5.0, 3.0);
		
		prueba.mostrarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		
		prueba.cambiarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
		
		prueba.mostrarDatos();

		
		//Rectangulo copia = new Rectangulo(prueba);

		//copia.mostrarDatos();
		
		//prueba.getCentro().setX(2);
		
		//Pantalla.escribirSaltoLinea();
		//Pantalla.escribirString("-----------------------------------");
		//Pantalla.escribirSaltoLinea();
		
		//prueba.mostrarDatos();
	}

}
