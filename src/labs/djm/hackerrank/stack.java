package labs.djm.hackerrank;

import java.util.*;

public class stack {
    static Map<Character,Character> pMap = new HashMap<>();

    static {
        pMap.put('(', ')');
        pMap.put('{', '}');
        pMap.put('[', ']');
    }
    static boolean isBalanced(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>(s.length() / 2);

        if (!s.isEmpty()) {
            for (char c : s.toCharArray()) {

                // Current char is opening parenthesis
                if (pMap.containsKey(c)) {
                    stack.push(c);

                } else if (pMap.containsValue(c)) {

                    if (!stack.isEmpty()) {
                        Character x = pMap.get(stack.pop());

                        if (!x.equals(c))
                            return false;

                    } else {
                        return false;
                    }
                }
            }

            return stack.isEmpty();

        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            String str = s.next();
            System.out.println(isBalanced(str));
        }
    }
}
