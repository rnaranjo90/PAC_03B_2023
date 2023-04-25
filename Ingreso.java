
public class Ingreso extends Dinero {

	public Ingreso(double ingreso, String descripcion) {
		super(ingreso, descripcion);
	}
	@Override
	public String toString() {
		return String.format("Ingreso: %s +%.2f €", super.getDescripcion(), super.getDinero());
	}

}
