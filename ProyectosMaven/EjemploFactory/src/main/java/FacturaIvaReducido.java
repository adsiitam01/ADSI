
public class FacturaIvaReducido extends Factura{
	public double getImporteIva() {
		return getImporte()*1.07;
	}
}
