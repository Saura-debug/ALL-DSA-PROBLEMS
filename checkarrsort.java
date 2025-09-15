public class checkarrsort{
    // this solution  is much not accurate as i thought
     public static boolean check(int arr[]){
        int a = 0;
        for(int i =1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                a++;
            }

        }
        if(a>1){
            return false;

        }
        return true;

    }
    // solution learned by gemini and striver  always remember the codition (i+1)%arr.length to check the rotation
    public static boolean checkto(int arr[]){
        int x =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                x++;

            }
        }
        if(x>1){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {3,4,5,1,2,4};
       boolean n = checkto(arr);
       System.out.println(n);

    }
}