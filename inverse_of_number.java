 public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int inverted=0;
        int pow=1;
        while(N!=0){
            int ld=N%10;
            int id=pow;
            int ip=ld;
            inverted=inverted+id*(int)Math.pow(10,ip-1);
            N=N/10;
            pow++;
            
        }
        System.out.println(inverted);
        
    }
}
