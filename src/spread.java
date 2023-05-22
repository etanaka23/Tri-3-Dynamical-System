import java.awt.*;

public class spread extends originalData{
    private int side = (int)Math.sqrt(super.getTotalArea());
    private String[][] grid = new String[side][side];
    private double treeDensity = 0.5;
    private double growProb = 0.2;
    private double strikeProb = 0.2;
    private static int burntNum = 0;

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

    public void setTreeDensity(double density){ treeDensity = density; }

    public void setGrowProb(double grow){ growProb = grow; }

    public void setStrikeProb(double strike){ strikeProb = strike; }

    public double getTreeDensity(){ return treeDensity; }

    public double getGrowProb(){ return growProb; }

    public double getStrikeProb(){ return strikeProb; }

    public String[][] getGrid(){ return grid; }

    public void displayGrid(){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

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


    public void setStrike(int x, int y){
        grid[x][y] = "F";
        System.out.println("\nafter strike: ");
        displayGrid();
    }

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

    public int getBurntNum(){
        return burntNum;
    }


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

