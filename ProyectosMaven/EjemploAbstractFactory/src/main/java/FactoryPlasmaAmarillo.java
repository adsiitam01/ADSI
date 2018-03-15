
public class FactoryPlasmaAmarillo extends TvAbstractFactory {

	public TV createTV() {
		return new Plasma();
	}

	public Color createColor() {
		return new Amarillo();
	}
	
}
