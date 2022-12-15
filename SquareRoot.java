public class SquareRoot {
    public static int squareRoot(int n)
    {
        int start=0;
        int end=n;
        int mid=start+(end-start)/2;
        int ans=-1;

        while(start<=end)
        {
            int square=mid*mid;
            if(square==n)
            {
                return mid;
            }else if(square<n)
            {
                ans=mid;
                start=mid+1;
            }else
            {
                end=mid-1;
            }mid=start+(end-start/2);
        }
        return ans;
    }

    static double precise(int n, int precise, double square)
    {
        double factor=1;
        double ans=square;
        for(int i=0; i<precise; i++)
        {
            factor=factor/10;
           for(double j=ans; j*j<n; j=j+factor)
            {
                ans=j;
            }
        }return ans;
    }
    public static void main(String[] args)
    {
        int n=38;
        double square= squareRoot(n);
        System.out.println("The square is: "+precise(n, 3, square));
    } 
}
