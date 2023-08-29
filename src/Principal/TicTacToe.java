package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner respost = new Scanner(System.in);
        char[][] template = {{' ', ' ',' '},{' ', ' ',' '},{' ', ' ',' '}};
        char player = 'X';
        int row,col;
        Boolean end = false;
        while(!end) {
            System.out.println("  0 1 2");
            System.out.println("0 "+template[0][0]+"|"+template[0][1]+"|"+template[0][2]);
            System.out.println("  -+-+-");
            System.out.println("1 "+template[1][0]+"|"+template[1][1]+"|"+template[1][2]);
            System.out.println("  -+-+-");
            System.out.println("2 "+template[2][0]+"|"+template[2][1]+"|"+template[2][2]);

            System.out.println("Vez do jogador: "+ player);
            System.out.println("Digite a linha: ");
            row = Integer.parseInt(respost.nextLine());
            System.out.println("Digite a coluna");
            col = Integer.parseInt(respost.nextLine());

            if (row < 0 || row > 2 || col < 0 || col > 2 || template[row][col] != ' ') {
                System.out.println("Jogada inválida");
                continue;
            }

            template[row][col] = player;

            if (    template[0][0] == player && template[0][1] == player && template[0][2] == player ||
                    template[1][0] == player && template[1][1] == player && template[1][2] == player ||
                    template[2][0] == player && template[2][1] == player && template[2][2] == player ||
                    template[0][0] == player && template[1][0] == player && template[2][0] == player ||
                    template[0][1] == player && template[1][1] == player && template[2][1] == player ||
                    template[0][2] == player && template[1][2] == player && template[2][2] == player ||
                    template[0][0] == player && template[1][1] == player && template[2][2] == player ||
                    template[0][2] == player && template[1][1] == player && template[2][2] == player )
            {
                System.out.println("O jogador: "+ player + " Venceu !");
                break;
            }

            if(player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
        }

        respost.close();
    }
}
