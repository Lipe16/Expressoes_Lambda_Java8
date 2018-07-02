# Express�es Lambdas no Java

## Express�es Lambda, permitem ao programador Java sair do paradigma tradicional da linguagem e usar o paradigma de programa��o funcional

No java 8+ uma s�rie se t�cnicas foram adicionadas nativamente como m�todos an�nimos, fun��es especiais com uso de stream, interface funcional com uso de predicate... O resultado disso �: escreva menos e produza mais com implementa��es mais simples e f�ceis de entender.

## EX.: 
##### Tradicional
		for(String item: lista){
			if(predicate.test(item)){
				System.out.println(item);
			}
		}
				
##### funcional
		lista.stream().filter(predicate::test)
						.forEach(System.out::println);

- Usei o eclipse para desenvolver os exemplos deste reposit�rio, acompanhando a partir do "exemplo01.java" fica mais f�cil entender os exemplos seguintes. :D
						
![Java](https://image.ibb.co/moFZrd/java_lambda_expression.png)
						