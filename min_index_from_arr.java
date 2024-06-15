public class min_index_from_arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,-4,5,6,7,8,9};

        int a=min(arr);
        System.out.println(a);
    }

    public static int min(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int ans=arr[0];
        for(int index=0;index<arr.length;index++){
           if(arr[index]<ans){
               ans=arr[index];


            }
        }
        return ans;
    }
}