class Solution {
    public int maxArea(int[] height) {
        
        int l=0;
        int r =  height.length-1;
        int MaxArea = 0;

        while(l<r){
            int width = r-l;
            int Height = Math.min(height[l],height[r]);
            MaxArea = Math.max(MaxArea,(width*Height));

            if(height[l]> height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return MaxArea;
    }
}
