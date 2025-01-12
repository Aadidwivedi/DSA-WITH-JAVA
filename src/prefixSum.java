public class prefixSum {
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
    public static void kadanes(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<numbers.length;i++){
            currsum += numbers[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum= Math.max(currsum,maxsum);
        }
        System.out.println("our max sum = "+maxsum);
    }
}
