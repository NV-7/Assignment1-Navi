/**
 * By Navi Bountho
 * This class contains the method whereInSeq
 *  Takes an integer as a target and returns the position where that target is in the
 *  not Fib sequence.
 */
public class WhereInSequence {

    public NotFib notFibSeq = new NotFib();

    public int whereInSeq(int n){
        long[] notFib = notFibSeq.notFib(n);

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
