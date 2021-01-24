package JavaRushMy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int in=Integer.parseInt(reader.readLine());


            while (in > 0) {
                int lastDigit = in % 10;
                if(lastDigit%2==0){
                    even++;
                } else {
                    odd++;
                }
                in /= 10;
            }
            System.out.println("Even "+even+" "+"Odd "+odd);
        }
    }

