import java.util.*;
class LC3134 {
    public static int cntLen(int [] nums){
        int n=nums.length;
        int cnt=0;
        for(int i=n;i>=1;i++){
            cnt+=i;
        }
        return cnt;
    }
    public static int medianOfUniquenessArray(int[] nums) {
        int n1=cntLen(nums);
        int n=nums.length;
        int []arr=new int[n1];
        int k=0;
        for(int i=0;i<n;i++){
            Set<Integer> st=new HashSet<Integer>();
            for(int j=i;j<n;j++){
                st.add(nums[j]);
            }
            int n2=st.size();
            arr[k]= n2;
            k++;
        }
        Arrays.sort(arr);
        int midIndex= (n1/2)-1;
        int median = arr[midIndex];
        return median;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int median= medianOfUniquenessArray(nums);
        System.out.println(median);
    }
}