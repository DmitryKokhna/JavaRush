package JavaSyntax.Level9.Lesson11.Task10;

//Задача 10

//Код не компилится…

//Примета: если разработчик задумчиво чешет репу, рассматривая код, значит, не компилируется!
// С такими ситуациями нужно смириться и не нервничать.
// Вот вам для тренировки задача: программа вводит два имени файла.
// И копирует первый файл на место заданное вторым именем.
// И да, программа не работает. Исправьте эту оплошность.

//Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
//Требования:
//1.Программа должна считывать имена файлов.
//2.Программа должна копировать содержимое первого файла во второй.
//3.Программа должна выводить количество скопированных байт.
//4.В методе main должен вызывать метод getInputStream.
//5.Метод getInputStream изменять нельзя.
//6.В методе main должен вызывать метод getOutputStream.
//7.Метод getOutputStream изменять нельзя.

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName); // тут в () был "destinationFileName" , а нужно "sourceFileName";
        OutputStream fileOutputStream = getOutputStream(destinationFileName); // тут был   InputStream, а нужно OutputStream

        int count = 0;

        while(fileInputStream.available()>0) // тут была ";" которая мешала
        {
int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }


        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }

}
