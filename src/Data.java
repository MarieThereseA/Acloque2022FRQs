public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        for (int row = 0 ; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                int num = 10;
                while(num % 10 == 0 && num % 100 != 0){
                    num = (int)((Math.random() * MAX) + 1);
                }
                grid[row][col] = num;
            }
        }
    }

    public int countIncreasingCols() {
        int count = 0;
        boolean valid = true;
        if (grid.length != 1){
            for (int col = 0; col < grid[0].length; col++){
                int prevNum = grid[0][col];
                for (int row = 1; row < grid.length; row++){
                    if (grid[row][col] < prevNum){
                        valid = false;
                    }
                }
                if (valid){
                    count++;
                }else {
                    valid = true;
                }
            }
            return count;
        }else {
            return grid.length;
        }
    }
}
