public class RainwaterArr {
    public static void main(String[] args) {
        int[] height = {4, 2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
    public static int trappedrainwater(int height[]){
        int n= height.length;
        //calculate left max boundary - Array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        // calculate right max boundary -Array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        //loop
        for(int i=0; i<n;i++){
          int waterLevel = Math.min(leftmax[i],rightmax[i]);
          trappedwater += waterLevel - height[i];
        }
        return trappedwater;

        //waterLevel = min(leftmax bound, rightmax bound)
        // traped water = water level - height[i]



    }
}
