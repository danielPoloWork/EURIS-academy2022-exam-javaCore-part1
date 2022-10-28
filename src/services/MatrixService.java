package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** @author Daniel Polo 2022 **/
public class MatrixService {

    public Integer[][] getMatrixA() {
        return new Integer[][]{
                {2, 4, 6},
                {2, 4, 6},
                {2, 4, 6}
        };
    }

    public Integer[][] getMatrixB() {
        return new Integer[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
    }

    public Integer[][] getMatrixC() {
        return new Integer[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
    }

    public Integer[][] getMatrixFromInput(String input) {
        final String REGEX = "(\\{(\\d)\\,(\\d)\\,(\\d)\\})+";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);
        Integer[][] matrix = new Integer[0][3];

        return whileMatcherFoundSetMatrix(matcher, matrix);
    }

    private Integer[][] whileMatcherFoundSetMatrix(Matcher matcher, Integer[][] matrix) {
        while (matcher.find()) {
            matrix = setMatrixFromMatchedInput(matcher, matrix);
        }
        return matrix;
    }

    private Integer[][] setMatrixFromMatchedInput(Matcher matcher, Integer[][] matrix) {
        Integer[][] newMatrix = new Integer[matrix.length + 1][3];
        for (int a = 0; a < matrix.length; a++) {
            System.arraycopy(matrix[a], 0, newMatrix[a], 0, 3);
        }
        newMatrix[newMatrix.length - 1][0] = Integer.parseInt(matcher.group(2));
        newMatrix[newMatrix.length - 1][1] = Integer.parseInt(matcher.group(3));
        newMatrix[newMatrix.length - 1][2] = Integer.parseInt(matcher.group(4));

        return newMatrix;
    }

    public Integer doSum(Integer[][] matrix) {
        int sum = 0;
        for (Integer[] ints : matrix) {
            for (int b = 0; b < matrix[0].length; b++) {
                sum += ints[b];
            }
        }
        return sum;
    }

    public void setRows(StringBuilder output, Integer[][] matrix) {
        for (int a = 0; a < matrix.length; a++) {
            output.append("\t{");
            setColumns(output, matrix, a);
        }
    }

    public void setColumns(StringBuilder output, Integer[][] matrix, int a) {
        for (int b = 0; b < matrix[0].length; b++) {
            output.append(getOutputStringFormat(a, b, matrix.length, matrix[a][b]));
        }
    }

    public Integer[][] setRows(StringBuilder output, Integer[][] matrixB, Integer[][] matrixC) {
        Integer[][] matrix = new Integer[matrixB.length][matrixB[0].length];
        for (int a = 0; a < matrixB.length; a++) {
            output.append("\t{");
            setColumns(output, matrixB, matrixC, matrix, a);
        }
        return matrix;
    }

    public Integer[][] setColumns(StringBuilder output, Integer[][] matrixB, Integer[][] matrixC, Integer[][] matrix, int a) {
        for (int b = 0; b < matrixB[0].length; b++) {
            matrix[a][b] = matrixB[a][b] + matrixC[a][b];
            output.append(getOutputStringFormat(a, b, matrixB.length, matrixB[a][b] + matrixC[a][b]));
        }

        return matrix;
    }

    public String getOutputStringFormat(int a, int b, int length, int value) {
        String output = "";
        if (a < (length- 1)) {
            output += (value);
            if (b < 2) {
                output += ", ";
            } else {
                output += "},\n";
            }
        } else {
            output += (value);
            if (b < 2) {
                output += ", ";
            } else {
                output += "}\n}";
            }
        }
        return output;
    }
}
