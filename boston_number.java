public static void isbostonnumber(int N){
        int i=2;
        int temp=N;
        int psum=0;
        while(i<=temp){
          while(temp%i==0){
              psum=psum+sumofdigit(i);
              temp=temp/i;
          }
          i++;
        }
        int sum=sumofdigit(N);
        if(psum==sum){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
    public static int sumofdigit(int N){
        int sum=0;
        while(N>0){
            int ld=N%10;
            sum+=ld;
            N=N/10;

        }return sum;

    }

public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
  int N =sc.nextInt();
  isbostonnumber(N);

    
 
}
}
