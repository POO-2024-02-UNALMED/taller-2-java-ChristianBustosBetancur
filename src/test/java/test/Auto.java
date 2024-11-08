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
		if(motor != null 
        && !motor.registro.equals(this.registro) ){
			return "Las piezas no son originales";
			
		}
        if(asientos != null){
            for (Asiento asiento : asientos) {
                if (asiento != null 
                && !asiento.registro.equals(this.registro)) {
                    return "Las piezas no son originales";
                }
            }
        }
		
		
		return "Auto original";
	}			
}	