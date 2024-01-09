import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;


public class MyEntry <K, V> {

    K key;
    V name;

    public MyEntry(K obj1, V obj2) {
        super();
        this.key = obj1;
        this.name = obj2;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Map{" +
                "key = " + key +
                ", name = " + name +
                '}';
    }


}

class Map <K, V> {
    private List<MyEntry<K, V>> list;

    public Map() {
        this.list = new ArrayList<>();
    }

    public void add(K key, V name) {
        MyEntry<K, V> entry = new MyEntry<>(key, name);
        list.add(entry);
        System.out.println("Ключ - " + key + ", Значення - " + name);

    }

    public void removeKey(K key) {

        for (Iterator<MyEntry<K, V>> iterator = list.iterator(); iterator.hasNext(); ) {
            MyEntry<K, V> entry = iterator.next();
            if (entry.getKey().equals(key)) {
                iterator.remove();
                System.out.println("Об'єкт з ключем - " + key + " був видаленим");
            }
        }
    }

    public void removeValue(V value){

        for(Iterator<MyEntry<K, V>> iterator = list.iterator(); iterator.hasNext();){
            MyEntry<K, V> next = iterator.next();
            if (next.getName().equals(value)){
                iterator.remove();
                System.out.println("Об'єкт з іменем - " + value + " був видаленим");
            }
        }

    }

    public void output(){
        for (MyEntry<K, V> entry : list) {
            System.out.println(entry.toString());
        }
    }

    public void outputSetKey(){
        for(MyEntry<K,V> entry : list){
            System.out.println(entry.getKey());
        }
    }

    public void outputListValue(){
        for(MyEntry<K,V> entry : list){
            System.out.println(entry.getName());
        }
    }
}
