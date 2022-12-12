public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int rev=0;
        while(N>0){
            int ld=N%10;
            rev=(rev*10)+ld;
            N=N/10;
        }System.out.println(rev);

    }
}
