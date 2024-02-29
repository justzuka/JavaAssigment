import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static boolean isHappy(String s){
        if (s.length() <= 1){
            return true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                return false;
            }
        }

        return true;
    }
    public static int numberOfHappyStrings(List<String> strings){
        int counter = 0;

        Iterator<String> it = strings.iterator();

        while (it.hasNext()){
            if (isHappy(it.next())){
                counter += 1;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        System.out.println("" + numberOfHappyStrings(List.of("abbcc", "abc", "abcabc", "cabcbb"))); // 2
        System.out.println("" + numberOfHappyStrings(List.of("a", "b", "c", "cac"))); // 4
        System.out.println("" + numberOfHappyStrings(List.of("abab", "bababb", "cba"))); // 2
    }
}
