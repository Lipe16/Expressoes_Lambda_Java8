package ferreira.filipe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 *  Interface Funcional Predicate
 */
public class Exemplo05 {
	
	//usando predicate
	public static void filtro(List<String> lista, Predicate<String> predicate) {
		/*for(String item: lista)
			if(predicate.test(item))
				System.out.println(item);*/
		
		//este c�digo faz a mesma coisa que o de cima comentado.
		lista.stream().filter(predicate::test)
						.forEach(System.out::println);
			
	}
	
	public static void main(String[] args) {
		
		
		List<String> cidades = Arrays.asList(
				"Ipatinga",
				"Timoteo",
				"S�o paulo");
		
		filtro(cidades,(item)-> item.startsWith("S"));//predicate � capaz de receber uma fun��o lambda, neste caso est� testando itens da lista que come�am com "S"
		
		
	}

}
