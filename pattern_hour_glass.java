public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

        
		int N=sc.nextInt();
		int r=1;
		int s=2*N+1;
		int sapce=0;
		int count=N;
		while(r<=2*N+1)
		{
		    int i=1;
		    while(i<=sapce)
		    {
		        System.out.print("  ");
		        i++;
		    }
		    
		    int j=1;
		    int num=count;
		    int num2=0;
		    while(j<=s)
		    {
		        
		        if(num>=1){
		            System.out.print(num+" ");
		            num--;}
		            
		        else{
		            System.out.print(num2+" ");
		            num2++;}
		        j++;
		    }
		    
		    int k=1;
		    while(k<=sapce)
		    {
		        System.out.print("  ");
		        k++;
		    }
		   //mirroring kiye hai yaha.
 		   if(r<=(2*N/2))
		   {
 		     s-=2;
 		     sapce+=1;
 		     count--;
 		   }
 		   
 		   else
 		   {
 		       s+=2;
 		       sapce-=1;
 		       count++;
 		   }
 		   System.out.println();
 		   r++;
		}
    }
}
