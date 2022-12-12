public static void prime(int N){
      if(N==1){
        System.out.println("Not Prime");
      }
      if(N==2){
        System.out.println("Prime");
      }
      for(int i=2;i<N;i++){
        if( N%i==0){
          System.out.println("Not Prime");
          break;
        }else{
          System.out.println("Prime");
          break;
        }
      }
  }
  

  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    prime(N);
  }
}
