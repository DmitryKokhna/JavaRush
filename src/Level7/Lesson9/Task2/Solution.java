package Level7.Lesson9.Task2;
//ЗАДАЧА 2
// Слова в обратном порядке
//Уровень - EASY
//Если половина или больше ваших действий вам кажутся лишёнными смысла, не переживайте:
// скорее всего, вы чётко осознаете бренность бытия, а, значит, можете стать классным программистом.
// И еще: иногда — просто кажется. Здесь есть смысл: введите 5 слов, поместите их в список.
// Удалите третий элемент списка, и выводите оставшиеся элементы в обратном порядке.

//Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
//
//        Требования:
//        Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//        Считай 5 строк с клавиатуры и добавь их в список.
//        Удали третий элемент списка.
//        Выведи элементы на экран, каждый с новой строки.
//        Порядок вывода должен быть обратный

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>  arrayList=new ArrayList<String>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5;i++){
          arrayList.add(reader.readLine());
        }
           arrayList.remove(2);
        for (int i=arrayList.size()-1;i>=0;i--){
            System.out.println(arrayList.get(i));
        }
    }
}
