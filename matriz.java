import java.util.Scanner;

public class matriz {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int a[][];
        a = new int[2][3];
        int b[][];
        b = new int[3][2];

        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {

                System.out.println("Digite a quantidade de botões da camisa " + j + " da coluna " + j);
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite a quantidade de vendas do mês ");
                b[i][j] = scan.nextInt();
            }

            System.out.println(" ");
        }

        int[][] c = new int[a.length][b[0].length];
        System.out.println("Quantidade total de botões usados: ");
        System.out.println(" ");
        System.out.println("MAIO  JUNHO");
        for (int linha = 0; linha < c.length; linha++) {
            System.out.println(" ");
            for (int col = 0; col < c[linha].length; col++) {

                int valor = 0;
                for (int i = 0; i < b.length; i++) {

                    valor += a[linha][i] * b[i][col];

                }

                c[linha][col] = valor;
                System.out.print(valor + "   ");

            }

        }
        scan.close();

    }
}