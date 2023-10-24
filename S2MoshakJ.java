package Semana2Moshak;

import java.util.Scanner;

public class S2MoshakJ {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int qtnumeros = ler.nextInt();
        int dig = 0;
        int divisao = 1;
       double percentagem = 0;
        int digitos = 0;
        int num;

        int divisores;
        double maior = 0;
        while(qtnumeros>0) {
            for (int i = qtnumeros; i > 0; i--) {
                num = ler.nextInt();

                qtnumeros--;
                int num1 = num;
                divisores = 0;
                while (num > 0) {
                    dig = num % 10;
                    digitos++;
                    if (dig == 0) {
                        divisao = 1;
                    } else {
                        divisao = num1 % dig;
                        if (divisao == 0) {
                            divisores++;
                        }
                    }



                    percentagem = (double) divisores / digitos * 100;
                    num = num / 10;
                }
                if (percentagem > maior) {
                    maior = percentagem;
                }

                    System.out.printf("%.2f%% %n", percentagem);

                dig = 0;
                digitos = 0;
                divisao = 1;
                divisores = 0;
                percentagem = 0;
            }

            //duvida para dar print
            System.out.printf("(%.2f%%) %n" ,maior);
        }//duvida de como tirar o negativo
    }
}



