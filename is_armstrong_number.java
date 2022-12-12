public class Main {
    static boolean isArmstrong(int N)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=N;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = N;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(N==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt(); 
        System.out.println(isArmstrong(N));
       
       


    }
}
