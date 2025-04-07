package March11;
//Given a string (all lowercase characters), return the sum of the string's characters (vowel = 1, consonant =2)

public class wordCharacterSum {

    static int countSum(String input){
        int sum=0;
        input=input.replaceAll("a-zA-Z0-9",""); // replace spaces, nonalphanumeric characters
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'|| input.charAt(i)=='o'||input.charAt(i)=='u'){
                sum+=1;
            }
            else sum+=2;
        }
        return sum;
    }



    public static void main(String[] args) {

        String one = "aeo"; //3
        System.out.println(countSum(one));

        String two = "DD"; //4
        System.out.println(countSum(two));

        String x = "doug dimmadome";
        System.out.println(countSum(x));

        String y = "johnny appleseed";
        System.out.println(countSum(y));

        String z = "arthur";
        System.out.println(countSum(z));


    }



}
