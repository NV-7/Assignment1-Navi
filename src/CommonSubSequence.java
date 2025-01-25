/**
 * Navi Bountho
 *
 * My
 *
 */
public class CommonSubSequence {


    public int commonSubSeq(String text1, String text2) {
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
        return array[array.length-1];
    }
}
