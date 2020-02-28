import java.util.*;

public class HashMapeScoreEx{
    public static void main(String[] args){
        HashMap<String, Integer> js = new HashMap<String, Integer>();

        js.put("서유정", 99);
        js.put("최종현", 90);

        Set<String> keys = js.keySet();

        Iterator<String>it = keys.iterator();

        while(it.hasNext()){
            String name = it.next();
            int score = js.get(name);
            System.out.println(name + ":" + score);
        }
    }
}