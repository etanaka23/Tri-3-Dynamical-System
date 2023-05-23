import java.awt.*;

public class spread extends originalData{
    private int side = (int)Math.sqrt(super.getTotalArea());
    private String[][] grid = new String[side][side];
    private double treeDensity = 0.5;
    private double growProb = 0.2;
    private double strikeProb = 0.2;
    private static int burntNum = 0;

    /**
     * This is the constructor that constructs the grid of the forest based on the tree density
     */
    public spread(){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int num = (int)(Math.random()*10)+1;
                if(num>treeDensity*10){
                    grid[i][j] = "_";
                }
                else{
                    grid[i][j] = "T";
                }
            }
        }
    }

    /**
     * The setTreeDensity method sets the density of the trees
     * @param density
     */
    public void setTreeDensity(double density){ treeDensity = density; }

    /**
     * The setGrowProb method sets the growing probability of the trees on empty grids
     * @param grow
     */
    public void setGrowProb(double grow){ growProb = grow; }

    /**
     * The setStrikeProb method sets the striking probability of forest fires
     * @param strike
     */
    public void setStrikeProb(double strike){ strikeProb = strike; }

    /**
     * The getTreeDensity method returns the density of the trees
     * @return tree density
     */
    public double getTreeDensity(){ return treeDensity; }

    /**
     * The getGrowProb method returns the growing probability of the trees on empty grids
     * @return growing probability
     */
    public double getGrowProb(){ return growProb; }

    /**
     * The getStrikeProb method returns the striking probability of forest fires
     * @return the striking probability of forest fires
     */
    public double getStrikeProb(){ return strikeProb; }

    /**
     * The getGrid method returns the grid of the forest
     * @return the grid of the forest
     */
    public String[][] getGrid(){
        return grid;
    }

    /**
     * The displayGrid method prints out the grid of the forest
     */
    public void displayGrid(){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * The strike method sets a forest fire randomly on the grid with a set striking probability each turn
     */
    public void strike(){
        int num = (int)(Math.random()*10)+1;
        if(num<=strikeProb*10){
            int x = (int)(Math.random()*grid.length);
            int y = (int)(Math.random()*grid[0].length);
            grid[x][y] = "F";
            System.out.println("\nSet position "+x+", "+y+" on fire: ");
            displayGrid();
        }
    }

    /**
     * The strike method sets a forest fire at a spot in the grid
     * @param x the x-coordinate of the position of forest fire
     * @param y the y-coordinate of the position of forest fire
     */
    public void setStrike(int x, int y){
        grid[x][y] = "F";
        System.out.println("\nafter strike: ");
        displayGrid();
    }

    /**
     * The spreadFire method simulates the spread of the fire for each turn
     */
    public void spreadFire(){

        String[][] after = new String[grid.length][grid[0].length];

        for(int j=0; j<grid[0].length; j++){
            if(grid[0][j].equals("F")){
                after[0][j] = "_";
                burntNum++;
                if(j==0){
                    if(grid[0][j+1].equals("T")){
                        after[0][j+1] = "F";
                    }
                    if(grid[1][j].equals("T")){
                        after[1][j] = "F";
                    }
                } else if(j==grid[0].length-1){
                    if(grid[0][j-1].equals("T")){
                        after[0][j-1] = "F";
                    }
                    if(grid[1][j].equals("T")){
                        after[1][j] = "F";
                    }
                } else{
                    if(grid[0][j-1].equals("T")){
                        after[0][j-1] = "F";
                    }
                    if(grid[0][j+1].equals("T")){
                        after[0][j+1] = "F";
                    }
                    if(grid[1][j].equals("T")){
                        after[1][j] = "F";
                    }
                }
            }
        }

        for(int i=1; i<grid.length-1; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j].equals("F")) {
                    after[i][j] = "_";
                    burntNum++;
                    if(j==0){
                        if(grid[i][j+1].equals("T")){
                            after[i][j+1] = "F";
                        }
                        if(grid[i-1][j].equals("T")){
                            after[i-1][j] = "F";
                        }
                        if(grid[i+1][j].equals("T")){
                            after[i+1][j] = "F";
                        }
                    } else if(j==grid[0].length-1){
                        if(grid[i][j-1].equals("T")){
                            after[i][j-1] = "F";
                        }
                        if(grid[i-1][j].equals("T")){
                            after[i-1][j] = "F";
                        }
                        if(grid[i+1][j].equals("T")){
                            after[i+1][j] = "F";
                        }
                    } else{
                        if(grid[i][j-1].equals("T")){
                            after[i][j-1] = "F";
                        }
                        if(grid[i][j+1].equals("T")){
                            after[i][j+1] = "F";
                        }
                        if(grid[i-1][j].equals("T")){
                            after[i-1][j] = "F";
                        }
                        if(grid[i+1][j].equals("T")){
                            after[i+1][j] = "F";
                        }
                    }
                }
            }
        }

        int x = grid[0].length-1;
        for(int j=0; j<grid[0].length; j++){
            if(grid[x][j].equals("F")){
                after[x][j] = "_";
                burntNum++;
                if(j==0){
                    if(grid[x][j+1].equals("T")){
                        after[x][j+1] = "F";
                    }
                    if(grid[x-1][j].equals("T")){
                        after[x-1][j] = "F";
                    }
                } else if(j==grid[0].length-1){
                    if(grid[x][j-1].equals("T")){
                        after[x][j-1] = "F";
                    }
                    if(grid[x-1][j].equals("T")){
                        after[x-1][j] = "F";
                    }
                } else{
                    if(grid[x][j-1].equals("T")){
                        after[x][j-1] = "F";
                    }
                    if(grid[x][j+1].equals("T")){
                        after[x][j+1] = "F";
                    }
                    if(grid[x-1][j].equals("T")){
                        after[x-1][j] = "F";
                    }
                }
            }
        }

        for(int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if(after[i][j]==null){
                    after[i][j]=grid[i][j];
                }
            }
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j].equals("_")){
                    int num = (int)(Math.random()*10)+1;
                    if(num<=growProb*10){
                        after[i][j] = "T";
                    }
                }
            }
        }
        grid = after;
        System.out.println();
        displayGrid();
    }

    /**
     * The getBurntNum method returns the number of burned trees in total
     * @return the number of burned trees
     */
    public int getBurntNum(){
        return burntNum;
    }

    /**
     * The paint method graphs the grid with empty, fire or tree
     * @param g   the specified Graphics context
     */
    public void paint(Graphics g){
        g.drawRect(50, 50, side*10,side*10);
        int x = 10;
        int y = 10;
        for(int i=0; i<side; i++){
            g.drawLine(50, x+50, side*10+50, x+50);
            x+=10;
        }
        for(int i=0; i<side; i++){
            g.drawLine(y+50, 50, y+50, side*10+50);
            y+=10;
        }

        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[i][j].equals("T")){
                    g.setColor(Color.GREEN);
                    g.fillRect(50+i*10, 50+j*10, 10, 10);
                }
                else if(grid[i][j].equals("F")){
                    g.setColor(Color.red);
                    g.fillRect(50+i*10, 50+j*10, 10, 10);
                }
            }
        }
    }
}

