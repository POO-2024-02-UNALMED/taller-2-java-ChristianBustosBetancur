package test;
public class Motor {
	Integer numeroCilindros;
	String tipo;
	Integer registro;
	
	Integer cambiarRegistro(int registro) {
		
		this.registro = registro;	
		
		return this.registro;
	}
	
	String asignarTipo(String tipo){
		
		if(tipo.equals("electrico") 
				||tipo.equals("gasolina") ) {
			
			this.tipo = tipo;
		}
		
		return this.tipo;
	}
}
