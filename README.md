# Lista de Exercícios 3 - Java

Este repositório contém a resolução da terceira lista de exercícios, desenvolvida em Java utilizando a IDE Eclipse.

## Informações Gerais

* **Linguagem:** Java
* **Ambiente de Desenvolvimento (IDE):** Eclipse IDE for Java Developers
* **Sistema Operacional Recomendado:** Windows, macOS ou Linux

Cada exercício foi implementado em um arquivo `.java` separado para melhor organização.

## Como Executar

1.  Abra a IDE Eclipse.
2.  Importe o projeto: vá em **File > Import...**.
3.  Selecione **General > Existing Projects into Workspace** e clique em **Next**.
4.  Navegue até o diretório do projeto e clique em **Finish**.
5.  No painel **Package Explorer**, navegue até a classe que contém o método `main` do exercício desejado.
6.  Clique com o botão direito no arquivo e selecione **Run As > Java Application** para executar o programa.

Não é necessário instalar bibliotecas adicionais. Todos os códigos foram desenvolvidos para compilar e rodar diretamente com um JDK (Java Development Kit) padrão.

## Estrutura dos Arquivos

* Para limpar o console entre as interações, foi utilizada uma função `limparTela()`. Essa abordagem é compatível com os consoles do Eclipse, VS Code e terminais de sistemas operacionais como Windows, Linux e macOS.
* Os códigos são simples e diretos, focados em resolver o problema proposto.
* Todos os exercícios utilizam um menu interativo para guiar o usuário na realização das atividades.

## Código Base de Exemplo

Abaixo está uma estrutura de código que pode ser usada como base para os exercícios, incluindo o menu e a função para limpar a tela.

```java
import java.util.Scanner;
import java.io.IOException;

public class ExercicioExemplo {

    // Função para limpar o console
    public static void limparTela() {
        try {
            // Verifica o sistema operacional para usar o comando correto
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            // Imprime a exceção se algo der errado
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            limparTela();
            System.out.println("====== MENU DE OPCOES ======");
            System.out.println("1. Atividade 1");
            System.out.println("2. Atividade 2");
            System.out.println("0. Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opcao: ");

            // Validação para garantir que a entrada seja um número
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                scanner.next(); // Limpa o buffer
                System.out.print("Escolha uma opcao: ");
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nExecutando a Atividade 1...");
                    // Coloque aqui o código da atividade 1
                    System.out.print("\nPressione Enter para continuar...");
                    scanner.nextLine(); // Consome a nova linha pendente
                    scanner.nextLine(); // Aguarda o Enter do usuário
                    break;
                case 2:
                    System.out.println("\nExecutando a Atividade 2...");
                    // Coloque aqui o código da atividade 2
                    System.out.print("\nPressione Enter para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("\nSaindo do programa. Ate mais!");
                    break;
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.");
                    System.out.print("\nPressione Enter para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
            }

        } while (opcao != 0);

        scanner.close(); // Fecha o scanner ao final do programa
    }
}
```
