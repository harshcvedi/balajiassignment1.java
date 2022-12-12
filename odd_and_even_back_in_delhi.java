    public static void main(String args[]) {
           Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int []a=new int[N];
	        int i=0;
	        while(i<N)
	        {
	        	a[i]=sc.nextInt();
	        	i++;
	        }
	        i=0;
	        while(i<N)
	        {
	        	boolean b=checkCar(a[i]);
	        	if(b==true)
	        		System.out.println("Yes");
	        	else
	        		System.out.println("No");
	        	i++;
	        }
	    }
	    	public static boolean checkCar(int num)
		{
			int s=0,r;
			int evensum=0,oddsum=0;
			
			while(num!=0)
			{
				r=num%10;
				if((r&1)!=0)
				{
					oddsum=oddsum+r;
				}else
				{
					evensum=evensum+r;
				}
				num=num/10;
			}
			if(oddsum%3==0||evensum%4==0)
			{
				return true;
			}
			else
			{
				return false;
			}
    }
}
