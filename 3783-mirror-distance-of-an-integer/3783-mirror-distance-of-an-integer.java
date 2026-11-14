class Solution {
    public int mirrorDistance(int n) {
        int a = n;
        int rev = 0;
        while( n != 0 ){
            int num = n % 10;
            rev = rev * 10 + num;
            n = n/10;
        }

        int result = Math.abs(a - rev);
        return result;
    }
}