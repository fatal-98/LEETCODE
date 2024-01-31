package LEETCODE;

class BS2 {
    public int[] searchRange(int[] nums, int target) {
    int first=findleft(nums,target);
    int last=findright(nums,target);
    return new int[]{first,last};
    }
    public int findleft(int []nums ,int target){
        int n =nums.length;
        int ind=-1;
        int low=0;
        int high =n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target){
                ind =mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ind;
    }
    public int findright(int []nums ,int target){
        int n =nums.length;
        int ind=-1;
        int low=0;
        int high =n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target){
                ind =mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ind;
    }
}
