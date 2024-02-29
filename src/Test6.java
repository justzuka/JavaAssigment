public class Test6 {

    public static boolean isValidSequence(int[] array, int[] sequence) {
        int i = 0;

        for (int j = 0; j < sequence.length; j++) {
            boolean found = false;
            while (i < array.length){
                if (array[i] == sequence[j]){
                    found = true;
                    break;
                }
                i += 1;
            }
            if (!found){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] array = new int[] {5,1,22,25,6,-1,8,10};
        int[] sequence = new int[] {1,6,-1,8,10};
        System.out.println(isValidSequence(array, sequence)); // true

        array = new int[] {5,1,22,25,6,-1,8,10};
        sequence = new int[] {1,6,22,8,10};
        System.out.println(isValidSequence(array, sequence)); // false
    }
}
