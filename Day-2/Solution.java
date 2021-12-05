public class Solution{
    public static long sumCubes(long n)
    {
        long sum=0;
        //put your code here :D
        for(long i=1;i<=n;i++)
        {
            sum+=i*i*i;

        }
        System.out.println("sum" + sum);
        return sum;

    }
}