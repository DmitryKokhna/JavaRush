package JavaSyntax.Level6.Lesson11.Task4;
// ЗАДАЧА 4
// Минимальное число статиков
// Уровень - Medium
//Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
public class Solution {
    public static int step;

    public static void main(String[] args) {
        method1();
    }
  static   public void  method1() {
        method2();
            }
          static   public void method2() {
        new Solution().method3();
            }
            public void method3() {
        method4();
            }
            public void method4()
            {
                step++;
                for (StackTraceElement element :  Thread.currentThread().getStackTrace())
                    System.out.println(element);
                if(step>1)
                    return;
                main(null);

            }
}
