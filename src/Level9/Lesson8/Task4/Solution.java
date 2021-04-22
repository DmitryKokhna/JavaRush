package Level9.Lesson8.Task4;

//Задача 4
//Перехват checked-исключений
//Уровень - EASY

//На лекциях секретного центра JavaRush нас учили,
// что если в методе выбрасываются (возникают) исключения ClassNotFoundException и FileNotFoundException,
// программист просто обязан указать их в сигнатуре метода (в заголовке метода).
// Это и есть checked исключения.
// Давайте обработаем их в методе handleExceptions и выведем их на экран.

//В методе handleExceptions обработайте все checked исключения.
//Нужно вывести на экран возникшее checked исключение.
//Можно использовать только один блок try..catch
//
//Требования:
//Метод handleExceptions должен вызывать метод method1.
//Метод handleExceptions должен вызывать метод method2.
//Метод handleExceptions должен вызывать метод method3.
//Метод handleExceptions должен использовать только один блок try..catch.
//Метод handleExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
//Программа должна выводить на экран текст.

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj){
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e){
            System.out.println(e);
        }


    }
    public void method1() throws IOException{
        throw  new IOException();
    }
    public  void method2() throws NoSuchFieldException{
         throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException{
        throw new RemoteException();
    }
}
