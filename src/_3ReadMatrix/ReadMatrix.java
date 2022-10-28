package _3ReadMatrix;

import prints.MatrixPrint;

/** @author Daniel Polo 2022 **/
public class ReadMatrix {

  private static final MatrixPrint matrixPrint = new MatrixPrint();

  public static void main(String[] args) {
    matrixPrint.printReadMatrix(args[0]);
  }
}