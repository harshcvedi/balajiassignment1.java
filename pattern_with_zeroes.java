    public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    for(int i=1;i<=N;i++){
      for(int j=i;j<=i;j++){
        System.out.print(j+"       ");
      }for(int j=3;j<=i;j++){
        System.out.print("0"+"       ");
      }
      if(i==1){
        System.out.print(" ");
      }else{
          for(int j=i;j<=i;j++){
        
          System.out.print(j+"       ");
          }
        }System.out.println();
    }

    }
}
