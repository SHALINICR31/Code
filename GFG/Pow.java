class Solution {
    double power(double b, int e) {
        // code here
        if(e==0)
        {
            return 1;
        }
        return b* power(b,e-1);
    }
}
