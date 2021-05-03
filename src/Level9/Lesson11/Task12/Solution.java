package Level9.Lesson11.Task12;

//Задача 11

//Обогатим код функциональностью!

//Уровень - Medium

//Старая задача: вводится 2 имени файла, первый файл копируется на место, заданное вторым именем.
// Новая задача: вводится 2 имени файла, первый файл копируется на место, заданное вторым именем.
// Если файла, который нужно копировать, не существует,
// то программа об этом сообщает и еще раз читает имя файла с консоли, а уже потом считывает файл для записи.

//Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
//Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
//Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не существует."
// и еще один раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
//
//Требования:
//Программа должна считывать имена файлов.
//Метод main должен обрабатывать исключения кидаемые методом getInputStream. Если возникло исключение, нужно вывести сообщение «Файл не существует.».
//Программа должна копировать содержимое первого файла во второй.
//В методе main должен вызываться метод getInputStream.
//Метод getInputStream изменять нельзя.
//В методе main должен вызываться метод getOutputStream.
//Метод getOutputStream изменять нельзя.

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;

            String sourceFileName=null;
            String destinationFileName = null;

            InputStream fileInputStream = null;

                while (count <= 2) {

            try {
                sourceFileName = reader.readLine();
                destinationFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
                count++;

            } catch (FileNotFoundException fnfe) {
                System.out.println("Файл не существует.");
                sourceFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
                count++;
if(count>2){
    break;
}
            }
            OutputStream fileOutputStream = getOutputStream(destinationFileName);


            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
