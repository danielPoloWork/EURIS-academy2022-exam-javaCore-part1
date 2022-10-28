package _4MatrixCombined;

import prints.MatrixPrint;

/** @author Daniel Polo 2022 **/
public class MatrixCombined {

  private static final MatrixPrint matrixPrint = new MatrixPrint();

  public static void main(String[] args) {
    System.out.print("MATRIX A - ");
    matrixPrint.printReadMatrix(args[0]);

    System.out.print("MATRIX B -");
    matrixPrint.printReadMatrix(args[1]);

    System.out.print("SUM - ");
    matrixPrint.printSumTwoMatrix(args[0], args[1]);
  }
}