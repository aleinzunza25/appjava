package practica06;

public class Fecha {
	private int Dia;
	private int mes;
	private int año;

	public int getDia() {
		return Dia;
	}

	public void setDia(int dia) {
		this.Dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Fecha(int dia, int mes, int año) {
		this.Dia = dia;
		this.mes = mes;
		this.año = año;
	}

	@Override
	public String toString() {
		return " [Dia:" + Dia + ", mes:" + mes + ", año:" + año + "]";
	}

}
