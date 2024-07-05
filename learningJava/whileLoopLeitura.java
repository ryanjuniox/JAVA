package learningJava;

import java.util.Scanner;
    public class whileLoopLeitura {
        public static void main(String[] args) {
            @SuppressWarnings({ "unused", "resource" })
            Scanner leitura = new Scanner(System.in);
            double mediaAvaliacao = 0;
            double nota = 0;
            
            int totalNotas=0;
            while(true){
                System.out.print("Digite sua avaliação para o filme ou -1 para encerrar: ");
                nota = leitura.nextDouble();
                if(nota != -1){
                    mediaAvaliacao += nota;
                    totalNotas++;
                }else{
                    break;
                }
            }
            System.out.println(String.format("Média de avlaiações: %.1f", mediaAvaliacao/totalNotas));
    }
}
