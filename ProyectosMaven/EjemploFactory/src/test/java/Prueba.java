
//Esta es la clase principla, aquí solo se instancia un objeto dependiendo
//cual se necesita.
public class Prueba {

	public static void main(String[] args) {
		 
		Factura f= FactoriaFacturas.getFactura("iva");
		f.setId(1);
		f.setImporte(100);
		System.out.println(f.getImporteIva());
	}
}
