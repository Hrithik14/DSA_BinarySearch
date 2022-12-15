public class SearchInSortedAndRotatedArray
{
    public static int binarySearch(int arr[], int s, int e, int key)
    {
        int start=s;
        int end=e;
        int mid=start+(end-start)/2;

        while(start<=end)
        {
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }mid=start+(end-start)/2;
        }return -1; 
    }
    
    public static int pivot(int arr[], int n)
    {
        int start=0;
        int end=n-1;
        int mid=start=(end-start)/2;

        while(start<end)
        {
            if(arr[mid]>=arr[0])
            {
                start=mid+1;
            }else
            {end=mid;
            }mid=start+(end-start)/2;
        }return start;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,6,5};
        int ans=pivot(arr, 5);
        int n=5;
        int k=6;
        int b= binarySearch(arr, ans, 4, k);
        int c= binarySearch(arr, 0, ans-1, k);
        if(k>=arr[ans] && k<=arr[n-1])
        {
             System.out.println(b);
        }else
        {
            
            System.out.println(c);
        }
    }

}