import java.util.Scanner;
import java.util.Locale;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	//Method
	public static void main(String[] args) {
		
		//Creacion de objetos		
		Scanner scanner = new Scanner(System.in);
		
		Usuario usuario = crearUsuario(scanner);
		
		Cuenta cuenta = new Cuenta(usuario);
		
		
		
		//Mostrar opciones 
		int accion = 0;
		do {
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("Realiza una nueva accion: ");
			System.out.println("1- Introduce un nuevo gasto. ");
			System.out.println("2- Introduce un nuevo ingreso. ");
			System.out.println("3- Mostrar gasto. ");
			System.out.println("4- Mostrar ingreso. ");
			System.out.println("5- Mostrar saldo. ");
			System.out.println("0- Salir. ");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			 accion = scanner.nextInt();
		//Controlando la seleccion de opciones con un switch	 
				switch(accion){
				case 1:					
					gastarDinero(scanner, cuenta); 
					break;
				case 2:
					IngresarDinero(scanner, cuenta);
					break;
				case 3:
					probarGastos(cuenta);
					System.out.println("Gastos realizados:");
	                cuenta.getGastos().forEach(System.out::println);						
					break;
				case 4:
					 probarIngreso(cuenta);
					 System.out.println("Ingresos realizados:");
	                 cuenta.getIngresos().forEach(System.out::println);					
					break;
				case 5:
					System.out.println("Su saldo es de : " + cuenta.getSaldo());
					break;	
				case 0:
					break;	
				default:
					System.err.println("Las opciones son del 0 al 5!!!!");
			}
			
		}while(accion != 0);
		System.out.println("Fin del programa.");
		System.out.println("Gracias por utilizar la aplicación de M03B en el curso 2 s2223 .");
		
	}
	
	private static void gastarDinero(Scanner scanner, Cuenta cuenta) {
		System.out.print("Ingrese Gasto: ");
		double cantidadGastar = scanner.nextDouble();
		scanner.nextLine(); 
		System.out.print("Escriba la descripcion del gasto: ");
		String descripcion = scanner.nextLine();
		
		try {
			cuenta.addGastos(descripcion, cantidadGastar);
			
		} catch (GastoException e) {
			System.err.println("Saldo insuficiente!!!");
		}
		
		
		
		System.out.println("Accion realizado con exito!!!! ");
		System.out.println(cuenta);
		System.out.println("");
		
	}

	private static void IngresarDinero(Scanner scanner, Cuenta cuenta) {
		System.out.print("Cantidad a Ingresar: ");
		double cantidadIngresar = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Escriba la descripcion del ingreso: ");
		String descripcion = scanner.nextLine();
		cuenta.addIngresos(descripcion ,cantidadIngresar);
		
		System.out.println("Accion realizado con exito!!!! ");
		System.out.println(cuenta.toString());
		System.out.println("");
	}

	private static Usuario crearUsuario(Scanner scanner) {
		Usuario user = new Usuario();
		
        System.out.println("Creando cuenta!!!");
		
		System.out.print("Entre nombre: ");
		String nombre = scanner.nextLine();	
		user.setNombre(nombre);
		System.out.print("Entre edad: ");
		int edad = scanner.nextInt();
		user.setEdad(edad);
		scanner.nextLine();
		
		String DNI;
		do {
			System.out.print("Entre DNI: ");
			DNI = scanner.nextLine();
			if(user.setDNI(DNI)) {
				System.out.println("" );
				System.out.println("Usuario creado correctamente:" );
				System.out.println(user.toString());
			} else {
				System.out.println("DNI Incorrecto. Debe de ser de la forma 12345678-M o 12345678M!!!" );
				
			}
		}while(!user.setDNI(DNI));
		
		return user;
	}
	
	private static void probarIngreso(Cuenta cuenta) {
		if(cuenta.getIngresos().isEmpty()) {
			System.err.println("No existen ingresos!!!");
		}
	}
	
	private static void probarGastos(Cuenta cuenta) {
		if(cuenta.getGastos().isEmpty()) {
			System.err.println("No existen gastos!!!");
		}
	}
	
}


