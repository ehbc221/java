public class Permutation {

    static int first = 0;

    // compute and display all permutations of an array of characters
    public static void permute (char [] inArray, int size) {
        permute(inArray, size, 0);
    }

    // permutation based on a position
    public static void permute (char [] inArray, int size, int first) {
        if ((size-first) <= 1) {
            for(int i = 0; i < size; i++) {
                System.out.print(inArray[i] + " ");
            }
            System.out.println();
        }
        else {
            for(int i = 0; i < size-first; i++) {
                char temp = inArray[first];
                for(int j = first; j < size-1; j ++) {
                    inArray[j] = inArray[j + 1];
                }
                inArray[size-1] = temp;
                permute(inArray, size, first+1);
            }
        }
    }

    public static void main(String[] args) {
        char [] inarray = {'S', 'A', 'T'};
        System.out.println("All permutations for an array of char: ");
        permute(inarray, inarray.length);
    }

}
