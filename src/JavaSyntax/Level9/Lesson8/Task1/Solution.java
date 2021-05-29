package JavaSyntax.Level9.Lesson8.Task1;

//Задача 1
//Исключения. Просто исключения.
//Уровень - EASY

//У нас есть метод.
// Он выбрасывает два исключения, унаследованные от Exception,  и два унаследованных от RuntimeException:
// NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
// Задание: перехват NullPointerException и FileNotFoundException, без перехвата ArithmeticException и URISyntaxException. Как это сделать?

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

//Требования:
//1.Метод main должен вызывать метод method1.
//2.Метод main должен перехватывать исключение NullPointerException.
//3.Метод main должен перехватывать исключение FileNotFoundException.
//4.Метод main не должен перехватывать исключение ArithmeticException.
//5.Метод main не должен перехватывать исключение URISyntaxException.
//6.Метод method1 не изменять.
public class Solution {
    public static void main(String[] args) throws Exception {
        //code
        try {
            method1();
        }
        catch (NullPointerException nullPointerException){} // если CATCH пустой, то фигурные скобки нужны все одно
        //    System.out.println(nullPointerException);

        catch (FileNotFoundException fileNotFoundException){}
        //    System.out.println(fileNotFoundException);

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i=(int)(Math.random()*4);
        if(i==0){
            throw new NullPointerException();
        }
        else if(i==1){
            throw new ArithmeticException ();
                    }
        else if (i==2) {
            throw new FileNotFoundException();
        }
        else if(i==3){
            throw new URISyntaxException("", "");
        }
    }
}
