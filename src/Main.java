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
        System.out.println("Length of largest common sub sequence of " + text7 + " and " + text8 + " is " + commonSubSequence.commonSubSeq(text7, text8));

        System.out.println();

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.println("Seqeunce of not fib up to " + num1);
        for (long x : notFib.notFib(num1)) {
            System.out.print(x + " ,");
        }
        System.out.println();
        System.out.println("Seqeunce of not fib up to " + num2);
        for (long x : notFib.notFib(num2)) {
            System.out.print(x + " ,");
        }
        System.out.println();
        System.out.println("Seqeunce of not fib up to " + num3);
        for (long x : notFib.notFib(num3)) {
            System.out.print(x + " ,");
        }

        System.out.println("\n");

        int target1 = 8;
        int target2 = 139;

        System.out.println("Where the number " + target1 + " is in the sequence " + whereInSequence.whereInSeq(target1));
        System.out.println("Where the number " + target2 + " is in the sequence " + whereInSequence.whereInSeq(target2));

        int[] array1 = {3, 2, 2, 3};
        int[] array2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val1 = 3;
        int val2 = 2;

        System.out.println();
        System.out.println("Number of elements that are not " + val1 + " in the array " + removeElement.removeElement(array1, val1));

        System.out.println("Number of elements that are not " + val2 + " in the array " + removeElement.removeElement(array2, val1));
    }

}