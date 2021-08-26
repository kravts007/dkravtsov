package homework4;

/**
 * (*)Вывести на экран шахматную доску 8х8 в виде двумерного массива (W - белые клетки, B - черные клети)
 */
public class ChessBoard_13 {
    public static void main(String[] args) {
        //read data source
        String[][] chessBoard = new String[8][8];

        //processing
        //заполняем двумерный массив
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "B";
                } else {
                    chessBoard[i][j] = "W";
                }
            }
        }
        //display results
        //выводим массив на экран
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
