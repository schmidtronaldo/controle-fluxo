### Explicação do código:

  > Classe ParametrosInvalidosException:

        É uma exceção personalizada que estende Exception. Ela possui um construtor que recebe uma mensagem de erro que será impressa quando a exceção for lançada.

  > Classe Contador:

        Método main:

            Cria um Scanner para ler os parâmetros do terminal.

            Captura os dois números digitados pelo usuário.

            Chama o método contar dentro de um bloco try-catch para lidar com a exceção ParametrosInvalidosException.

        Método contar:

            Verifica se o primeiro parâmetro é maior ou igual ao segundo. Se for, lança a exceção ParametrosInvalidosException.

            Se não houver exceção, executa um loop for de parametroUm + 1 até parametroDois, imprimindo cada número.

### Execução do programa:

    Compile e execute o programa Contador.

    Se os parâmetros digitados estiverem corretos (o primeiro menor que o segundo), ele imprimirá a sequência de números conforme especificado.

    Se o primeiro parâmetro for maior ou igual ao segundo, será lançada a exceção ParametrosInvalidosException com a mensagem adequada.
