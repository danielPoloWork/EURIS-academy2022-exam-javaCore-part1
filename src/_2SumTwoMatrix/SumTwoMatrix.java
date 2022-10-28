package _2SumTwoMatrix;

import prints.MatrixPrint;

/*
  Given two matrix of ints prints on standard output the sum of both matrix
  B: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  C: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  RESULT:
  {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  Result matrix must be printed and formatted as previously shown
 */
public class SumTwoMatrix {

  private static final MatrixPrint matrixPrint = new MatrixPrint();

  public static void main(String[] args) {
    matrixPrint.printSumTwoMatrix();
  }
}