public class FirstAndLastOccurenceOfElement {
    public static int firstOccurence(int arr[], int size, int key)
    {
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        int ans=-1;

        while(start<=end)
        {
            if(arr[mid]==key)
            {
                ans=mid;
                end=mid-1;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }mid=start+(end-start)/2;
        }return ans;
    }

    public static int lastOccurence(int arr[], int size, int key)
    {
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        int ans=-1;

        while(start<=end)
        {
            if(arr[mid]==key)
            {
                ans=mid;
                start=mid+1;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }mid=start+(end-start)/2;
        }return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={1,4,4,4,5};
        int firstOccurence=firstOccurence(arr, 5, 4);
        int lastOccurence=lastOccurence(arr, 5, 4);
        System.out.println("First occurence of given element is: "+firstOccurence);
        System.out.println("Last occurence of given element is: "+lastOccurence);
    }
}
