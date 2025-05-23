package May22;

public class th {

//      String line = System. lineSeparator ();
//      String jerome = "h" + line + "p";

    static String reshape(int n, String s){
        String nl = System.lineSeparator ();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return String.valueOf(sb);
    }

// n-1 , concat or append nl


    public static void main(String[] args) {

        String td1 = "abc de fghij";
        String td2 = "1 23 456";

    }


}
