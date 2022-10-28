package _3ReadMatrix;

import prints.MatrixPrint;

/*
  Given a string as standard input parse the string into a matrix

  Edit configurations -> set Program arguments
  args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"

  RESULT: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }
 */
public class ReadMatrix {

  private static final MatrixPrint matrixPrint = new MatrixPrint();

  public static void main(String[] args) {
    matrixPrint.printReadMatrix(args[0]);
  }
}