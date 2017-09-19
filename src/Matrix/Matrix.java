package Matrix;

import java.util.Scanner;

public class Matrix {

    int r;
    int c;
    int values[][];
    boolean isDefined;

    public Matrix(int rows, int columns){
        c = columns;
        r = rows;
        isDefined = false;
        values = new int[r][c];
    }


    public void defineMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Please enter the value for entry " + i + "," + j);
                values[i][j] = sc.nextInt(); //this one is where it gets stuck
            }
        }
        isDefined = true;
    }

    public void displayMatrix(){
        if (!isDefined) {
            System.out.println("Please define the matrix");
        } else {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(values[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}


