public class Mintimetomakecolorrope {
      public static int minCost(String colors, int[] neededTime) {
     int totaltime = 0; 
     int i = 0; 
     while(i<colors.length()-1){
        if(i<colors.length()-1 && colors.charAt(i) == colors.charAt(i+1)){
            int maxtime = neededTime[i];
            int currentsum = neededTime[i];
            while (i<colors.length()-1 && colors.charAt(i) == colors.charAt(i+1)){
                maxtime = Math.max(maxtime,neededTime[i+1]);
                currentsum+=neededTime[i+1];
                i++;
                
            }
            totaltime += currentsum-maxtime;
        }
        else{
            i++;
        }
     }
     return totaltime;
        
    }
    public static int minCost2(String colors,int[] neededTime){
        int prev = 0;
        int timetaken = 0;
        
        for(int i =0; i<colors.length()-1; i++){
            if( i >0 && colors.charAt(i)!=colors.charAt(i-1)){
                prev = 0;

            }
            int curr = neededTime[i];
            if(colors.charAt(i) == colors.charAt(i+1)){
                timetaken += Math.min(prev,curr);
                prev = Math.max(prev,curr);
            }
        }
        return timetaken;
    }
    public static void main(String args[]){
        String colors = "aaabbcacc";
        int neededTime[] = {5,6,7,2,3,4,1,8,9};
        int ans = minCost2(colors,neededTime);
        System.out.print(ans);

    }
    
}
