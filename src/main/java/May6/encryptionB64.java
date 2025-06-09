package May6;

import java.util.Base64;

class encryptionB64{

    void main(){

        String cleartxtPW = "fahrenheit451!";
        byte[] encryptedPW = Base64.getEncoder().encode(cleartxtPW.getBytes());


        System.out.println(encryptedPW);              // prints the method reference not the encrypted pw
        System.out.println(new String(encryptedPW));  // prints the encrypted pw


        byte[] decrypt = Base64.getDecoder().decode(encryptedPW);
        System.out.println(new String(decrypt));       // prints the decrypted pw


    }

}