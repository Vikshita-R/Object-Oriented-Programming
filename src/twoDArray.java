import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr1[i][j] == 0)
                    arr2[i][j] = 1;
                if (arr1[i][j] == 1)
                    arr2[i][j] = 0;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();

        }
    }
}

