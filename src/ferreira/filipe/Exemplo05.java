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
		
		//este código faz a mesma coisa que o de cima comentado.
		lista.stream().filter(predicate::test)
						.forEach(System.out::println);
			
	}
	
	public static void main(String[] args) {
		
		
		List<String> cidades = Arrays.asList(
				"Ipatinga",
				"Timoteo",
				"São paulo");
		
		filtro(cidades,(item)-> item.startsWith("S"));//predicate é capaz de receber uma função lambda, neste caso está testando itens da lista que começam com "S"
		
		
	}

}
