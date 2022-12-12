 public static void main(String args[]) {

        Scanner S = new Scanner(System.in);
        int T=S.nextInt();
        while(T-->0){
            int a=S.nextInt();
            int h=S.nextInt();
            for(int i=1;a>0 && h>0;i++){
                if(i%2==0)
                    h-=i;
                else
                    a-=i;
            }
            if(a>h)
                System.out.println("Aayush");
            else
                System.out.println("Harshit");
        }
            
        
    }
}
