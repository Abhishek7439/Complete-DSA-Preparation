class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String str = Integer.toString(x);
        int len = str.length();
        for(int i=0 ; i<len/2; i++)
        {
           if( str.charAt(i) != str.charAt(len-1-i))
                 return false;
         }
           return true;


        // if(x<0)
        // return false;
        // int rev = 0;
        // int n = x;
        // while(n != 0 ){
        //     rev = rev * 10  + n % 10;
        //     n = n /10;

        // }
        // return (rev == x);
    }
    
}
    
