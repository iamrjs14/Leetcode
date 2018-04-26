import java.util.ArrayList;
import java.util.List;

class mergeInterval {

    int start;
    int end;

    public mergeInterval() {
    }

    public mergeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

public class Solution {

    public static void main(String[] args) {
        List<mergeInterval> lst = new ArrayList<mergeInterval>();
        lst.add(new mergeInterval(1, 3));
        lst.add(new mergeInterval(2, 6));
        lst.add(new mergeInterval(8, 10));
        lst.add(new mergeInterval(15, 18));
        List<List<Integer>> lst2 = new ArrayList<>();

        for (int i = 0; i < lst.size(); i++) {
            List<Integer> intArray = null;
            for (int j = lst.get(i).getStart(); j <= lst.get(i).getEnd(); j++) {
                intArray = new ArrayList<Integer>();
                intArray.add(j);
            }
            lst2.add(intArray);
            System.out.println(lst2.size());
        }
    }
}