/**
 * Navi Bountho
 *
 *
 *
 */
public class CommonSubSequence {

public int[] array;

    public int commonSubSeq(String text1, String text2) {
         array = new int[text2.length()];
        System.out.println(array.length);
        int length = 0;
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
        return length;
    }

}
