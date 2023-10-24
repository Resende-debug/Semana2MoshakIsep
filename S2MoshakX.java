package Semana2Moshak;

import java.util.Scanner;

public class S2MoshakX {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n = ler.nextInt();
        boolean verificar = true;
        switch (n) {
            case 1 -> {
                System.out.println("Tag Heuer");
                verificar = false;
            }
            case 2 -> {
                System.out.println("Rolex");
                verificar = false;
            }
            case 3 -> {
                System.out.println("Omega");
                verificar = false;
            }
            case 4 -> {
                System.out.println("Cartier");
                verificar = false;
            }
            case 5 -> {
                System.out.println("Bvlgari");
                verificar = false;
            }
            case 6 -> {
                System.out.println("Raymond Weil");
                verificar = false;
            }
        }
        if (verificar) {
            System.out.println("Invalid brand");
        }


    }
}
