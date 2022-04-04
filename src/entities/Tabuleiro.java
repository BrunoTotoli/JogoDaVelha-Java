package entities;

public class Tabuleiro {

    private Peca[][] pecas = new Peca[3][3];
    private String vencedor;


    public void criarTabuleiro() {
        for (int i = 0; i < pecas.length; i++) {
            for (int j = 0; j < pecas.length; j++) {
                pecas[i][j] = new Peca(TipoPecaEnum.VAZIA);
            }
        }
    }

    public void preencherPeca(Peca peca) {
        if (pecas[peca.getColuna() - 1][peca.getLinha() - 1].getTipoPeca() == TipoPecaEnum.O ||
                pecas[peca.getColuna() - 1][peca.getLinha() - 1].getTipoPeca() == TipoPecaEnum.X) {
            throw new PecaException("Ja existe uma peca neste local");
        }

        if (peca.getTipoPeca() == TipoPecaEnum.VAZIA) {
            throw new PecaException("A PECA NAO PODE SER VAZIA");
        }

        if (peca.getColuna() - 1 < pecas.length && peca.getLinha() - 1 < pecas.length) {
            pecas[peca.getColuna() - 1][peca.getLinha() - 1] = new Peca(peca.getColuna() - 1, peca.getLinha() - 1, peca.getTipoPeca());
        } else {
            throw new PecaException("A coluna/linha nao existe no tabuleiro");
        }


    }

    public void imprimeTabuleiro() {
        System.out.println("   1 2 3");
        System.out.println("1  " + pecas[0][0] + " " + pecas[0][1] + " " + pecas[0][2]);
        System.out.println("2  " + pecas[1][0] + " " + pecas[1][1] + " " + pecas[1][2]);
        System.out.println("3  " + pecas[2][0] + " " + pecas[2][1] + " " + pecas[2][2]);
    }

    public boolean verificarSeGanhou() {
        for (int i = 0; i < 3; i++) {
            if (pecas[i][0].compareTo(pecas[i][1].getTipoPeca()) == 0 && pecas[i][0].compareTo(pecas[i][2].getTipoPeca()) == 0) {
                vencedor = pecas[i][0].toString();
                return false;
            }
            if (pecas[0][i].compareTo(pecas[1][i].getTipoPeca()) == 0 && pecas[0][i].compareTo(pecas[2][i].getTipoPeca()) == 0) {
                vencedor = pecas[i][0].toString();
                return false;
            }

            if (pecas[0][0].compareTo(pecas[1][1].getTipoPeca()) == 0 && pecas[0][0].compareTo(pecas[2][2].getTipoPeca()) == 0) {
                vencedor = pecas[0][0].toString();
                return false;
            } else if (pecas[2][0].compareTo(pecas[1][1].getTipoPeca()) == 0 && pecas[2][0].compareTo(pecas[0][2].getTipoPeca()) == 0) {
                vencedor = pecas[2][0].toString();
                return false;
            }

        }
        return true;
    }

    public void imprimirTodoArray() {
        for (Peca[] a : pecas) {
            for (Peca b : a) {
                System.out.println(b);
            }
        }
    }

    public String getVencedor() {
        return vencedor;
    }

}