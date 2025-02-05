# DIO - Trilha Java Básico
> 	www.dio.me
>	trilha Bootcamp-Bradesco-java-native-cloud

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Controle de Fluxo - Desafio

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"   

1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema. 
## Exemplo
Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham `??`

```java
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```
## Conclusão

Desafio realizado com sucesso e com algumas modificações em relação ao código original!
- O método `lerParametro` foi adicionado para garantir que o usuário insira um número inteiro válido. Ele continua pedindo a entrada até que um número válido seja fornecido.
- O `Scanner` não é mais fechado automaticamente, pois o `Scanner` para `System.in` não deve ser fechado em um programa que continua a executar. Em vez disso, o `Scanner` é fechado manualmente no bloco `finally`.
- As mensagens de erro foram melhoradas para fornecer mais contexto ao usuário.
- A lógica de leitura de entrada foi separada em um método `lerParametro`, o que melhora a modularidade e a legibilidade do código.
- O método `printf` foi usado para formatar a saída de maneira mais legível.
- Comentários foram adicionados para explicar o que cada parte do código faz.
- Comentários, correções e sugestões são sempre bem vindas.

