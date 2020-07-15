import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static final int SIZE = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int K = sc.nextInt();

            System.out.println(solve(K));
        }

        sc.close();
    }

    static String solve(int K) {
        char[][] board = new char[SIZE][SIZE];
        for (int r = 0; r < SIZE; ++r) {
            for (int c = 0; c < SIZE; ++c) {
                if (r == 0 && c == 0) {
                    board[r][c] = 'O';
                    --K;
                } else if (K != 0) {
                    board[r][c] = '.';
                    --K;
                } else {
                    board[r][c] = 'X';
                }
            }
        }

        return Arrays.stream(board).map(String::new).collect(Collectors.joining("\n"));
    }
}