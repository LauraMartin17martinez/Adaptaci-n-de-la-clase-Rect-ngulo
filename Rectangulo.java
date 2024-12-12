
import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();		
		centro.mostrarDatos();
		
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */
	
	
	private boolean esNumero (String num) { // Esta función comprueba si un String introducido por el usuario, es o no es un número
		if (num != null) { // En caso de que el usuario no meta un String, será valor nulo, por lo que pasa al final del if, devolviendo falso
			try {
				Double.parseDouble(num); // En caso de si ser un String y se pueda convertir a número, devuelve verdadero
				return true;
			} catch (NumberFormatException e){ // En caso de no ser un número, en vez de lanzar el error, lo captura y devuelve un falso
				return false; 
			}
		}
		return false;
	}
	
	private double pasarDouble (String num) { // Función para pasar de String a double
		if (esNumero(num)) { // Si esNumero es "true" nos devuelve el número como double
			return Double.parseDouble(num);
		}
		return 0.0; // En caso de no serlo, devuelve 0.0
	}
	
	private int pasarInt (String num) { // Función para pasar de String a Int
		if (esNumero(num)) { // Si esNumero es "true" nos devuelve el número como int
			return Integer.parseInt(num);
		}
		return 0; // En caso de no serlo, devuelve 0
	}
	
	public void cambiarDatos() {

		String ColorNuevo = Teclado.leerString("Introduce el nuevo color: "); // Lee el color introducido por el usuario
		while (esNumero(ColorNuevo) == false && !ColorNuevo.isEmpty()) { // Mientras lo introducido sea falso o no sea un intro, pedirá introducir nuevo valor hasta que introduces uno correcto
			ColorNuevo = Teclado.leerString("Introduce un valor correcto para el nuevo color: ");
		}
		if (!ColorNuevo.isEmpty()) { // Si no está vacio ejecuta el if
			int colorNum = pasarInt(ColorNuevo); // Creamos una variable nueva para almacerar el resultado que nos de la función pasarInt
			setColor(colorNum); // Establece como color el nuevo color introducido
		}
		
		
		String BaseNueva = Teclado.leerString("Introduce la nueva base: "); // 
		while (esNumero(BaseNueva) == false && !BaseNueva.isEmpty()) {
			BaseNueva = Teclado.leerString("Introduce un valor correcto para la nueva base: ");
		}
		if (!BaseNueva.isEmpty()) { 
			double baseNum = pasarDouble(BaseNueva);
			setBase(baseNum);
		}
		
		
		String AlturaNueva = Teclado.leerString("Introduce la nueva altura: ");
		while (esNumero(AlturaNueva) == false && !AlturaNueva.isEmpty()) {
			AlturaNueva = Teclado.leerString("Introduce un valor correcto para la nueva altura: ");
		}
		if (!AlturaNueva.isEmpty()) {
			double alturaNum = pasarDouble(AlturaNueva);	
			setAltura(alturaNum);
		}
			
		
		String xNueva = Teclado.leerString("Indica el nuevo valor de la X del punto : ");
		while (esNumero(xNueva) == false && !xNueva.isEmpty()) {
			xNueva = Teclado.leerString("Introduce un valor correcto para el nuevo valor de X: ");
		}
		if (!xNueva.isEmpty()) {
			int xNum = pasarInt(xNueva);
			this.centro.setX(xNum);
		}
		
		
		String yNueva = Teclado.leerString("Indica el nuevo valor de la Y del punto : ");
		while (esNumero(yNueva) == false && !yNueva.isEmpty()) {
			yNueva = Teclado.leerString("Introduce un valor correcto para el nuevo valor de Y: ");
		}
		if (!yNueva.isEmpty()) {
			int yNum = pasarInt(yNueva);
			this.centro.setY(yNum);
		}
		
		
	}
	
	
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
