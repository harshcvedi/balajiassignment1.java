    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
         int sn=sc.nextInt();
        int pow=0;
        int bin=0;
        while(sn>0){
            int rem=sn%10;
            bin+=rem*((int)Math.pow(sb, pow));
            pow++;
            sn=sn/10;
        }      
 int binnum=0;
 int pow1=0;
 while(bin>0){
    int rem1=bin%db;
    binnum+=rem1*(Math.pow(10, pow1));
    pow1++;
    bin=bin/db;

 }System.out.println(binnum);
   

}
}
