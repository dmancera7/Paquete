package test;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paquete1.Persona p = new Paquete1.Persona(23,"Maria");
		Paquete2.Persona m = new Paquete2.Persona(20,"Jose","Masculino");
		System.out.println("INICIO DE IMPRESION");
		System.out.println(p.toString());
		System.out.println(m.toString());
		System.out.println("FIN");
	}

}
