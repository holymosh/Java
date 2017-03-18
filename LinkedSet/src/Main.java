/**
 * Created by дшшр on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedSet <Integer> linkedSet = new LinkedSet <Integer>();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(1);
        Object[] values = linkedSet.toArray();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
