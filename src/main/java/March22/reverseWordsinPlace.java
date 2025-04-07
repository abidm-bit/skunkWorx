package March22;

public class reverseWordsinPlace {


    static void revWordsinSentence(String input){
        String [] process = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String a:process){sb.append(a + " ");}
        sb.reverse();
        System.out.println(sb);

    }

    public static void main(String[] args) {
        String one = "Test Auto";
        revWordsinSentence(one);
    }
}
