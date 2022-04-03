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
        while (tabuleiro.verificarSeGanhou()) {
            System.out.println("Insira uma peca: Coluna,Linha,TipoPeca");
            String[] filds = in.nextLine().split(",");
            tabuleiro.preencherPeca(new Peca(Integer.parseInt(filds[0]), Integer.parseInt(filds[1]), TipoPecaEnum.valueOf(filds[2])));
            tabuleiro.imprimeTabuleiro();
        }
        System.out.println("Vencedor: " + tabuleiro.getVencedor());

//        tabuleiro.preencherPeca(new Peca(2, 1, TipoPecaEnum.O));
//        tabuleiro.preencherPeca(new Peca(3, 1, TipoPecaEnum.O));
//        tabuleiro.imprimeTabuleiro();
//        tabuleiro.verificarSeGanhou();


    }


}
