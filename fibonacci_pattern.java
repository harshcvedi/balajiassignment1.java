public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int x=0;
    int y=1;
    int z=0;
    for(int i=0;i<N;i++){
      for(int j=0;j<=i;j++){
        System.out.print(z+"    ");
        x=y;
        y=z;
        z=x+y;
      }System.out.println();
    }
  }
}
