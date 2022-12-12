    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int lcm=0;
        lcm = (N1 > N2) ? N1 : N2;

    // Always true
    while(true) {
      if( lcm % N1 == 0 && lcm % N2 == 0 ) {
        System.out.println(lcm);
        break;
      }
      ++lcm;
    }
  }
}
