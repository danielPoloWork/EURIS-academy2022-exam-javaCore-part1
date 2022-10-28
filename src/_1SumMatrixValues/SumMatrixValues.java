package _1SumMatrixValues;

import prints.MatrixPrint;

/*
  Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
  A: {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  RESULT: 36
 */
public class SumMatrixValues {

  private static final MatrixPrint matrixPrint = new MatrixPrint();

  public static void main(String[] args) {
    matrixPrint.printSumMatrix();
  }
}