import java.util.ArrayList;
import java.util.HashMap;
public class mejorityelement {
    public static void majorty(int arr[]){
        ArrayList<Integer> wow = new ArrayList<>();
        // this solution consist TC of O(n^2) SC O(n)
        //  here we get a learning that the size of the arraylist will be n/3 which means the arraylist will only store atmost n/3 elements
        int n = arr.length;
        int stop = n/3;
        for(int i =0; i<n; i++){
            int sum = 1;
            for(int j = i+1; j<n; j++){
                
                if(arr[i] == arr[j]){
                    sum++;

                }

            }
            if(sum>stop && !(wow.contains(arr[i]))){
                wow.add(arr[i]);
            }
        }
        System.out.print(wow);
    }
    public static void majorty1(int arr[]){
        // here we have used the tradeoff con dition in which we have increased the SC and Decreased the TC from O(n^2) to O(n)
     // this question also can be done in only one iteration by checking the codition is key.value>n/3,if it is then then it will just add that element in the arraylist
        HashMap<Integer,Integer> wow = new HashMap<>();
        ArrayList<Integer> got = new ArrayList<>();
        int stop = arr.length/3;
        for(int i =0; i<arr.length; i++){
           wow.put(arr[i],wow.getOrDefault(arr[i],0 )+1);
        }
        for(int a :wow.keySet()){
            if(wow.get(a)>stop){
                got.add(a);

            }

        }
        System.out.print(got);
    }
    public static void main(String args[]){
        int arr[] = {3,5,6,3,3,3,5};
        majorty1(arr);


    }
    
}
