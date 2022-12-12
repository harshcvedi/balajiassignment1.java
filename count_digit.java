  public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int digit=sc.nextInt();
        int c1=0;
        String temp = Integer.toString(N);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        for(int i=0;i<numbers.length;i++){
            if(digit==numbers[i]){
                c1++;
            }
        }System.out.println(c1);

    }
}
