package test;
public class Asiento {
	String color;
	Integer precio;
	Integer registro;
	
	
	String cambiarColor(String colorCambiar){
		if (colorCambiar.equals("rojo") 
				|| colorCambiar.equals("verde") 
				|| colorCambiar.equals("amarillo") 
				|| colorCambiar.equals("negro") 
				|| colorCambiar.equals("blanco")) {
			color = colorCambiar;
			return color;
		}			
		return color;
	}
}
