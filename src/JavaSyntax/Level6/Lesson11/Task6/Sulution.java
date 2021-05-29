package JavaSyntax.Level6.Lesson11.Task6;
//ЗАДАЧА 6
//KissMyShinyMetalAss
// Уровень - EASY

//На планете Диких Роботов никого не учат ни писать, ни программировать.
//Поэтому когда робота А. забрали из его естественной среды и перевезли на космокорабль,
//оказалось, что он не может даже подписать контракт.
//Поможем роботу А.: создадим для него класс KissMyShinyMetalAss для подписывания контрактов.

// Изначальный код
/*
public class Sulution {
    public static class  ?????
    {

    }

    public static void main(String[] args) {
        System.out.println(?????);
    }
}
 */

public class Sulution {
    public static class  KissMyShinyMetalAss
    {
String name="Dima"; // добавим переменную - по заданию не требуется

        @Override // тут переопределим to String для вывода имени и проверки, что объект выводится
        public String toString() {
         return name;
        }
    }

    public static void main(String[] args) {
        KissMyShinyMetalAss abj=new KissMyShinyMetalAss();
        System.out.println(abj.toString());
    }
}
