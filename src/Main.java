/**
 * Navi
 */
public class Main {

    public static void main(String[] args) {

        CommonSubSequence commonSubSequence = new CommonSubSequence();
        NotFib notFib = new NotFib();
        RemoveElement removeElement = new RemoveElement();
        WhereInSequence whereInSequence = new WhereInSequence();

        String text1 = "AGGTAB";
        String text2 = "GXTXAYB";

        String text3 = "abc";
        String text4 = "abc";

        String text5 = "almanacs";
        String text6 = "albatross";

        String text7 = "gears of war";
        String text8 = "History of warriors";

        System.out.println("Length of largest common sub sequence of " + text1 + " and " + text2 + " is " + commonSubSequence.commonSubSeq(text1, text2));
        System.out.println("Length of largest common sub sequence of " + text3 + " and " + text4 + " is " + commonSubSequence.commonSubSeq(text3, text4));
        System.out.println("Length of largest common sub sequence of " + text5 + " and " + text6 + " is " + commonSubSequence.commonSubSeq(text5, text6));
        System.out.println("Length of largest common sub sequence of " + text7+ " and " + text8 + " is " + commonSubSequence.commonSubSeq(text7, text8));

        System.out.println();

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

       System.out.println("Seqeunce of not fib up to " + num1);
       for(long x : notFib.notFib(num1)){
           System.out.print(x + " ,");
       }
        System.out.println();
        System.out.println("Seqeunce of not fib up to " + num2);
        for(long x : notFib.notFib(num2)){
            System.out.print(x + " ,");
        }
        System.out.println();
        System.out.println("Seqeunce of not fib up to " + num3);
        for(long x : notFib.notFib(num3)){
            System.out.print(x + " ,");
        }

        System.out.println("\n");

        int target1 = 8;
        int target2 = 139;

        System.out.println("Where the number " + target1 + " is in the sequence " + whereInSequence.whereInSeq(target1));
        System.out.println("Where the number " + target2 + " is in the sequence " + whereInSequence.whereInSeq(target2));

        int[] array1 = {3, 2, 2, 3};
        int[] array2 = {0,1,2,2,3,0,4,2};
        int val1 = 3;
        int val2 = 2;
System.out.println();


        System.out.println("Number of elements that are not " + val1+ " in the array " + removeElement.removeElement(array1, val1));

        System.out.println("Number of elements that are not " + val2+ " in the array " + removeElement.removeElement(array2, val1));



    }

    public static int commonSubsequence(String text1, String text2) {

        int[] array = new int[text2.length()];
        System.out.println(array.length);
        int length = 0;
        int total = 0;
        for (int i = 0; i < text1.length(); i++) {
            int clength = 0;
            for (int j = 0; j < array.length; j++) {
                if (clength < array[j]) {
                    clength = array[j];
                } else if (text1.charAt(i) == text2.charAt(j)) {
                    length = clength + 1;
                    array[j] = length;
                }
            }

        }
        for (int x : array) {
            System.out.print(x);
        }

        return total;
    }

    public static double[] notFib(int n) {


        double[] sequence;
        if(n <1) {
            sequence = new double[]{0, 1};
            return sequence;
        }

        sequence = new double[n];

         double initial0, initial1, current;
        initial0 = 0;
        initial1 = 1;
        current = 0;

        for(int i = 0; i < sequence.length; i++){

            if(i == 0 || i == 1){
                sequence[i] = initial0;
                sequence[i+1] = initial1;
                i = 2;
            }
            current = 3*(sequence[i-1]) + 2*sequence[i-2];
            sequence[i] = current;
        }
        for(double x:sequence){
            System.out.print(x + ", ");
        }

        return sequence;
    }

    public static int whereInSeq(long n){
        int input = (int)n;
       double[] notFib = notFib(input);

       for(int i = 0; i < notFib.length-1; i++){
           if(notFib[i] == n){
               return i + 1;
           } else if (notFib[i] > n) {
               return i;
           }
       }

        return 0;
    }
}

