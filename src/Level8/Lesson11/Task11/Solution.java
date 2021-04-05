package Level8.Lesson11.Task11;

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
        //     List<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>(); // Семья - ключ, Город - значение

        System.out.println("---Введите любые символ \"Д\" для начала каждой записи или нажмите ввод для окончания ---");
        while (true) {


            String family;
            String city;
            String start = reader.readLine();
            if (!start.equals("Д")) {
                break;
            } else {
            System.out.println("--- введите фамилию ---");
                family = reader.readLine();
                System.out.println("--- введите город ---");
                city = reader.readLine();
            }

            map.put(family, city);

            // list.add(family);
        }
        // проверка введенного
        for (Map.Entry<String, String> mapIterator1 : map.entrySet()) {
            String cityFromMap = mapIterator1.getValue();
            String familyFroomMap = mapIterator1.getKey();
            System.out.println("Семья " + familyFroomMap + " живет в " + cityFromMap);
        }
            // read the house number
        int countSearch=0;
            System.out.println("___Введите город для поиска___");

            String cityForSearch = reader.readLine();

            //  int houseNumber = Integer.parseInt(reader.readLine());

//        if(0<=houseNumber && houseNumber < list.size()){
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);

            for (Map.Entry<String, String> mapIterator2 : map.entrySet()) {

                String valueCity = mapIterator2.getValue();

                if (cityForSearch.equals(valueCity)) {
                    System.out.println("В городе "+cityForSearch+" живет семья - " + mapIterator2.getKey());
                  countSearch=countSearch+1;
                }
            }
        if (map.size()==0 ) {
            System.out.println("не заполнено");
        } else if(countSearch==0){
            System.out.println("не найдено");
        }

    }

    }


