package test;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paquete1.Persona p = new Paquete1.Persona(23,"Maria");
		Paquete2.Persona m = new Paquete2.Persona(20,"Jose","Masculino");

		Paquete1.Persona n = new Paquete1.Persona(30,"Pedro");
		

		System.out.println("INICIO DE IMPRESION");

		System.out.println(p.toString());
		System.out.println(n.toString());
		System.out.println(m.toString());
		System.out.println("FIN");
		System.out.println("TEST");
	}

}
