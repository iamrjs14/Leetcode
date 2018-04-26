import java.util.*;
import java.util.stream.Collectors;

public class MaximumGuest {

    void findGuest(List<Integer[]> lst) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < lst.size(); i++) {
            Integer[] a1 = lst.get(i);
            map.put(i, a1[1] - a1[0]);
        }
        List<Integer> lst2 = map.values().stream().sorted().collect(Collectors.toList());
        System.out.println(lst2.get(lst.size()-1));
    }

    public static void main(String[] args) {

        MaximumGuest mg = new MaximumGuest();
        List<Integer[]> lst = new ArrayList<Integer[]>();
        Integer[] a1 = {1, 4};
        Integer[] a2 = {2, 4};
        lst.add(a1);
        lst.add(a2);
        mg.findGuest(lst);
        TreeSet ts = new TreeSet(lst);

    }
}
