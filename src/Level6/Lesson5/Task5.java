package Level6.Lesson5;
// ЗАДАЧА № 5 из 5
// HARD

//Чётные и нечётные циферки
//        Давайте определим, сколько четных цифр, а сколько нечетных в числе, введенном с клавиатуры.
//        Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//        Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
//        Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
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

