    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if (Character.isLowerCase(a)){
                System.out.println("lowercase");
        }else if(Character.isUpperCase(a)){
                System.out.println("UPPERCASE");
        }else{
            System.out.println("Invalid");
        }

    }
}
