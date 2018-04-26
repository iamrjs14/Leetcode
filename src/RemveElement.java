import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemveElement {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,3,4,5,6,5};
        String[]  str = Arrays.toString(arr).replaceAll("[\\[\\]\\ \"]", "").split(",");
        List<String> lst = new ArrayList<String>(Arrays.asList(str));
        System.out.println(lst.size());
        for(String s : lst) {
            if(Integer.valueOf(s)==5){
                lst.remove(s);
            }
        }
        System.out.println(lst.toArray().length);
    }
}
