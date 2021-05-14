package Level10.Lesson11.Task11;

//Задача 11
//Поправочки нужны
//Уровень - EASY

//И снова чужие ошибки преграждают нам путь в светлое будущее. Хотя, может, наоборот, прокладывают:
// без них сложно стать программистом. Держите неработающую программу и поработайте с ней так, чтобы она скомпилировалась.
// Она демонстрирует работу HashMap: вводит с клавиатуры пары (номер и строку), помещает их в HashMap и выводит на экран его содержимое.

//Наша программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
//Нужно исправить программу так, чтобы она скомпилировалась.
//
//Требования:
//Программа должна считывать данные с клавиатуры.
//Программа должна выводить текст на экран.
//Класс Solution должен содержать три переменные.
//Программа должна помещать в HashMap 10 пар (номер и строка), считанных с клавиатуры.
//Программа должна выводить на экран содержимое HashMap. Каждое значение - с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    HashMap<Integer, String> map; // тут меняем "int" на "Integer"
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<Integer, String>(); // тут меняем "int" на "Integer"
  // map.put(index, name); // тут нужно закоментить строку или ее убрать, т.к. конструктор при создании Мап поместить туда NULL
    }
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);

        }
        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {   // тут меняем "int" на "Integer"
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
          }

      System.out.println(solution.map.size()+" это размерность Мап через ++"); // добавлена самостоятельно для проверки размерности  МАП

    }
    }
