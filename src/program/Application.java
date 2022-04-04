package program;

import entities.Peca;
import entities.Tabuleiro;
import entities.TipoPecaEnum;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.criarTabuleiro();
        int jogadas = 0;
        while (tabuleiro.verificarSeGanhou() && jogadas < 9) {
            System.out.println("Insira uma peca: Coluna,Linha,TipoPeca");
            String[] filds = in.nextLine().split(",");
            tabuleiro.preencherPeca(new Peca(Integer.parseInt(filds[0]), Integer.parseInt(filds[1]), TipoPecaEnum.valueOf(filds[2])));
            jogadas++;
            tabuleiro.imprimeTabuleiro();
        }
        if (tabuleiro.verificarSeGanhou())
            System.out.println("Houve um empate");
        else
            System.out.println("Vencedor: " + tabuleiro.getVencedor());
    }


}
