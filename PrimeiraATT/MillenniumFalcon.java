package PrimeiraATT;

import java.util.Scanner;

public class MillenniumFalcon {
    public void exercicio1() {

        Scanner sc = new Scanner(System.in);

        // Digitar numero para realizar as contas
        System.out.println("Escreva o 1º Numero");
        double NP1 = sc.nextDouble();

        System.out.println("Escreva o 2º Numero");
        double NP2 = sc.nextDouble();

        // Menu para as operaçoes aritimeticas
        System.out.println("Escolha a operação desejada");
        // Operaçoes Aritimeticas
        System.out.println("1 - Divisão");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Adição");
        System.out.println("4 - Subtração");
        String operacao = sc.next();
        
        // Operações escolhidas
        double resultado = 0;

        switch (operacao) {
            case "1":
                resultado = NP1 / NP2;
                break;
            case "2":
                resultado = NP1 * NP2;
                break;
            case "3":
                resultado = NP1 + NP2;
                break;
            case "4":
                resultado = NP1 - NP2;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        // Exibe o resultado da operação aritmética
        System.out.println("O resultado é: " + resultado);

        sc.close();
    }
}
