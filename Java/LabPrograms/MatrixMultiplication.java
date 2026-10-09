/*
 * Question: 6. Implement a Java Program to multiply two given matrices by passing objects as parameters.
 */

package LabPrograms;

import java.util.Scanner;
class Matrix {
    int rows, cols;
    int[][] data;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    void readMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.cols != m2.rows) {
            System.out.println("Matrix multiplication not possible.");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m2.cols);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                for (int k = 0; k < m1.cols; k++) {
                    result.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return result;
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        Matrix m1 = new Matrix(r1, c1);
        Matrix m2 = new Matrix(r2, c2);
        System.out.println("First Matrix:");
        m1.readMatrix();
        System.out.println("Second Matrix:");
        m2.readMatrix();
        Matrix result = Matrix.multiply(m1, m2);
        if (result != null) {
            System.out.println("Resultant Matrix:");
            result.display();
        }

        sc.close();
    }
}
