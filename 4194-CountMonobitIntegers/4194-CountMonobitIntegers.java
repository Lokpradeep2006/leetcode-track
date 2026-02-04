// Last updated: 2/5/2026, 1:06:10 AM
class Solution {
    public int countMonobit(int n) {
         int count = 0;
        for(int i = 0; i<=n;i++){
            if(isMonobit(i)){
                count++;
            }
        }
        return count;
    }


private boolean isMonobit(int x){
    if(x==0)return true;
    int bit = x&1;
    while(x>0){
        if((x&1)!=bit){
            return false;
        }
        x >>=1;
    }
    return true;
    }
}