package NJune21;

public class yathispalindrome {

    boolean isPalindromem1(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }

    boolean isPalindromem2(String str) {
        int left =0; int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){return false;}
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new yathispalindrome().isPalindromem1("CAT")); // false
        System.out.println(new yathispalindrome().isPalindromem2("CIVIC")); // truuu
        System.out.println(new yathispalindrome().isPalindromem1("Radar")); // truuu
        System.out.println(new yathispalindrome().isPalindromem2("SAAS")); // truuu
        System.out.println(new yathispalindrome().isPalindromem1("2022")); // false
    }

}
