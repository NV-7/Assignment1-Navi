/**
 * Navi bountho
 */
public class Main {

    public static void main(String[] args) {

        String test1 = "AGGTAB";
        String test2 = "GXTXAYB";

        String text1 = "abc";
        String text2 = "abc";

        String text3 = "almanacs";
        String text4 = "albatross";

        String text5 = "gears of war";
        String text6 = "History of warriors";

      //   System.out.println("\n" + commonSubsequence(test1,test2));
        // double[] seq = notFib(1000);

         int[] case1 = {3,2,2,3};
         int val = 3;
         RemoveElement remove = new RemoveElement();
         remove.removeElement(case1,val);


    }

    public static int commonSubsequence(String text1, String text2) {

        int[] array = new int[text2.length()];
        System.out.println(array.length);
        int length = 0;
        for (int i = 0; i < text1.length(); i++) {
            int clength = 0;
            for (int x : array) {
                System.out.print(x);
            }
            System.out.print("\n");
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

        return array[array.length - 1];
    }

    public static double[] notFib(int n) {

        double[] sequence = new double[n];
        int m = 0;
         double initial0, initial1, current;
        initial0 = 0;
        initial1 = 1;
        m = 0;
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

