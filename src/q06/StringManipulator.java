package q06;

public class StringManipulator {
    public static void main(String[] args) {
        StringManipulator str = new StringManipulator();
        System.out.println(str.reverse("HelloWorld"));
        System.out.println(str.reverse("HelloWorld",3));
        System.out.println(str.reverse("HelloWorld",2,9));
    }
    public String reverse(String s){
        StringBuffer sbf = new StringBuffer(s);

        sbf.reverse();

        return s;
    }
    public String reverse(String s, int n){
        StringBuffer sbf3 = new StringBuffer(s);
        String subs = sbf3.substring(0,n);
        StringBuffer sbst = new StringBuffer(subs);
        sbst.reverse();
        return subs;
    }
    // – Reverses the first n characters of a string.
    public String reverse(String s, int start, int end){
        StringBuffer sbf3 = new StringBuffer(s);
        String subs = sbf3.substring(start,end);
        StringBuffer sbst = new StringBuffer(subs);
        sbst.reverse();
        return subs;
    }
    //– Reverses a substring
}
