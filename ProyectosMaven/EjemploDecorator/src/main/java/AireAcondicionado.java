
public class AireAcondicionado extends AutoDecorator {
	
	public AireAcondicionado(Vendible vendible) {
		super(vendible);
	}
	
	public String getDescripcion() {
		return getVendible().getDescripcion() + "Aire acondicionado";
	}

	public int getprecio() {
		return getVendible().getprecio() + 1500;
	}

	
}
