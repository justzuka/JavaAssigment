public class Test1 {
    public static int eCase(char e, int res, int v) {
        return switch (e) {
            case '+' -> res + v;
            case '-' -> res - v;
            default -> v;
        };
    }

    public static int evaluateExpression(String expression){
        if (expression.equals("")){
            return 0;
        }
        StringBuilder str = new StringBuilder();
        char e = 'n';
        int result = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (i == expression.length() - 1){
                str.append(c);
            }
            if (c == '+' || c == '-' || i == expression.length() - 1){
                int v = Integer.parseInt(str.toString());
                result = eCase(e, result, v);
                e = c;
                str.setLength(0);
            }
            else{
                str.append(c);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Assuming that input is correct.
        System.out.println(evaluateExpression("5+20-8+5")); // 22
        System.out.println(evaluateExpression("5")); // 5
        System.out.println(evaluateExpression("0+10")); // 10
        System.out.println(evaluateExpression("")); // 0
    }
}
