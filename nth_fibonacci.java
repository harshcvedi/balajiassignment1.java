public class Main {
    static int fibo(int N){
      int first = 0, second = 1, temp;
      if (N == 0)
      return first;
      if (N == 1)
      return second;
      for (int i = 2; i <= N; i++){
         temp = first + second;
         first = second;
         second = temp;
      }  
      return second;
   }
   public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      int N =sc.nextInt();
      
      System.out.println(fibo(N));
   }
}
        
