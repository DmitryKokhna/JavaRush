package JavaSyntax.Level8.Lesson8.Task1;

//Задача 1
//20 слов на букву «Л»
//Уровень - EASY

// У вас есть любимая буква? Впрочем, ваши предпочтения в этой задаче роли не играют.
// У вашего методиста (того, который придумал эту задачу) это буква «Л», поэтому придется работать с ней, даже если вам она несимпатична.
// Вам нужно создать множество строк (Set <String>) и занести в него 20 слов на букву «Л». Вот, собственно, и всё.

// Создать множество строк (Set<String>),
//занести в него 20 слов на букву "Л"
//Требования
//1. Не изменять заголовок метода createSet().
//2. Не вводить текст на экран
//3.  Не считывать текст с клавиатуры
//4. Метод createSet() должен создавать и возвращать множество (реализация HashSet)
//5. Множество должно содержать 20 слов на букву "Л"

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public  static Set<String> createSet() {
        Set<String> stringSet = new HashSet<>();
        for(int i=0;i<20;i++){
            stringSet.add("Л"+i);
        }

return stringSet;
    }

    public static void main(String[] args) {
  //      System.out.println(createSet().toString());  // по заднию не нужно - проверяем заполнение
    }
}
