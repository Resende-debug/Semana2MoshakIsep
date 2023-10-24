package Semana2Moshak;

import java.util.Scanner;

public class S2MoshakM {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int qtnumeros = ler.nextInt();
        if (qtnumeros < 0) {
            qtnumeros = ler.nextInt();
        } else {
            int term1 = 0;
            int term2 = 1;
            int pterm;

            System.out.println(term1);
            if(qtnumeros>1){
                System.out.println(term2);
            }
            for (int i = 2; i <qtnumeros ; i++) {
                pterm = term1+term2;
                System.out.println(pterm);
                term1 = term2;
                term2 = pterm;

            }
        }
    }

}

