package _4MatrixCombined;

import prints.MatrixPrint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Given two string as standard input parse them as matrix,
  Then sum both matrix
  And pretty print on stdout the result matrix
  Then print the sum of matrix result values

  MATRIX A
     args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"
  MATRIX B
     args[1]: "{{1,2,3},{1,2,3},{1,2,3}}"

 */
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