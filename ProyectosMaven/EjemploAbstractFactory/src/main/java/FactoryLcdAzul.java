
public class FactoryLcdAzul extends TvAbstractFactory {
		
	public TV createTV() {
		return new LCD();
	}

	public Color createColor() {
		return new Azul();
	}
}
