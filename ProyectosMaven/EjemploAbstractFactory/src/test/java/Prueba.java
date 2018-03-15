
public class Prueba {

	public static void main(String[] args) {
		
		//Probando el factory LCD + Azul
		TvAbstractFactory f1 = new FactoryLcdAzul();
		EnsamblajeTV e = new EnsamblajeTV(f1);
		
		//Probando el factory Plasma + Amarillo
				TvAbstractFactory f2 = new FactoryLcdAzul();
				EnsamblajeTV e2 = new EnsamblajeTV(f2);
	}

}
