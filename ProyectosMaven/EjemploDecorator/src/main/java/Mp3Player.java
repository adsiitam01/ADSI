
public class Mp3Player extends AutoDecorator {
	
	public Mp3Player(Vendible vendible) {
		super(vendible);
	}

	public String getDescripcion() {
		return getVendible().getDescripcion() + "Mp3 Player";
	}

	public int getprecio() {
		return getVendible().getprecio() + 250;
	}
}
