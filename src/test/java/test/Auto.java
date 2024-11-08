package test;
public class Auto {
	String modelo;
	Integer precio;
	Asiento[] asientos;
	String marca;
	Integer registro;
	static String cantidadCreados;
	
	Motor motor;
	
	
	Integer cantidadAsientos(){
		int cantAsientos = 0;
		
		for(Asiento asiento: asientos) {
			
			if (asiento != null) {
				cantAsientos++;
			}
		}
			
		return cantAsientos;			
	}
		
	String verificarIntegridad(){
		if(!motor.registro.equals(this.registro) 
				&& motor != null){
			return "Las piezas no son originales";
			
		}
		for (Asiento asiento : asientos) {
	        if (!asiento.registro.equals(this.registro)
	        		&& asiento != null) {
	            return "Las piezas no son originales";
	        }
		}
		
		return "Auto original";
	}			
}	