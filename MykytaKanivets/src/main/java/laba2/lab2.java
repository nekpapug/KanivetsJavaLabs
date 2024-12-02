package laba2;

import java.util.Scanner;
import java.util.Random;

public class lab2 {

    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM = 1;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, height;


        do {
            System.out.print("Введіть ширину матриці (макс. 20): ");
            width = scanner.nextInt();
            System.out.print("Введіть висоту матриці (макс. 20): ");
            height = scanner.nextInt();
        } while (width <= 0 || height <= 0 || width > MAX_SIZE || height > MAX_SIZE);

        int[][] matrix;


        System.out.print("Виберіть спосіб створення матриці (1 - вручну, 2 - випадково): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = createMatrixManually(scanner, width, height);
        } else {
            matrix = createMatrixRandomly(width, height);
        }


        System.out.println("Матриця:");
        printMatrix(matrix);


        int min = findMin(matrix);
        int max = findMax(matrix);
        double arithmeticMean = calculateArithmeticMean(matrix);
        double geometricMean = calculateGeometricMean(matrix);


        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + arithmeticMean);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    private static int[][] createMatrixManually(Scanner scanner, int width, int height) {
        int[][] matrix = new int[height][width];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        int[][] matrix = new int[height][width];
        Random random = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static double calculateArithmeticMean(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return sum / count;
    }

    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                product *= element;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}
