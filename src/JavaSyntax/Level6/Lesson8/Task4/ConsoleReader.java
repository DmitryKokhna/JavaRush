package JavaSyntax.Level6.Lesson8.Task4;
// ЗАДАЧА 4
//Класс ConsoleReader
// MEDIUM

//Сегодня студенты секретного центра JavaRush получили задание по чтению.
//Им (и вам) нужно создать класс ConsoleReader с 4 статическими методами: один из них считывает с клавиатуры строку, другой — целое число, третий — дробное.
//Четвертый отличается: он считывает с клавиатуры строку true или false и возвращает соответствующую логическую переменную.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        return  str;
            }

            public  static int readInt() throws IOException{
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                int in=Integer.parseInt(reader.readLine());
                return in;
            }

            public  static double readDouble() throws IOException{
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double  db=Double.parseDouble(reader.readLine());
        return  db;
            }

            public static boolean readBoolean () throws IOException{
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                boolean bl=Boolean.parseBoolean(reader.readLine());
                return bl;
            }
}
