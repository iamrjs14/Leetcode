public class SetMatrix {

    public static void main(String[] args) {

        int m = 320;
        SetMatrix sm = new SetMatrix();
        sm.reverseInt(m);
    }

    private void reverseInt(int m) {
        StringBuffer sb = new StringBuffer();
        String st = sb.append(String.valueOf(m)).reverse().toString();
        System.out.println(Integer.valueOf(st));
    }
}
