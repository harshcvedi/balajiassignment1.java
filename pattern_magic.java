    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    for(int i=1;i<=9;i++){
        System.out.print("*");
    }System.out.println();

    for(int i=1;i<N;i++){
        for(int j=1;j<=N-i;j++){
            System.out.print("*");
        }for(int j=1;j<=2*i-1;j++){
            System.out.print(" ");
        }for(int j=1;j<=N-i;j++){
            System.out.print("*");
        }System.out.println();
    }

    for(int i=N-2;i>=1;i--){
        for(int j=1;j<=N-i;j++){
            System.out.print("*");
        }for(int j=1;j<=2*i-1;j++){
            System.out.print(" ");
        }for(int j=1;j<=N-i;j++){
            System.out.print("*");
        }System.out.println();
    }

    for(int i=1;i<=9;i++){
        System.out.print("*");
    }System.out.println();

    }
}