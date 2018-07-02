package ferreira.filipe;

import ferreira.filipe.Exemplo02.EPar;

public class Exemplo03 {
	
	interface Num{
		int teste(int x);
	}
	
	//express�o com 2 par�metros
	interface EPar2{
		boolean teste(int x, int y);
	}
	
	public static void main(String[] args) {
		
		Num num = x -> 5; //esxpressoes com apenas um argumento n�o � necess�rio uso de parenteses no inicio("() ->")
		System.out.println(num.teste(5));
		
		
		
		//express�o com dois par�metros e um corpo mais complexo, permitindo v�rias opera��es 
		// com o uso de return
		EPar2 ePar = (x,y) ->{
			boolean resultado = (x % y) == 0;
			return resultado;
		};
		System.out.println(ePar.teste(4,2));

	}
}
