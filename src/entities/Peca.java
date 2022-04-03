package entities;

import java.util.Objects;

public class Peca implements Comparable<TipoPecaEnum> {

    private int coluna;
    private int linha;
    private TipoPecaEnum tipoPeca;


    public Peca(int coluna, int linha, TipoPecaEnum tipoPeca) {
        this.coluna = coluna;
        this.linha = linha;
        this.tipoPeca = tipoPeca;
    }

    public Peca(TipoPecaEnum e) {
        this.tipoPeca = e;
    }

    @Override
    public String toString() {
        if (tipoPeca == TipoPecaEnum.VAZIA) {
            return "-";
        }
        return tipoPeca.toString();
    }

    public TipoPecaEnum getTipoPeca() {
        return tipoPeca;
    }


    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getTipoPeca() == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peca peca = (Peca) o;
        return tipoPeca == peca.tipoPeca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoPeca);
    }

    @Override
    public int compareTo(TipoPecaEnum o) {
        if (tipoPeca != TipoPecaEnum.VAZIA && o != TipoPecaEnum.VAZIA) {
            return tipoPeca.compareTo(o);
        }
        return -1;
    }
}
