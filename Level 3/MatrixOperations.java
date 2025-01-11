import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        
        int[][] matrixA = generateRandomMatrix(3, 3);
        int[][] matrixB = generateRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Addition of Matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Subtraction of Matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Multiplication of Matrices:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("Determinant of Matrix A:");
        System.out.println(findDeterminant(matrixA));

        System.out.println("Inverse of Matrix A:");
        displayMatrix(findInverse(matrixA));
    }

   
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // Random numbers between -10 and 10
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

   
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

   
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    
    public static int findDeterminant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

   
    public static int findDeterminant(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

   
    public static double[][] findInverse2x2(int[][] matrix) {
        int determinant = findDeterminant2x2(matrix);
        if (determinant == 0) throw new ArithmeticException("Matrix is not invertible.");
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    public static double[][] findInverse(int[][] matrix) {
        int determinant = findDeterminant(matrix);
        if (determinant == 0) throw new ArithmeticException("Matrix is not invertible.");
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = getMinor(matrix, i, j);
                inverse[j][i] = (findDeterminant2x2(minor) * ((i + j) % 2 == 0 ? 1 : -1)) / (double) determinant;
            }
        }
        return inverse;
    }

  
    public static int[][] getMinor(int[][] matrix, int row, int col) {
        int[][] minor = new int[2][2];
        int r = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }
        return minor;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
        System.out.println();
    }

   
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
        System.out.println();
    }
}
