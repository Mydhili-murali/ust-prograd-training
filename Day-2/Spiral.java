import java.math.BigInteger;
class Spiral
{
    public static BigInteger sum(BigInteger size)
    {
        // ODD : ((N * N) / 2) + N
        // EVEN: ((N * N) / 2) + N - 1
        // Total grid size
        BigInteger rslt = size.multiply(size);
        // Divide by 2
        rslt = rslt.divide(BigInteger.TWO);
        // Add the original size
        rslt = rslt.add(size);
        // Add 1 if even
        if(rslt.mod(BigInteger.TWO) == BigInteger.ZERO)
            rslt = rslt.subtract(BigInteger.ONE);
        return rslt;
    }
}