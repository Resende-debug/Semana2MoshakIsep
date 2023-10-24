package Semana2Moshak;

import java.util.Scanner;

public class S2MoshakO {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int alergico = ler.nextInt();
        int alergico1 = alergico;
        int Npizzas = ler.nextInt();
        int Pizza1 = 0;
        int sugestao=0;
        boolean verificar = true;
        for (int i = 0; i < Npizzas; i++) {

            int pizza = ler.nextInt();
            Pizza1 = pizza;
            while (alergico > 0) {
                int dig = alergico % 10;
                while (pizza > 0) {
                    int digp = pizza % 10;
                    if (dig == digp) {
                        verificar = false;
                        alergico = 0;

                        break;
                    }
                    pizza /= 10;

                }
                alergico /= 10;
                dig = 0;

                pizza = Pizza1;

            }
            if(verificar){
                System.out.println(Pizza1);
            }
            verificar=true;
            alergico = alergico1;

        }

    }
}
