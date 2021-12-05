public class DRoot {
    public static int digital_root(int n) {

        int rem=0,sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(sum>=10)
        {
            return digital_root(sum);
        }
        return sum;
    }

}