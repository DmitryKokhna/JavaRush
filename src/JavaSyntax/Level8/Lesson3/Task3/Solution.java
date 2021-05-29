package JavaSyntax.Level8.Lesson3.Task3;
//Задача 3
// Коллекция Map из котов
//Уровень - Easy

//Мы тут решили собрать коллекцию котов, и составить для неё правильный КОТолог.
// В этой программке кто-то уже потрудился написать класс Cat с полем имя (name).
// Наша задача — создать коллекцию Map, и добавить в неё 10 котов. Для начала хватит.
// В качестве ключа, как вы, наверное, уже догадались, следует использовать имя кота.

//Есть класс Cat с полем имя (name, String).
//Создать коллекцию Map<String, Cat> (реализация HashMap).
//Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//Вывести результат на экран, каждый элемент с новой строки.
//
//Требования:
//Программа не должна считывать значения с клавиатуры.
//В методе addCatsToMap() объяви переменную коллекции Map с типом элементов String, Cat и сразу проинициализируй ee.
//Метод addCatsToMap() должен добавлять в коллекцию всех котов из массива String[] cats, согласно условию.
//Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] cats =  new    String[]{"васька","мурка","дымка","рыжик","серый","снежок","босс","борис","визя","гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for(Map.Entry<String,Cat> pair :map.entrySet())
        {
            System.out.println(pair.getKey()+ " - " + pair.getValue());
           }

    }

    public static Map<String, Cat> addCatsToMap(String[] cats)
    {
Map<String,Cat>  catMethod = new HashMap<>();
for(int i=0; i< cats.length;i++)
{
    String str=cats[i];
    catMethod.put(str, new Cat(str));
}
return catMethod;
    }

    public static class Cat{
String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name !=null ? name.toLowerCase() : null;
        }
    }
}
