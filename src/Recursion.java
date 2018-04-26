import java.util.Scanner;

public class Recursion
{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        Recursion r = new Recursion();
        r.printMe(str);

    }

    private void printMe(String str) {

        if(str.length()==1) {
            System.out.println(str);
        } else {
            int end = str.length();
            System.out.println(str.substring(end-1,end));
        }

    }


}


