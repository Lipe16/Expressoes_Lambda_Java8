package ferreira.filipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Stream na Prática com lambda - essa fornece a nível API funções de operações em massa como forEach
 */

public class Exemplo04 {

	public static void main(String[] args) {
		
		List<String> cidades = Arrays.asList(
				"Ipatinga",
				"Timoteo",
				"São paulo");
		
		
		//As duas formas abaixo fazem a mesma instrução, porém na segunda o compilador fica encarregado
		//de entender que deverá chamar a função println e passar os parâmetros necessários.
		
		
		cidades.forEach((x) -> System.out.println(x));
		
		System.out.println("\n \n"); //quebras de linha
		
		cidades.forEach(System.out::println);
	}

}
