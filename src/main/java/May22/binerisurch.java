package May22;

import java.util.ArrayList;
import java.util.Arrays;

public class binerisurch {


    static int kbs(int[]arr,int key){
        // first index is f: 0
        // ending index is array.length-1

        int f=0; int e=arr.length-1;

        // while the first index is less than the last index
        // the computer will iterate thru the elements
        // the goal is to make the search size smaller
        // if the number is less than the array median, we move the first index forward
        // if the number is greater than the array median, we move the last index back
        // until its found, the median should be the key
        while(f<=e){
            // median = firstIndex + indexRange /2
            int median = (f+(e-f))/2;
            if(key<arr[median])e=median-1;
            else if(key>arr[median])f=median +1;
            else return arr[median];
        }
        // if the key isn't in the array return -1
        return -1;
    }


  public static void main (String[]args){
      int [] td1 = {1,3,4,5,7}; int keytd1 = 5; int keytd2 =4; int keytd3 = 6;
//      System.out.println(kbs(td1,keytd1));
//      System.out.println(kbs(td1,keytd2));
//      System.out.println(kbs(td1,keytd3));

      // The above function is a breakdown of the binary search function,
      // following the princeton textbook, idk y it doesn't run
      // chatgpt and gemini  confirmed that the algorithm is correct

      System.out.println(Arrays.binarySearch(td1,keytd1));
      System.out.println(Arrays.binarySearch(td1,keytd2));
      System.out.println(Arrays.binarySearch(td1,keytd3)); // index should be (Absolute value -1)

  }
}
