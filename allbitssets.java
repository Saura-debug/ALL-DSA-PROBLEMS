public class allbitssets {
    // if you ever add 1 to all setbits then it will always give the answer in the power of 2
    // if  n & n+1 gives the 0 then  n will always set bits
    // SC = O(1)
    // this question i solved by taking the help of the 
    private static int set(int a){
        int result = a;
        while(!setbit(result)){
            result++;
        }
        return result;
    
    }
    private static boolean setbit(int result){
        if((result & result+1)==0){
            return true;
        }
        return false;
    }

    // second approche is related to the first one where we know that, if we add  1 to the allsetbits then we will get the answer in power of 2,here we will just have the less TC 
    // it has time complexity log(n)
    private static int setbit2(int n){
        int result = 1;
        while(result<n){
            result = 2*result+1;
        }
       return  result; 
    }
    // third and last approoch is also related to first with TC O(1) and SC O(1)
    private static int setbit3(int n){
        int bits = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        System.out.println(bits);
        return (1<<bits) -1;
    }
    

    public static void main(String args[]){
       System.out.print(setbit3(5));
       //Integer.SIZE → total bits in an int (always 32)
       //Integer.numberOfLeadingZeros(n) → counts zeros before the first 1 bit
       //int bits = Integer.toBinaryString(n).length(); we can also use this by changing in the string
        // int n = 5;
        // int bits = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        // System.out.println(bits);

    }
    
}
