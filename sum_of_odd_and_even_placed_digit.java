    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        int sumofodd=0;
        int sumofeven=0;
         int temp=N;
        for(int i=1;temp!=0;i++,temp=temp/10){
            int rem=temp%10;
            
            if(i%2!=0){
                sumofodd=sumofodd+rem;
            }else{
                sumofeven=sumofeven+rem;
            }
            
        }
        System.out.println(sumofodd);
        
        System.out.println(sumofeven);
    }
}
