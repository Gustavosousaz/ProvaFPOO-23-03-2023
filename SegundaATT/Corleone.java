package SegundaATT;

import java.util.Scanner;

public class Corleone {
    public void exercicio1() {

        Scanner sc = new Scanner(System.in);
        //Digite qualquer numero que não possua pontos
        System.out.println("Digite o número de matrícula do aluno:");
        int matricula = sc.nextInt();

        //Sorteio Aleatorio
        String[] times = { "Time do Chris", "Time do Greg", "Time do Caruso", "Time do Jerome" };
        int matr = matricula % 4;
        String timeDoAluno = times[matr];

        System.out.println("O aluno de matrícula " + matricula + " foi distribuído para o " + timeDoAluno + ".");
    }
}
