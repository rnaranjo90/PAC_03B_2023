import java.util.ArrayList;
import java.util.List;


public class Cuenta {
	//Attributes
	
	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;

	public Cuenta(Usuario usuario) {
		this.setUsuario(usuario);
		this.saldo=0;
        this.gastos = new ArrayList<Gasto>();
        this.ingresos =  new ArrayList<Ingreso>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public double addIngresos(String descripcion, double cantidad) {
		 ingresos.add(new Ingreso (cantidad,descripcion));
		saldo = saldo + cantidad;		
		return saldo;
	}
	
	public double addGastos(String descripcion, double cantidad) throws GastoException {
		
		if(saldo >= cantidad) {
			saldo = saldo - cantidad;
			gastos.add(new Gasto (cantidad,descripcion));
		} else {
			throw new GastoException();
		}
		return saldo;
	}

	public List<Gasto> getGastos() {
		return gastos;           
	
	}

	public List<Ingreso> getIngresos() {
		
		return ingresos;
	}
	
	public String toString() {
		return "El usuario: " + usuario.getNombre() + " dispone de un saldo de: " + saldo;
	}	
	

}
