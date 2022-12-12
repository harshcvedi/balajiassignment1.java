    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int pow3=0;
        int dec=0;
        while(N>0){
            int rem3=N%10;
            dec+=rem3*(Math.pow(2, pow3));
            pow3++;
            N=N/10;
        }System.out.println(dec);

    }
}
