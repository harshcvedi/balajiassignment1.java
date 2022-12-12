    public static void main(String args[]) {
         Scanner sc =new Scanner(System.in);
  int N =sc.nextInt();
  for(int i=1;i<=(N/2)+1;i++){

    for(int j=1;j<=(N+1)-2*i;j++){
      System.out.print("  ");
    }for(int j=i;j>=1;j--){
      System.out.print(j+" ");
    }for(int j=3;j<=2*i-1;j++){
      System.out.print("  ");
    }for(int j=1;j<=i;j++){
      if(i==1){
        System.out.print("  ");
      }else{
      System.out.print(j+" ");
    }
  }System.out.println();
  }

  for(int i=(N/2);i>=1;i--){

    for(int j=1;j<=(N+1)-2*i;j++){
      System.out.print("  ");
    }for(int j=i;j>=1;j--){
      System.out.print(j+" ");
    }for(int j=3;j<=2*i-1;j++){
      System.out.print("  ");
    }for(int j=1;j<=i;j++){
      if(i==1){
        System.out.print("  ");
      }else{
      System.out.print(j+" ");
    }
  }System.out.println();
  }
    }
}
