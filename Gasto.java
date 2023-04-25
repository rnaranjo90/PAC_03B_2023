
public class Gasto extends Dinero {
	
	public Gasto(double gasto, String descripcion) {
		super(gasto, descripcion);
	}
	
	//Methods	
	public String toString() {
		return String.format("Gasto: %s -%.2f €", super.getDescripcion(), super.getDinero());
	}


		
	}


