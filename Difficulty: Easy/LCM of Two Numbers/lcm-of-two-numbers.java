class Solution {
    public int lcm(int a, int b) {
        // code here
        int max = a>b ? a:b;
        int i = max;
        while(true)
        {
            if(i%a==0 && i%b==0)
                return i;
            
            i+=max;
        }
    }
}