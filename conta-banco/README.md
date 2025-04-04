# ContaBanco - Simulação de Conta Bancária via Terminal

Este projeto faz parte da trilha de estudos da **Digital Innovation One (DIO)** e tem como objetivo exercitar conceitos básicos de **Java**, como sintaxe, entrada de dados via terminal e manipulação de variáveis.

## 📌 Descrição
O programa permite que o usuário insira os dados de uma conta bancária via terminal e, ao final, exibe uma mensagem formatada com as informações fornecidas.

## 🚀 Tecnologias Utilizadas
- Java
- Scanner (entrada de dados pelo terminal)
- Manipulação de Strings e concatenação

## 🔧 Como Executar o Projeto
1. Clone este repositório:
   ```bash
   git clone https://github.com/ViniciusBorgesdeAraujo/dio-trilha-java-basico.git
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd dio-trilha-java-basico/conta-banco
   ```
3. Compile o código:
   ```bash
   javac ContaTerminal.java
   ```
4. Execute o programa:
   ```bash
   java ContaTerminal
   ```

## 📜 Código Fonte
```java
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = teclado.nextInt();
        teclado.nextLine(); // Consumir a quebra de linha
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = teclado.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = teclado.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = Double.parseDouble(teclado.nextLine());
        
        teclado.close();
        
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
```

## 🎯 Exemplo de Uso
### Entrada:
```
Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o nome do Cliente:
MARIO ANDRADE
Por favor, digite o saldo:
237.48
```
### Saída:
```
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## 📌 Autor
Desenvolvido por [Vinicius Borges](https://github.com/ViniciusBorgesdeAraujo).

