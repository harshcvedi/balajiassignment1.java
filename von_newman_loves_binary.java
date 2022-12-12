    public static void main(String args[]) {
         Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        
        for(int i=0;i<N;i++){
         int x=sc.nextInt();
        
         int pow=0;
         int bin=0;
       
         while(x>0){
          int rem=x%10;
          bin+=rem*Math.pow(2, pow);
          pow++;
          x=x/10;
          
        }
        System.out.println(bin);

        }

     
        
     
      
      }
    }
