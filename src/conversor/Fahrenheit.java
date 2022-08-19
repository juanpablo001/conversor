package conversor;

public class Fahrenheit {
	
	double gctof(double valor) {
		return (valor * (9/5) + 32);
	}
	
	double ftogc(double valor ) {
		return ((valor - 32) * (5/9));
	}
}
