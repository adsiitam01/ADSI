
public class TV implements Cloneable {
	private String marca;
	private int pulgadas;
	private String color;
	private String descripcion;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private double precio;
	
	public TV() {
	}
	
	public TV(String marca, int pulgadas, String color, double precio) {
		this.marca = marca;
		this.pulgadas =pulgadas;
		this.precio =precio;
		this.color = color;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}