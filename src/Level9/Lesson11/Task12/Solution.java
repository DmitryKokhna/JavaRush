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

//!!!!! КРИВОЕ ЗАДАНИЕ
//ШАГИ
//1.Запустить ввод имени Первого файла
//2. Обработать Первый файл через ВходнойПоток
//3.Если введенного имени  Первогофайла не существует то.
//4. Еще раз запустить ввод имени Первого файла.
//5. Обработать имя Первого через ВходнойПоток.
//6. ТОЛЬКО ЗАТЕМ - запустить ввод имени Второго файла.
//7. Обработать Второй файл через ВыходнойПоток
//8. Дальше обычное копирование из кода, который дан изначально.

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        InputStream fileInputStream;

        try {
            fileInputStream = getInputStream(sourceFileName);

        } catch (FileNotFoundException fnfe) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

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
