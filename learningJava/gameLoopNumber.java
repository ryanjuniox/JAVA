package learningJava;

import java.util.Random;
import java.util.Scanner;

public class gameLoopNumber {
    @SuppressWarnings({ "unused", "resource" })   
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);

        int numeroTentativas = 5;
        int tentativaUsuario = 0;
        while(numeroTentativas > 0){
            
            System.out.print("Digite um número: ");
            tentativaUsuario = leitura.nextInt();
            numeroTentativas--;

            if(tentativaUsuario == numeroAleatorio){
                System.out.println("Você acertou!");
                break;
            }else{
                if(numeroAleatorio > numeroAleatorio){
                    System.out.println("Numero aleatório maior que o escolhido! Tente novamente.");
                }else{
                    System.out.println("Numero aleatório menor que o escolhido! Tente novamente.");
                }
               //System.out.println("Você errou! Tente novamente.");
            }

        }
    }
}
