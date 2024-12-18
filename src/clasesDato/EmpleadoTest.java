package clasesDato;

public class EmpleadoTest {
	
	public static void main(String[] args) {
		Empleado emp1 = null;
		emp1 = new Empleado("12345678N", "Pepe", "Garcia");
		Empleado emp2 = new Empleado("13831832V", "Ana", "Ampudia");
		
		System.out.println(emp1.getDni());
		System.out.println(emp1.getSueldo());
		System.out.println(emp1.getCategoria());
		
		emp1.setDni("123456212N");	
		System.out.println("Nuevo DNI: " + emp1.getDni());
		emp1.isCarnet();
		
		
		}
	
}
