package practica06;

public class Fecha {
	private int Dia;
	private int mes;
	private int a�o;

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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Fecha(int dia, int mes, int a�o) {
		this.Dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return " [Dia:" + Dia + ", mes:" + mes + ", a�o:" + a�o + "]";
	}

}
