package JavaSyntax.Level9.Lesson8.Task2;

//Задача 2
//Группа перехвата исключений
//Уровень - EASY

//Есть 3 исключения, последовательно унаследованные от Exception
// (Exception1 extends Exception, Exception2 extends Exception1 и Exception3 extends Exception2).
// В программе вы найдете метод public static void method1() throws Exception1, Exception2, Exception3.
// Задача: написать ловца catch, который перехватит все три Exception1, Exception2 и Exception3.


//1. Есть три исключения последовательно унаследованные от Exception:
//2. class Exception1 extends Exception
//3. class Exception2 extends Exception1
//4. class Exception3 extends Exception2
//5. Есть метод, который описан так:
//public static void method1() throws Exception1, Exception2, Exception3
//6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
//
//Требования:
//Метод main должен вызывать метод method1.
//Метод main должен перехватывать исключение Exception1.
//Метод main должен перехватывать исключение Exception2.
//Метод main должен перехватывать исключение Exception3.
//Метод method1 не изменять.

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        }
        catch (Exception1 e1){} // достаточно только одного, т.к. остальные унаследованы от него

    }
    public  static void method1() throws Exception1,Exception2, Exception3{

        int i= (int)(Math.random()*3);
if(i==0){
    throw new Exception1();
}
else  if(i==1){
    throw new Exception2();
}
else if(i==2){
    throw new Exception3();
}
    }
}
class Exception1 extends Exception{}
class Exception2 extends Exception1{}
class Exception3 extends Exception2{}