import java.util.ArrayList;
import java.util.List;

public class Aplication {
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            int a = 1;
            String name = "eded";
        //  list.add(name); виникає помилка так як name - це String а list має Generics - Integer
            list.add(a);

    }
}
