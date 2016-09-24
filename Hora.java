package practica06;

public class Hora {
	private int Horas;
	private int Minutos;
	private int Segundos;
	public int getHoras() {
		return Horas;
	}
	public void setHoras(int horas) {
		this.Horas = horas;
	}
	public int getMinutos() {
		return Minutos;
	}
	public void setMinutos(int minutos) {
		this.Minutos = minutos;
	}
	public int getSegundos() {
		return Segundos;
	}
	public void setSegundos(int segundos) {
		this.Segundos = segundos;
	}
	public Hora(int horas, int minutos, int segundos) {
		this.Horas = horas;
		this.Minutos = minutos;
		this.Segundos = segundos;
	}
	@Override
	public String toString() {
		return "[ Horas:" + Horas + ", Minutos:" + Minutos + ", Segundos:"
				+ Segundos + "]";
	}
}
