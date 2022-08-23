package array2d;

import java.util.Arrays;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/30/2022
 * Time: 8:17 PM
 */
public class TestArray2D {
    public static void main(String[] args) {
        int[] values = {1, 5, 6};

        System.out.println(values[0]);

        int[][] grid = {
                {1, 5, 6},
                {1,5},
                {1,6,10,5}
        };

        System.out.println(grid[0][1]);
        System.out.println(Arrays.toString(grid[0]));

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length ; j++) {
                System.out.println(grid[i][j]);
            }
        }

        String[][] strings = new String[2][3];

        strings[0][2] = "Hello World";
        System.out.println(strings[0][2]);

    }
}
