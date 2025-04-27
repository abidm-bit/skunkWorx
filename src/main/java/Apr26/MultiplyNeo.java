package Apr26;

/*
   Scalar multiplication (multiply each number in a matrix with a coefficient)

   I have this matrix:
           [4,5,6]
           [1,2,3]
           [7,8,9]

   I have a coefficient of 2

   After multiplying each number in the matrix with the coefficient,
   my resultant matrix will be:

           [ 8,10,12]
           [ 2, 4, 6]
           [14,16,18]
*/


import java.util.Arrays;

public class MultiplyNeo {

    // doesn't modify the elements:
    static void scalarMathm1(int[][]input,int coefficient){
        System.out.println("The original matrix is "+Arrays.deepToString(input));
        for(int[]row:input){
            for(int num:row){
                num*=coefficient;
                System.out.println(num);
            }
        }
    }


    // this modifies each number
    static void scalarMathm2(int[][]input,int coefficient){
        System.out.println("The original matrix is "+Arrays.deepToString(input));
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] *= coefficient; // overwrite each number
                System.out.println(input[i][j]);
            }
        }
    }

    // modifies the elements and stores in another array
    static String scalarMathm3(int[][]input,int coefficient){
        int[][] resultant = new int[input.length][input.length];
        System.out.println("The original matrix is "+Arrays.deepToString(input));
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                resultant[i][j]=input[i][j] *= coefficient;
            }
        }
        return ("The resultant matrix is "+Arrays.deepToString(resultant));
    }


    public static void main(String[] args) {

        int [][] inp1 = new int[][]{
                {4,5,6},
                {1,2,3},
                {7,8,9}
        };

//        scalarMathm1(inp1,2);
//        scalarMathm2(inp1,2);  these 2 methods don't print the array in a matrix

        System.out.println((scalarMathm3(inp1,2)));

        System.out.println("\n");


        int [][] inp2 = new int[][]{
                {4,4,4},
                {1,1,1},
                {1,2,3}
        };
        System.out.println(scalarMathm3(inp2,3));

    }

}





