package questoes;

public class Exponencial {
	public static void main(String[] args) {
		int x = 2;
		int h = 1;
		
		for (int m = 1; m <= 5; m++) {
            double valorReal = Math.pow(x, m);
            double valorAproximado = Math.pow((x - h), m) + m * Math.pow((x - h), m - 1) * h;
            double resto = 0; 
            Double derivada = null;
            Double termo = null;
            
            int i = m;
            do {
            	Double fatorial = fatorial(2);
            	derivada = i * Math.pow(x - 1, i - 1);
            	
            	termo = (derivada / fatorial) * Math.pow(h, 2);
            	System.out.println(derivada + " / " + fatorial + " * " + h + "^2");
            	
            	resto += termo;
            	
            	i--;
			} while (termo != 0);
            
            System.out.println("Para m = " + m);
            System.out.println("Valor real: " + valorReal);
            System.out.println("Valor aproximado: " + valorAproximado);
            System.out.println("Resto: " + resto + "\n");
        }
	}

	private static Double fatorial(int i) {
		Double fatorial = null;
		
		while (i > 1) {
			if (fatorial == null) {
				fatorial = (double) i;
			} else {
				fatorial *= i;
			}
			i--;
		}
		
		return fatorial;
	}
	
	private static Double derivar(int i, int x) {
		return i * Math.pow(x - 1, i - 1);
	}
}
