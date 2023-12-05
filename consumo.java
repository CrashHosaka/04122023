package projeto1;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        String[] alimentos = {"Arroz","Feijão","Carne","Frango","Salada"};
        String opcao[] = new String[5];
        Scanner opcaoScanner = new Scanner(System.in);
        int t = 0;

        for(String i:alimentos){
            System.out.println("Vai querer "+i+" para comer?(sim/nao)");
            opcao[t] = opcaoScanner.nextLine();

            t++;
        }

        System.out.print("Você vai comer: ");
        

        for (int q = 0;q < 5; q++){
             if (opcao[q].equals("sim")) {
                 //System.out.print(alimentos[q]+", ");
                 System.out.print(String.format("%s, ", alimentos[q]));
             }
        }
        opcaoScanner.close();
    }
}
