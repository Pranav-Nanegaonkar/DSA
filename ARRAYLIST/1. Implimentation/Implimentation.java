import java.util.ArrayList;
import java.util.List;

public class Implimentation {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
        months.add("jan");
        months.add("march");
        months.add("april");
        System.out.println("Size is " + months.size());
        System.out.println(months);
        months.add(1, "feb");
        System.out.println(months);
        String ud = months.set(2, "LOL");
        System.out.println(ud);
        System.out.println(months);
        String s1 = months.get(0);
        System.out.println(s1);
        System.out.println("Size is " + months.size());
        System.out.println(months.lastIndexOf("jan"));
        System.out.println(months.indexOf("feb"));
    }
}
