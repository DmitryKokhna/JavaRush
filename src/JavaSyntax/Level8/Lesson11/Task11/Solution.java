package JavaSyntax.Level8.Lesson11.Task11;

//Задача 11

// Модернизация ПО

//Вы, вероятно, видели, как обновляются приложения.
// Это происходит, если в их код внесли изменения.
// В секретном центре JavaRush вам выдали код, который нужно изменить (добавить новую функциональность).
// Сейчас программа определяет, какая семья живёт в доме с указанным номером,
// а после вашего вмешательства она должна выдавать город проживания семьи.


//Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//Новая задача: Программа должна работать не с номерами домов, а с городами:
//
//Пример ввода:
//Москва
//Ивановы
//Киев
//Петровы
//Лондон
//Абрамовичи
//
//Лондон
//
//Пример вывода:
//Абрамовичи
//
//Требования:
//Программа должна выводить текст на экран.
//Программа должна считывать значения с клавиатуры.
//Класс Solution должен содержать один метод.
//Программа должна вывести фамилию семьи по введенному городу.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //     List<String> list = new ArrayList<>();  - из стартового условия
        Map<String, String> map = new HashMap<>(); // Семья - значение Город - ключ


        while (true) {
            String city = reader.readLine(); // вводим город
            //делаем проверку да ввод годода, до проверки ввода фамилии
            if (city.isEmpty()) {
                break;
            }
            String family= reader.readLine(); // вводим фамилиюю


            map.put(city,family); //заполняем мапу


            // list.add(family); - из стартового условия
        }

        // проверка введенного - по заданию не трубуется, но делаем для себя
//        for (Map.Entry<String, String> mapIterator1 : map.entrySet()) {
//         String city=mapIterator1.getKey();
//         String family=mapIterator1.getValue();
//            System.out.println("Семья " + family + " живет в " + city );
//        }

            // read the house number - чисто для проверки что ничего не нашло
//        int countSearch=0;
    //    System.out.println("___Введите город для поиска___");  //- по заданию  не трубудется
//
        // вводим грод для поиска
          String cityForSearch = reader.readLine();

            //  int houseNumber = Integer.parseInt(reader.readLine()); -  - из стартового условия

//        if(0<=houseNumber && houseNumber < list.size()){  //- из стартового условия
//            String familyName = list.get(houseNumber); //- из стартового условия
//            System.out.println(familyName); //- из стартового условия

        //проходм мапу
            for (Map.Entry<String, String> mapIterator2 : map.entrySet()) {

                String keyCity = mapIterator2.getKey();
//сравниваем полученное значение города из мапы с введенным
                if (keyCity.equals(cityForSearch)) {
                    System.out.println(mapIterator2.getValue());
            //      countSearch=countSearch+1;
                }
            }
//        if (map.size()==0 ) {
//            System.out.println("не заполнено");
//        } else if(countSearch==0){
//            System.out.println("не найдено");
//        }

    }

    }


