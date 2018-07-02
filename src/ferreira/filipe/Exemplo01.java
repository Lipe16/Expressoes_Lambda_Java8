package ferreira.filipe;

public class Exemplo01 {
	
	//interface que vai segurar a expressão lambda
	interface Num{
		double getValue();
	}
	
	public static void main(String[] args) {
		
		//instanciei uma variável usando a interface acima e coloquei o valor dela como sendo a função(expressão lambda) 
		Num num = () -> 3.33;
		
		System.out.println(num.getValue());

	}
}
