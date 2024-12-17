package clasesDato;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String categoria;
	private int edad;
	private boolean carnet; //CARNET DE CONDU SI O NO
	private float sueldo;
	/////// CONSTRUCTORES ////////////
	/**
	 * Constructor Completo
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param categoria
	 * @param edad
	 * @param carnet
	 * @param sueldo
	 */
	public Empleado(String dni, String nombre, String apellido, String categoria, int edad, boolean carnet,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
		this.edad = edad;
		this.carnet = carnet;
		this.sueldo = sueldo;
		
	}
	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "****";
		this.apellido = "*****";
		this.categoria = "Base";
		this.edad = 0;
		this.carnet = false;
		this.sueldo = (float)0.0;
	}
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Empleado(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
}

