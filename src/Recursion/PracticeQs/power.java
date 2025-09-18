package Recursion.PracticeQs;

public class power {
    public static void main(String[] args) {
        System.out.println( pow(2,5));
    }
    static int pow(int a ,int b){
        if(b==1) return a;

        int ans =   pow(a,b/2);
        if(b%2==0){
            return ans * ans;
        }
        else{
            return ans * ans * a;
        }
    }
}
