package ferreira.filipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Stream na Pr�tica com lambda - essa fornece a n�vel API fun��es de opera��es em massa como forEach
 */

public class Exemplo04 {

	public static void main(String[] args) {
		
		List<String> cidades = Arrays.asList(
				"Ipatinga",
				"Timoteo",
				"S�o paulo");
		
		
		//As duas formas abaixo fazem a mesma instru��o, por�m na segunda o compilador fica encarregado
		//de entender que dever� chamar a fun��o println e passar os par�metros necess�rios.
		
		
		cidades.forEach((x) -> System.out.println(x));
		
		System.out.println("\n \n"); //quebras de linha
		
		cidades.forEach(System.out::println);
	}

}
