package May6;

import java.util.Base64;

import static java.io.IO.println;

class encryptionB64{

    void main(){

        String cleartxtPW = "fahrenheit451!";
        byte[] encryptedPW = Base64.getEncoder().encode(cleartxtPW.getBytes());


        println(encryptedPW);              // prints the method reference not the encrypted pw
        println(new String(encryptedPW));  // prints the encrypted pw


        byte[] decrypt = Base64.getDecoder().decode(encryptedPW);
        println(new String(decrypt));       // prints the decrypted pw


    }

}