package webadv.a17206112.p01;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String account, pwd;
        try {
            bufferedReader = new BufferedReader(new FileReader("account.txt"));
            account = bufferedReader.readLine();
            pwd = bufferedReader.readLine();

            if (
                    account.equals(args[0]) && pwd.equals(sha256hex(args[1]) )) {
                System.out.println("login success!!");
            } else {
                System.out.println("login failed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}


