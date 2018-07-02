package ferreira.filipe;

public class Exemplo02 {
	//A interface que contém apenas um método pode ser responsável para segurar a expressão lambda
	interface EPar{
		boolean teste(int x);
	}
	
	public static void main(String[] args) {
		
		EPar ePar; //instanciei a interface 
		
		ePar= (int x) ->(x % 2) == 0;// atribui a expressão lambda a ela, e esta expressão recebe parâmetro
		
		
		System.out.println(ePar.teste(50));
		System.out.println(ePar.teste(25));

	}

}
