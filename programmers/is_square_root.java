class Solution {
    public long solution(long n) {
        long sq = (long) Math.sqrt(n);
        long po = (long) Math.pow(sq, 2);
        return (long) (po==n?Math.pow(sq+1, 2):-1);
    }
}
