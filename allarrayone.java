public class allarrayone {
    public static int operation(int arr[]){
       int countone = 0; 
       int g = arr[0];
       for(int i = 1; i<arr.length; i++){
        g = gcd(g,arr[i]);
       }
       if(g!=1){
        return -1; // this cheacks the entire array by using gcd and gives the answer that will it be able to make the array with everyelements one or not 
// the complexity of this question is O(n^2)

       }

       int mi = Integer.MAX_VALUE;
       for(int i = 0; i<arr.length; i++){
       
        if(arr[i] == 1){
            countone++;
        }
       }
       if(countone > 0){
        return countone + arr.length-countone;
       }
       
        for(int i = 0; i<arr.length-1; i++){
            int gd  = arr[i];
            for(int j =i+1; j<arr.length; j++){
                gd = gcd(gd,arr[j]);
                if(gd == 1 ){
                    mi = Math.min(mi,(j-i) + (arr.length-1));
                    break;

                }
            }
       
       
       }
       return mi;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        int arr[] = {5,10,4,3};
       int a =  operation(arr);
       System.out.println(a);

    }
    
}
