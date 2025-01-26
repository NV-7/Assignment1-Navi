/**
 * Navi Bountho
 * The class CommonSubSequence contains a method called commonSubSequence
 * which takes two strings and returns the length of their longest subsequence.
 * The idea behind this was to create an array that stores an integer that represents the
 * length of the highest subsequence found at the index.
 *
 * When this array is initialized, the length of it will be based on one of the String inputs.
 * In this case it text2.
 * The idea is to use the array to store the largest length found in the index that matches the
 * string in text2.
 *  For example: Using inputs "Almanancs" and "Albatross". Using Albatross to make the array gives me this:
 *
 *  [ 1, 2, 0,  3,  0,  0,  0, 4, 4 ] Array created after the method ends
 *  [ A, l, b,  a,  t,  r,  o, s, s ]
 * The 1 in the first index represents a substring created using the string “A”
 * from the first char in “Almanacs" and finding the substring from “Albatross”
 * This would have a length of 1.
 *
 * The 3 in the third index represents a subsequence created using the string “Alma”
 * from the first 4 chars in “Almanacs” and finding the common
 * substring from “Albatross”.
 * This substring has a length of 3.
 *
 * Every 0 in the array represents the index in “Albatross” whereas it doesn’t have
 * the same value in “Almanacs”.
 * So the 0 in index 2 means that the char ‘b’ does not exist in “Almanacs”.
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
