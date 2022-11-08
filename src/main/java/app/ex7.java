package app;

import java.util.Scanner;

public class ex7 {

    public static Integer leds(Integer altura, Integer largura){
        return (altura + 1) * (largura + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor da altura: ");
        int altura = input.nextInt();
        System.out.print("Insira o valor da largura: ");
        int largura = input.nextInt();

        int result = leds(altura, largura);

        System.out.println("Quantidade total de Leds: " + result);

        input.close();
    }
}
