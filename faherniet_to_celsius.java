public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int minf=s.nextInt();
        int maxf=s.nextInt();
        int step=s.nextInt();
        int  C;
        for(int i=minf;i<=maxf;i=i+step)
        {
             C = (5*(i - 32))/9;
             System.out.println(i+" "+C);
        }
    }
}
