package Level6.Lesson8.Task6;
// ЗАДАЧА 6
//Контролируем массу тела
// MEDIUM

//У Элли — истерика: ей кажется, что она толстая.
//Что дальше? Никаких выходов в свет, разве что с соседками на лавочку.
//Выкуп двух мест в самолёте. В лифте — постоянный перевес и стыд.
//Дно и разрушение. Мир тёмен, сер и вязок. Но постойте, не преувеличивает ли Элли?
//Напишем для неё программку, считающую индекс массы тела и успокоим её (или наоборот).

//
import java.io.*;
public class Solution {

    public static void main(String[] args) throws IOException {
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш вес в КГ и рост в МЕТРАХ (например  - 1.64 / 1.75");
double weight= Double.parseDouble(reader.readLine());
double height=Double.parseDouble(reader.readLine());

Body.calculateMassIndex(weight,height);

    }
    public static class Body{
        public static void calculateMassIndex(double weight, double height)
            {
                double index=weight/(height*height);
                if(index<18.5){
                    System.out.println("Недовес: меньше чем 18.5");
                            }
                else if (index>=18.5 && index<25){
                    System.out.println("Нормальный: между 18.5 и 25");}
                else if (index>=25 && index<30)
                {
                    System.out.println("Извыточный вес:между 25 и 30");
                                    }
                else  if (index>=30)
                {
                    System.out.println("Ожирение: 30 или более ");
                }
            }
    }
}
