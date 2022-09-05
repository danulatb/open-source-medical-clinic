package lk.ijse.dep9.clinic.misc;

import org.apache.commons.codec.digest.DigestUtils;

public class CryptoUtil {
    public static void main(String[] args) {
        String plainpassword = "dfgdg";

        String cipherText = DigestUtils.sha256Hex(plainpassword);
        System.out.println(cipherText);


        String[] passwords = {"admin","doc123","doc456","rec123","rec456"};
        for (String password : passwords) {
            System.out.printf("%s: %s\n",password,getShaw256(password));
        }

    }


    public static String getShaw256(String input){
        return DigestUtils.sha256Hex(input);
    }

}
