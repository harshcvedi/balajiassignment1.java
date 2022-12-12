    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
      int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    double r1,r2;
    double d= b*b -4*a*c;
    //real and distinct root
    if(d>0){
      r1=(-b + Math.sqrt(d)) / (2*a);
      r2=(-b - Math.sqrt(d)) / (2*a);
      System.out.println("Real and Distinct");
          if(r1>r2){
            System.out.print((int)r2+" ");
          }System.out.println((int)r1);
    }else if(d==0){
        r1=r2=-b  /(2*a);
        System.out.println("Real and Equal");
        System.out.print((int)r1+" ");
        System.out.print((int)r2);

    }else{
      System.out.println("Imaginary");
    }
}
}

    
