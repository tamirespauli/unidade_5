/*Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número. */

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de números que deseja inserir: ");
        int n = teclado.nextInt();
        System.out.print("1° número: ");
        int maiorNumero = teclado.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.print(i + "° número: ");
            int numero = teclado.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        teclado.close();
    }
}
