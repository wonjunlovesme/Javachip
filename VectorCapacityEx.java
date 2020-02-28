import java.util.Vector;

public class VectorCapacityEx{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();

        for(int i=0; i<19; i++){
            v.add(i);
        }
        System.out.println(v.capacity());
    }
}