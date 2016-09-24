package practica06;

public class Maestro {
	private int NumEmpleado;
	private String NombreDelEmpleado;
	private String Departamento;
	private Fecha FechaDeAlta;
	private Hora HoraEntrada;
	private Hora HoraSalida;

	public int getNumEmpleado() {
		return NumEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.NumEmpleado = numEmpleado;
	}

	public String getNombreDelEmpleado() {
		return NombreDelEmpleado;
	}

	public void setNombreDelEmpleado(String nombreDelEmpleado) {
		this.NombreDelEmpleado = nombreDelEmpleado;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		this.Departamento = departamento;
	}

	public Fecha getFechaDeAlta() {
		return FechaDeAlta;
	}

	public void setFechaDeAlta(Fecha fechaDeAlta) {
		this.FechaDeAlta = fechaDeAlta;
	}

	public Hora getHoraEntrada() {
		return HoraEntrada;
	}

	public void setHoraEntrada(Hora horaEntrada) {
		this.HoraEntrada = horaEntrada;
	}

	public Hora getHoraSalida() {
		return HoraSalida;
	}

	public void setHoraSalida(Hora horaSalida) {
		this.HoraSalida = horaSalida;
	}

	public Maestro(int numEmpleado, String nombreDelEmpleado, String departamento) {
		this.NumEmpleado = numEmpleado;
		this.NombreDelEmpleado = nombreDelEmpleado;
		this.Departamento = departamento;
	}

	@Override
	public String toString() {
		return " No.EMPLEADO:" + NumEmpleado +"\n"+ " NOMBRE DEL EMPLEADO:"
				+ NombreDelEmpleado +"\n "+"DEPARTAMENTO:" + Departamento
				+ "\n"+" FECHA DE ALTA:" + FechaDeAlta +"\n"+ " HORA DE ENTRADA:"
				+ HoraEntrada +"\n" +" HORA DE SALIDA:" + HoraSalida + "";
	}

}
