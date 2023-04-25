
public abstract class Dinero {

		//Attributes
		protected double dinero;
		protected String descripcion;
		
		public Dinero(double dinero, String descripcion) {
			super();
			this.dinero = dinero;
			this.descripcion = descripcion;
		}

		//Methods 
		public double getDinero() {
			return dinero;
		}
		
		public void setDinero(double dinero) {
			this.dinero = dinero;
		}
		
		public String getDescripcion() {
			return descripcion;
		}
		
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
		
		
		
	}


