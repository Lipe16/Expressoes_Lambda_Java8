package ferreira.filipe;

public class Exemplo02 {
	//A interface que cont�m apenas um m�todo pode ser respons�vel para segurar a express�o lambda
	interface EPar{
		boolean teste(int x);
	}
	
	public static void main(String[] args) {
		
		EPar ePar; //instanciei a interface 
		
		ePar= (int x) ->(x % 2) == 0;// atribui a express�o lambda a ela, e esta express�o recebe par�metro
		
		
		System.out.println(ePar.teste(50));
		System.out.println(ePar.teste(25));

	}

}
