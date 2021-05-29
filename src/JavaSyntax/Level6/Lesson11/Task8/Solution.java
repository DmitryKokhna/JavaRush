package JavaSyntax.Level6.Lesson11.Task8;
// ЗАДАЧА 8
// Исправляем ошибки юности
// Уровень - EASY

//Бывает, работает кодер, такой на проекте, старается.
//Открывает чужой модуль, а тот не только не работает правильно, но и не компилируется.
//Этого не избежать в компаниях, где больше одного кодера.
//Поэтому с младых ногтей приучаемся читать чужой код и выискивать в нём ошибки.
//Заставьте эту программу вывести максимальное число из двух введенных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int max=100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String maxText="The max is "; // исходный код содержал одинаковые имена переменных
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        max = a >b ? a : b;
        System.out.println(maxText+max);
    }

}
