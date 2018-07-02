# Expressões Lambdas no Java

## Expressões Lambda, permitem ao programador Java sair do paradigma tradicional da linguagem e usar o paradigma de programação funcional

No java 8+ uma série se técnicas foram adicionadas nativamente como métodos anônimos, funções especiais com uso de stream, interface funcional com uso de predicate... O resultado disso é: escreva menos e produza mais com implementações mais simples e fáceis de entender.

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

- Usei o eclipse para desenvolver os exemplos deste repositório, acompanhando a partir do "exemplo01.java" fica mais fácil entender os exemplos seguintes. :D
						
![Java](https://image.ibb.co/moFZrd/java_lambda_expression.png)
						