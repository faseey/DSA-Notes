package SlidingWindow.LongestRepeatingCharReplacement;

class Solution {
    public static int brutecharacterReplacement(String s, int k) {
        int maxlength =0;


        for(int i=0;i<s.length();i++){
            int[] arr = new int[26];
            int frequency =0;
            int maxfrequency =0;

            for(int j=i;j<s.length();j++){
                arr[s.charAt(j) -'A']++;
                frequency = arr[s.charAt(j) -'A'];
                maxfrequency = Math.max(maxfrequency,frequency);
                int l = j-i+1;
                if(l -  maxfrequency <= k){
                    maxlength =  Math.max(maxlength,l);

                }
                else{
                    break;
                }




            }}
        return maxlength;

    }
    public static int bettercharacterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l=0;
        int r=0;
        int freq=0;
        int maxfreq=0;
        int maxlen =0;

        while(r<s.length()){
            arr[s.charAt(r)- 'A']++;
            freq = arr[s.charAt(r) - 'A'];
            maxfreq = Math.max(maxfreq,freq);
            int length = r-l+1;




            while(length - maxfreq > k){
                arr[s.charAt(l) - 'A']--;
                maxfreq= 0;
                for(int i =0;i<26;i++){
                    maxfreq = Math.max(maxfreq,arr[i]);
                }
                l++;
                length = r-l+1;
            }
            maxlen = Math.max(maxlen,length);




            r++;
        }
        return maxlen;

    }
    public static int optimalcharacterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l=0;
        int r=0;
        int freq=0;
        int maxfreq=0;
        int maxlen =0;

        while(r<s.length()){
            arr[s.charAt(r)- 'A']++;
            freq = arr[s.charAt(r) - 'A'];
            maxfreq = Math.max(maxfreq,freq);
            int length = r-l+1;




            if(length - maxfreq > k){
                arr[s.charAt(l) - 'A']--;
                l++;
                length = r-l+1;
            }
            maxlen = Math.max(maxlen,length);
            r++;
        }
        return maxlen;

    }

    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(brutecharacterReplacement(s,1));
        System.out.println(optimalcharacterReplacement(s,1));
        System.out.println(bettercharacterReplacement(s,1));

    }
}