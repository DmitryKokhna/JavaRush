package Level10.Lesson4.Task7;

//Задача 7
//Задача №7 на преобразование целых типов
//Уровень - EASY

//Седьмая задача цикла «Преобразование целых типов» — финальная.
// Для начала хватит и семи. В ней вы не найдете ничего оригинального, зато получите знания.
// Итак, есть код, а в нем — много операторов приведения типов. Уберите лишние и будьте счастливы!
// Этот цикл подготовил профессор Нуддлз, специально для учебного центра JavaRush. Не забрасывайте учёбу.

/*

 long l = (byte) 1234_564_890L;
        int x = (byte) 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = (byte) l++ + 10 + ++x -(float) m;
         l = (long) f/ 1000;
         //Нужно получить  ответ:"1234567"
 */
public class Solution {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        System.out.println(l+ " l1");
        int x = 0b1000_1100_1010;
        System.out.println(x+" X");
        double m = (byte) 110_987_654_6299.123_34;
        System.out.println(m+ " m");
        float f = l++ + 10 + ++x -(float)m;
        System.out.println(f+ " f");
         l = (long) f/ 1000;
        System.out.println(l);
    }
}
