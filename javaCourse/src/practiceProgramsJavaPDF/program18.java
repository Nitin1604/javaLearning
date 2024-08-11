package practiceProgramsJavaPDF;

public class program18 {
    // Multi Dimensional Array Example 4
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    if (i == 0) {
                        threeD[i][j][k] = 0;
                    } else {
                        threeD[i][j][k] = i * (j + 1) * k;
                    }
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
