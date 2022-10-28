# EURIS Academy 2022
## Java Core Exam Part 1

In order the exercises must be completed:
1. **SumMatrixValue**

   Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
   ```
   MATRIX A:
   {
       {2, 4, 6},
       {2, 4, 6},
       {2, 4, 6}
   }
   RESULT: 36
   ```

2. **SumTwoMatrix**

   Given two matrix of ints prints on standard output the sum of both matrix
   ```
   MATRIX B: 
   {
       {1, 2, 3},
       {1, 2, 3},
       {1, 2, 3}
   }

   MATRIX C: 
   {
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
   ```
   Result matrix must be printed and formatted as previously shown

3. **ReadMatrix**
   Given a string as standard input parse the string into a matrix

   Edit configurations -> set Program arguments
   - args[0] = "{{1,2,3},{1,2,3},{1,2,3}}"

   ```
   RESULT: 
   {
       {1, 2, 3},
       {1, 2, 3},
       {1, 2, 3}
   }
   ```
   
4. **MatrixCombined**
   1. Given two string as standard input parse them as matrix,
   2. Then sum both matrix
   3. And pretty print on stdout the result matrix
   4. Then print the sum of matrix result values

   ```
   MATRIX A:
       args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"
   MATRIX B:
       args[1]: "{{1,2,3},{1,2,3},{1,2,3}}"
   
   MATRIX B: 
   {
       {1, 2, 3},
       {1, 2, 3},
       {1, 2, 3}
   }

   MATRIX C: 
   {
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
   
   RESULT: 36
   ```