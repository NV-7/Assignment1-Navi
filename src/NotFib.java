public class NotFib {
    public double[] notFib(int n) {

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

    public int whereInSeq(long n){
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
