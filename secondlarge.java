import java.util.Arrays;
public class secondlarge {


    // according to the striver the brute force will be sorting an array by using ??merge,quick sort then apply a loop starting from the index n-2 and compare it with previous one to check, is it smaller then from present one or not, If the preceded element is smaller then the present element then just store that element in second large space and break the loop 
    public static int second2(int arr[]){
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i = arr.length-2; i>=0; i--   ){
            if(arr[i]<arr[arr.length-1]){
                max = arr[i];
                break;
            }
        }
        return max;

    }
 
    // better approch of striver is much same as i did,  with time complexity of O(2n)
//    public static int second3(int arr[]){
//     int max = Integer.MIN_VALUE;
//     for(int i =0; i<arr.length; i++ ){ (i think it is wrong )
//         max = Math.max(arr[i],max);

//     }
//     for(int i = 0; i<arr.length; i++){
//         if(arr[i]<max && arr[i]!= max){
//             max = arr[i];
//             max = Math.max(arr[i], max);
//         }
//     }
//     return max;
//    }
     

    // My approch 
    public static int second(int arr[]){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
          max = Math.max(max,arr[i]);
             

        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]!=max){
              max2 = Math.max(arr[i],max2);
            }
            

        }
        return max2;
    }
    // optimal solution by striver with the complexity of O(n)
    public static int second4(int arr[]){
        int large = arr[0];
        int secondlar = Integer.MIN_VALUE;
        for(int i =1; i<arr.length; i++){
            if(arr[i]>large){
                secondlar = large;
                large = arr[i];
            }
            else if(arr[i]>secondlar){
                secondlar = arr[i];
            }
        }
        if(secondlar == large){
            return -1;
        }
        return secondlar;
    }

    public static void main(String args[]){
        int arr[] = {5,5,5,5,5};
        int ll = second4(arr);
        System.out.println(ll);



    }
    
}
