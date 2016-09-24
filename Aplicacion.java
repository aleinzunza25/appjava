package practica06;

public class Aplicacion {

	public static void main(String[] args) {
		Maestro Nuevo = new Maestro(34498734, "Marco Antonio Perez", "Sistemas");
		Fecha Hoy = new Fecha(11, 5, 1998);
		Hora Entrada = new Hora(7, 0, 0);
		Hora Salida = new Hora(6, 0, 0);
		
		Nuevo.setFechaDeAlta(Hoy);
		Nuevo.setHoraEntrada(Entrada);
		Nuevo.setHoraSalida(Salida);

		System.out.println(Nuevo.toString());

	}

}
