package JavaSyntax.Level6.Lesson8.Task3;
// ЗАДАЧА 3
//Расстояние между двумя точками
// MEDIUM

//Вы в курсе, что между любыми двумя точками на плоскости можно провести прямую?
// Наверное, в курсе, а если нет — Евклид и его «Начала» к вашим услугам.
// Хотя лучше принять на веру этот постулат и написать статический метод double getDistance(x1, y1, x2, y2).
// Он должен вычислять расстояние между точками.

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2 )
    {
 return    Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        }

    public static void main(String[] args) {

    }
}
