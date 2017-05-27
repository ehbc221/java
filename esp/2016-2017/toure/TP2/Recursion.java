class Recursion {

    // return the factorial of num
    public static int factorial (int num) {
        return (num <= 1) ? 1 : factorial(num - 1);
    }

    // return the average of size numbers in inArray
    public static double average (double [] inArray, int size) {
        double nombre = inArray[0];
        if (size == 0)
            return nombre;
        else
            return inArray[inArray.length - size] / inArray.length + average(inArray, size - 1);
    }

    // return largest int in inArray
    public static double findlargest (double [] inArray, int size) {
        
    }

    // searches for index of val in inArray between low and high
    public static int binarysearch (double [] inArray, double val, int low, int high) {
    }

    // compute and display all permutations of an array of characters
    public static void permute (char [] inArray, int size) {
    }

    public static void main(String[] args) {
        // double fact = 6.0;
        System.out.println("Factorial (6) is : " + factorial(6));
        double [] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        char [] inarray = {'S', 'A', 'T'};
        System.out.println("Average of number is : " + average(array, array.length));
        System.out.println("Largest of numbers is : " + findlargest(array, array.length));
        System.out.println("Binary Search of the index of yhe give ");
        System.out.println("");
        permute(inarray, inarray.length);
    }

}