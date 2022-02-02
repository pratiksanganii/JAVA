// import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("h");
        st.append("e");
        System.out.println(st);
        st.insert(2, "l");
        System.out.println(st);
        st.delete(0, 3);
        System.out.println(st);
        st.append("hello");
        System.out.println(st);
        System.out.println(st.length());
        StringBuilder h = new StringBuilder("hello");
        for(int i=0;i<(h.length()/2);i++){
            int front = i;
            int back = h.length()-1-i;
            char frontChar = h.charAt(front);
            char backChar = h.charAt(back);
            h.setCharAt(front, backChar);
            h.setCharAt(back, frontChar);
        }
        System.out.println(h);
    }
}
