public class Pattern
{
    public static void main(String []args)
    {
        int n,i,j,k,l,m,p,q,r,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n values");
        n=sc.nextInt();
        p=n;
        q=n;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            for(k=p*2;k<n*2-1;k++)
            {
                System.out.printl
                n(" ")
            }
            for(1=i;1!=0;1--)
            {
                if(1==n)
                {
                    continue;
                }
                System.out.println("*");

            }
            p--;
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            for(k=q*2-2;k>1;k--)
            {
                System.out.println(" ");
            }
            for(m=i;m!=0;m--)
            {
                if(m==n)
                {
                    continue;
                }
                System.out.println("*");
            }
            System.out.println();
            q--;
        }
    }
}
