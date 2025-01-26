public class NotFib {

    public long[] notFib(int n) {

        long[] sequence;
        if(n <= 2 ) {
            return sequence = new long[]{0, 1};
        }

        sequence = new long[n];
        long initial0, current;
        initial0 = 0;
        long initial1 = 1;

        for(int i = 0; i < sequence.length; i++){
            if(i == 0 || i == 1){
                sequence[i] = initial0;
                sequence[i+1] = initial1;
                i = 2;
            }
            current = 3*(sequence[i-1]) + 2*sequence[i-2];
            sequence[i] = current;
        }

        return sequence;
    }

}
