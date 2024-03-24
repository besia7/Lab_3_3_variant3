import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть розмірність квадратної матриці: ");
        int n = scanner.nextInt();


        int[][] matrix = getMatrix(n);


        System.out.println("Ваша матриця:");
        printMatrix(matrix);


        printPositiveElementsCount(matrix);


        int sumOfMainDiagonal = getSumOfMainDiagonal(matrix);
        System.out.println("Сума додаткових елементів головної діагоналі: " + sumOfMainDiagonal);

        scanner.close();
    }
    public static int[][] getMatrix(int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[n][n];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }


    public static void printPositiveElementsCount(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Кількість додаткових елементів кожного стовпця:");
        for (int j = 0; j < cols; j++) {
            int count = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
            System.out.println("Стовпець " + j + ": " + count);
        }
    }

    
    public static int getSumOfMainDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                sum += matrix[i][i];
            }
        }

        return sum;
    }
}

