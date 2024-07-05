package learningJava;

import java.util.Scanner;

public class Leitura{
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.print("Qual é o ano de lançamento?: ");
        int anoLancamento = leitura.nextInt();

        System.out.print("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        //O .nextDouble exige que seja lido do teclado por vírgula.
        System.out.println("""
                Nome do filme: %s
                Ano de lançamento: %d
                Avaliação: %.1f
                """.formatted(filme, anoLancamento, avaliacao));
    }
}