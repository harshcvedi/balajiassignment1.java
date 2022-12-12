    public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=1;i<=N;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j+"       ");
         }for(int j=1;j<=(N+3)-2*i;j++){
            System.out.print("        ");
         }for(int j=i;j>=1;j--){
            if(j==N){
               j=N-1;
            }
            System.out.print(j+"       ");
         }System.out.println();
        }
      }
   }
