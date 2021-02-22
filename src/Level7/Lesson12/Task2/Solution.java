package Level7.Lesson12.Task2;
// ЗАДАЧА 2
//Перестановочка подоспела
// Уровень - HARD
// Игры со списками — лучшее времяпрепровождение! Реклама так себе получается?
// Пожалуй, лучшая реклама средства языка программирования — его частое применение.
// Рекламируем списки, решая задачу: задаем числа m и n, печатаем n строк и заполняем ими список.
// После этого совершаем незатейливую манипуляцию: переставляем m первых строк в конец списка

//Ввести с клавиатуры 2 числа N и M.
//Ввести N строк и заполнить ими список.
//Переставить M первых строк в конец списка.
//Вывести список на экран, каждое значение с новой строки.
//
//Примечание: запрещено создавать больше одного списка.
//
//Требования:
//Объяви переменную типа список строк и сразу проинициализируй ee.
//Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//Переставить M первых строк в конец списка.
//Выведи список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        int N=Integer.parseInt(reader.readLine());
        int M=Integer.parseInt(reader.readLine());

        for (int i=0;i<N;i++){
            list.add(reader.readLine());
        }

        for (int i=0;;i++){
            String tempS=list.get(i);
            list.add(tempS);
            list.remove(i);
            i--;
            M=M-1;
            if(M==0){
                break;
            }
        }
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
