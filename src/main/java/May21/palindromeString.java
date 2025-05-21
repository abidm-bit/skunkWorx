package May21;

public class palindromeString {

    boolean pscheckm1(String input){
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return input.equals(String.valueOf(sb));
    }

    // two pointer solution
    boolean pscheckm2(String input){
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int min =0;
        int max = input.length()-1;
        while(min<=max){
                if(input.charAt(min)!=input.charAt(max)){return false;}
            min++; max--;
        }
        return true;
    }

    void main(){
        System.out.println(pscheckm1("RADAR"));                           // expect true
        System.out.println(pscheckm1("Ciivic"));                         // expect false
        System.out.println(pscheckm2("RADAR"));                          // expect true
        System.out.println(pscheckm2("ciivic"));                         // expect false
        System.out.println(pscheckm2("A man, a plan, a canal: Panama")); // expect true
    }
}
