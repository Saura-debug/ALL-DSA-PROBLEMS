import java.util.HashMap;

public class single {
    // it is the better approch with TC O(3N) and SC O(N) , it is totally dependent on an array of length
    public static int sin(int arr[]){
        int maxel = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            maxel = Math.max(arr[i], maxel);
        }
        int arr2[] = new int[maxel+1];
        for(int i =0; i<arr.length; i++){
            int temp = arr[i];
            arr2[temp]++;
                }
                for( int i =0; i<arr2.length; i++){
                    if(arr2[i] == 1){
                        return i;
                    }

                }
                return -1;

    }
    //  this solution will conclude  all the HashMaps for large inputs. u can use both order map an underorder , the diffrence will be there  only for the number
    
    public static int sin3(int arr[]){
        HashMap<Integer,Integer> freak = new HashMap<>();
        for( int el : arr ){
            freak.put(el,freak.getOrDefault(el, 0)+1);
        }
        // we use get to retrieve the value in hashmap
        for(int el : freak.keySet()){
            if(freak.get(el) == 1){
                return el;
            }
        }
        return -1;
    }
    // it is the optimal solution for that question with TC O(n) and SC 0(1)
  public static int sin4(int arr[]){
    int xor = 0;
    for(int i=0; i<arr.length; i++){
        xor = xor^arr[i];
    }
    return xor; 

  }



    public static void main(String args[]){
        int arr[] = {2,4,2,4,9,0,0,1,1};
        int ans = sin4(arr);
        System.out.println(ans);



    }
    
}
