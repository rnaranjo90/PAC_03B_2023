
public class Usuario {
	
	//Attributes
	private String nombre;
	private int edad;
	private String dni;
	
	//Constructor	
	public Usuario() {}
	
	//Methods
	public String getNombre() {
		return nombre;		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    
	
	public String getDNI() {
		return dni;
	}

	public boolean setDNI(String dni) {
		if(dni.matches("^\\d{8}[-]?[A-Z]$")) {
			this.dni = dni;
			return true;
			} else {
				return false;
			}		
	}
	
	
	public String toString() {
		return "Nombre: " + this.nombre + "\n" + 
			   "Edad: " + this.edad + "\n" +
			   "DNI: " + this.dni + "\n" ;
	}
	
	
	

}
