package JavaSyntax.Level10.Lesson4.Task6;

//Задача 6
//Задача №6 на преобразование целых типов
//Уровень - EASY

//Вот и шестая задача цикла «Преобразование целых типов» подоспела.
// Мы тут почему стараемся? Хотим, чтобы вы усвоили эти приемы так, чтобы не приходилось переучиваться.
// В этот раз в нашей задаче операторов приведения типов слишком много, затесались лишние.
// Найдите их и уберите, чтобы получить требуемый ответ.
/*    double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = (short)150000;
        float f = (short) 0.50f;
        double result = f+ (i/c) - (d*s) - 500e-3;
        // Уберите ненужные операторы, чтобы ответ RESULT:1000.0
        */
public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f+ (i/c) - (d*s) - 500e-3;

        System.out.println("result: " +result);
    }
}
