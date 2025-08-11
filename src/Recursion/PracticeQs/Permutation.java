package Recursion.PracticeQs;

public class Permutation {
    static int count =0;
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
    }
    public static int permutation(String p,String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return count++;
        }

        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String s = p.substring(0,i);
            String f =p.substring(i,p.length());
            permutation(s+ch+f,up.substring(1));



        }
        return count;
    }
}
