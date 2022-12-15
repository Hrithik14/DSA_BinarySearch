public class PivotElement {
    public static int pivotElement(int arr[], int n)
    {
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;

        while(start<end)
        {
            if(arr[mid]>=arr[0])
            {
                start=mid+1;
            }else
            {
                end=mid;
            }mid=start+(end-start)/2;
        }return start;
    }
    public static void main(String[] args)
    {
        int arr[]={3,2,7,3,1};
        int ans=pivotElement(arr, 5);
        System.out.println("The Pivot element is at index:"+ans);
    }

}

