package prints;

import services.MatrixService;

public class MatrixPrint {

    private final MatrixService matrixService = new MatrixService();

    public void printSumMatrix() {
        System.out.printf("RESULT: %s", matrixService.doSum(matrixService.getMatrixA()));
    }

    public void printSumTwoMatrix() {
        StringBuilder output = new StringBuilder("RESULT:\n{\n");
        matrixService.setRows(output, matrixService.getMatrixB(), matrixService.getMatrixC());
        System.out.println(output);
    }

    public void printSumTwoMatrix(String inputA, String inputB) {
        StringBuilder output = new StringBuilder("RESULT:\n{\n");
        matrixService.setRows(output, matrixService.getMatrixFromInput(inputA), matrixService.getMatrixFromInput(inputB));
        System.out.println(output);
    }

    public void printReadMatrix(String input) {
        StringBuilder output = new StringBuilder("RESULT:\n{\n");
        matrixService.setRows(output, matrixService.getMatrixFromInput(input));
        System.out.println(output);
    }
}
