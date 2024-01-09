import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void list(){
        System.out.println();
        System.out.println("1. Додавали новий об’єкт");
        System.out.println("2. Видаляли об’єкт мапи за ключем ");
        System.out.println("3. Видаляли об’єкт мапи за значенням");
        System.out.println("4. Виводили на екран Set ключів");
        System.out.println("5. Виводили на екран List значень");
        System.out.println("6. Виводили на екран цілу мапу");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> map = new Map<Integer, String>();

        while (true){
            list();
            System.out.println("Оберіть дію:");
            int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    System.out.println("Введіть ключ:");
                    int key = scanner.nextInt();
                    System.out.println("Введіть ім'я:");
                    String name = scanner.next();
                    map.add(key, name);
                    break;
                }

                case 2: {
                    System.out.println("Введіть ключ об'єкта якого хочете видалити");
                    int key = scanner.nextInt();
                    map.removeKey(key);
                    break;
                }
                case 3: {
                    System.out.println("Введіть ім'я об'єкта якого хочете видалити");
                    String name = scanner.next();
                    map.removeValue(name);
                    break;
                }
                case 4: {
                    System.out.println("Set ключів:");
                    map.outputSetKey();
                    break;
                }
                case 5: {
                    System.out.println("List значень:");
                    map.outputListValue();
                    break;
                }
                case 6: {
                    map.output();
                    break;
                }
                default:
                    System.out.println("Це число не входить у діапазон 1-6");
                    break;
            }
        }
    }
}