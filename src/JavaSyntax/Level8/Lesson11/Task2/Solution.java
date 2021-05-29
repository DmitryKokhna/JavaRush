package JavaSyntax.Level8.Lesson11.Task2;

//Задача 2
//Множество всех животных

// Уровень - HARD
//Занесем животных в множества.
// Сначала создадим классы Cat и Dog, затем — методы createCats и createDogs
// (возвращают множества с собаками и кошками), метод join, возвращающий конгломерат из множеств собак и кошек.
// На случай недобрососедства — метод removeCats, удаляющий из pets котов.
// И ещё — метод printPets, пусть выводит на экран всех обитателей pets


//1. + Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
//2. + Реализовать метод createCats, который должен возвращать множество с 4 котами.
//3. + Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
//4. + Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
//5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
//6. + Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
//Каждое животное с новой строки.
//
//Требования:
//Программа должна выводить текст на экран.
//Внутри класса Solution должны быть созданы public static классы Cat, Dog.
//Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
//Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
//Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
//Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
//Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats=createCats();
        Set<Dog> dogs=createDogs();

        Set<Object> pets = join(cats,dogs);
        printPets(pets);

        removeCats(pets,cats);
        System.out.println("----------after -- remove -------");
        printPets(pets);

    }

    public static Set<Cat> createCats(){
        Set<Cat> result = new HashSet<Cat>();

        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs(){
      Set<Dog> dogsSet = new HashSet<>();
      Dog dog1 =  new Dog();
        Dog dog2 =  new Dog();
        Dog dog3 =  new Dog();

        dogsSet.add(dog1);
        dogsSet.add(dog2);
        dogsSet.add(dog3);

        return dogsSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs){
                Set<Object> result=new HashSet<>();
        Iterator<Cat> forCat= cats.iterator();
        Iterator<Dog> forDog= dogs.iterator();

        while (forCat.hasNext()){
            result.add(forCat.next());
        }

        while (forDog.hasNext()){
            result.add(forDog.next());
        }
        return result;

// Не работает - чтобы потом удалить!!! Почему ХЗ
//Set<Cat> catForJoin=createCats();
//Set<Dog> dogForJoin=createDogs();
//Set<Object> catsAndDogs = new HashSet<>(catForJoin);
//catsAndDogs.addAll(dogForJoin);
//        return catsAndDogs;
            }

            public static void removeCats(Set<Object> pets,Set<Cat> cats){
               pets.removeAll(cats);
            }

            public static void printPets(Set<Object> pets){
      Iterator<Object> objectIterator=pets.iterator();
      while (objectIterator.hasNext()){
          System.out.println(objectIterator.next());
      }
            }
    public static class Cat{}

    public static class Dog{}


}
