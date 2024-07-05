package learningJava;

import java.util.Scanner;

public class LoopLeitura {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused", "resource" })
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
    
        for(int i=0; i<3; i++){
            System.out.print("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println(String.format("Média de avlaiações: %.1f", mediaAvaliacao/3));
    }
}
