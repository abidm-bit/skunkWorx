package May23;

import java.util.ArrayList;


public class LC27 {

   static int removeElementm1(int[] nums, int val) {
        int count=0;
        for(int n:nums){if(n==val){count++;}}
   return count;
   }

static int removeElementm2(int[] nums, int val) {
    ArrayList<Integer> process = new ArrayList<>(); for(int n:nums){process.add(n);}
    process.removeIf(pr -> pr.equals(val));
    return process.size();
}

   void main(){
       int[] numstd1 = {3,2,2,3};int valtd1 = 3;

       System.out.println(removeElementm2(numstd1,valtd1));
   }

}
