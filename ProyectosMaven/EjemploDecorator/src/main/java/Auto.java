
public abstract class Auto implements Vendible {
	private String marca;
	private String modelo;
	private int placa;
	private int a�o;
	private String color;
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	public int getA�o() {
		return a�o;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
