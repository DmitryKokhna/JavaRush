package Level6.Lesson8.Task5;
// ЗАДАЧА 5
//Класс StringHelper
// MEDIUM

//Мы любим статические методы, они делают недоступное доступным. Хотя порой и наоборот…
//Но в этой задаче мы их любим: нам необходимо создать класс StringHelper,
//у которого будут 2 статических метода. Это multiply(String s, int count) – возвращает строку,
//повторенную count раз и multiply(String s) – возвращает строку, повторенную 5 раз.
public class StringHelper {
    public static String multiply(String text){
        String result="";
        for(int i=1; i<=5; i++)
        {
            result=result+text;
        }
        return result;
    }

    public static String multiply(String text, int count){
        String result="";
        for(int i=1; i<=count; i++){
            result=result+text;

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(multiply("Hello",5));
        System.out.println(multiply("Hello2"));

    }
}

