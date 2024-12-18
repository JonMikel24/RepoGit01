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
	/// GETTER Y SETTER ///////
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCarnet() {
		return carnet;
	}
	public void setCarnet(boolean carnet) {
		this.carnet = carnet;
	}
	public void setCarnet1(boolean carnet) {
		this.carnet = sueldo > 2000;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", categoria=" + categoria
				+ ", edad=" + edad + ", carnet=" + carnet + ", sueldo=" + sueldo + "]";
	}
	
}

