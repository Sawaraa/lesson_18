import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;


public class MyEntry <K, V> {

    K key;
    V name;


    List<V> array;
    LinkedHashMap<K, V> map;
    public MyEntry() {
        this.map = new LinkedHashMap<>();
       // this.array = new ArrayList<>();
    }

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
