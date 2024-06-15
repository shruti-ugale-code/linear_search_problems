public class linear_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=4;
        int ans=linerrsearch(arr,key);
        System.out.println(ans);
    }

    public static int linerrsearch(int arr[],int key){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==key){
                return index;
            }
        }
        return -1;
    }
}
