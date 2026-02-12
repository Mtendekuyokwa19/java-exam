package Question8;

public class DoubleMatrix {

    int[][] firstArray;
    int[][] secondMatrix;

    public DoubleMatrix(int[][] firstArray, int[][] secondMatrix) {
        this.firstArray = firstArray;
        this.secondMatrix = secondMatrix;
    }

    public int[][] multiply() {

        int rows = firstArray.length;
        int cols = secondMatrix[0].length;
        int common = secondMatrix.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += firstArray[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }
}
