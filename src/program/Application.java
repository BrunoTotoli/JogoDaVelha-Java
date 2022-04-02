package program;

public class Application {

    public static void main(String[] args) {

        Character[][] velha = new Character[3][3];
        imprimeTabuleiroVazio(velha);
        preencherPeca(velha, 1, 1, 'x');
        preencherPeca(velha, 2, 1, 'x');
        preencherPeca(velha, 3, 1, 'x');
        preencherPeca(velha, 1, 2, 'o');
        preencherPeca(velha, 2, 2, 'o');
        preencherPeca(velha, 3, 2, 'o');
        preencherPeca(velha, 1, 3, 'D');
        preencherPeca(velha, 2, 3, 'D');
        preencherPeca(velha, 3, 3, 'D');
        imprimeTabuleiro(velha);


    }

    static void imprimeTabuleiroVazio(Character[][] velha) {
        for (int i = 0; i < velha.length; i++) {
            for (int j = 0; j < velha.length; j++) {
                velha[i][j] = '-';
            }
        }
        System.out.println("   1 2 3");
        System.out.println("1  " + velha[0][0] + " " + velha[0][1] + " " + velha[0][2]);
        System.out.println("2  " + velha[1][0] + " " + velha[1][1] + " " + velha[1][2]);
        System.out.println("3  " + velha[2][0] + " " + velha[2][1] + " " + velha[2][2]);
    }

    static void preencherPeca(Character[][] velha, int coluna, int linha, Character a) {
        velha[coluna - 1][linha - 1] = a;
    }

    static void imprimeTabuleiro(Character[][] velha) {
        System.out.println("   1 2 3");
        System.out.println("1  " + velha[0][0] + " " + velha[0][1] + " " + velha[0][2]);
        System.out.println("2  " + velha[1][0] + " " + velha[1][1] + " " + velha[1][2]);
        System.out.println("3  " + velha[2][0] + " " + velha[2][1] + " " + velha[2][2]);
    }


}
