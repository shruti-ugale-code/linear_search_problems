public class linear_search_in_range {
    public static void main(String[] args) {
        int arr[]={12,3,4,5,6,7};
        int target=8;
        int ans= lrinRange(arr,target,1,4);
        System.out.println(ans);


    }
    public static int lrinRange(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;

        }
        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        System.out.println("target does not exist in arr");
        return -1;




    }
}
