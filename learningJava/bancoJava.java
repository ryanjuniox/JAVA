package learningJava;

import java.util.Scanner;

public class bancoJava {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner leituraDados = new Scanner(System.in);

        //INICIALIZAÇÂO DOS DADOS DO USUÁRIO
        System.out.println("THE NEW BANK");
        String nomeUsuario = "Matias";
        double saldoUsuario = 0;

        System.out.println(String.format("""
                NOME: %s
                SALDO ATUAL: %.2f
                """, nomeUsuario, saldoUsuario));

    }
}
