
public class FacturaIva extends Factura {
	
	public double getImporteIva() {
		 return getImporte()*1.21;
	}
}
