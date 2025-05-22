public class findingfood {
     public static int find(String[] Menu, String Key) {
        for(int i =0; i < Menu.length; i++ ) {
            if(Menu[i] == Key) {
                return i;
                
            }
        }
        return-1;

    }

    public static void main(String args[]) {
        String Menu[] = {"samosa","idli","chola samosa","pateez","chai","Veg biryani","Paneer dosa" };
        String Key = "dosa";
        int index = find(Menu,Key);
        if(index == -1){
            System.out.print("Not Found");
        }
        else {
            System.out.print("index is " + index);
        }
        
            
        }

    }
    

