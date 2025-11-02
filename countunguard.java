public class countunguard {
    public static int ll(int m , int n , int guards[][], int walls[][]){
        int grid[][] = new int[m][n];
        boolean seen[][] = new boolean[m][n];
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};

        for(int g[]:guards){
            grid[g[0]][g[1]] = 1;

        }
        for(int w[]:walls){
            grid[w[0]][w[1]] = 2;
        }
        for(int g[]:guards){
            for(int d[]:dir){
                int r = g[0]+d[0], c = g[1]+d[1];
                while(r>=0 && r<m && c>=0 && c<n && grid[r][c]==0){
                    seen[r][c] = true;
                    r+=d[0];
                    c+=d[1];

                }
            }

        }
        int count = 0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j] == 0 && !(seen[i][j])){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String args[]){
        int guards[][] = {{0,0},{1,1},{2,3}};
        int walls[][] = {{0,1},{2,2},{1,4}};
        int m = 4;
        int n = 6; 
        int ans = ll(m, n, guards, walls);
        System.out.print(ans);


    }
    
}
