package ferreira.filipe;

public class Exemplo01 {
	
	//interface que vai segurar a express�o lambda
	interface Num{
		double getValue();
	}
	
	public static void main(String[] args) {
		
		//instanciei uma vari�vel usando a interface acima e coloquei o valor dela como sendo a fun��o(express�o lambda) 
		Num num = () -> 3.33;
		
		System.out.println(num.getValue());

	}
}
