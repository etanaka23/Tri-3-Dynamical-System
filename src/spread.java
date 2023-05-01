import java.util.ArrayList;

public class spread extends originalData
{
    private ArrayList<Integer> neighborhoods;
    private ArrayList<Integer> gridSize;
    private double treeDensity;
    private double growProb;
    private double strikeProb;
    private ArrayList<Integer> firstLitPos;
    private int treesBurned;

    public spread (ArrayList<Integer> neighborhoods, ArrayList<Integer> gridSize, double treeDensity, double growProb, double strikeProb, ArrayList<Integer> firstLitPos, int treesBurned)
    {
        neighborhoods = this.neighborhoods;
        gridSize = this.gridSize;
        treeDensity = this.treeDensity;
        growProb = this.growProb;
        strikeProb = this.strikeProb;
        firstLitPos = this.firstLitPos;
        treesBurned = this.treesBurned;
    }


    public void setNeighborhoods (ArrayList<Integer> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    public void setGridSize(ArrayList<Integer> gridSize) {
        this.gridSize = gridSize;
    }

    public void setTreeDensity(double treeDensity) {
        this.treeDensity = treeDensity;
    }

    public void setGrowProb(double growProb) {
        this.growProb = growProb;
    }

    public void setStrikeProb(double strikeProb) {
        this.strikeProb = strikeProb;
    }

    public void setFirstLitPos(ArrayList<Integer> firstLitPos) {
        this.firstLitPos = firstLitPos;
    }

    public void setTreesBurned(int treesBurned) {
        this.treesBurned = treesBurned;
    }

    public ArrayList<Integer> getNeighborhoods() {
        return neighborhoods;
    }

    public ArrayList<Integer> getGridSize() {
        return gridSize;
    }

    public double getTreeDensity() {
        return treeDensity;
    }

    public double getGrowProb() {
        return growProb;
    }

    public double getStrikeProb() {
        return strikeProb;
    }

    public ArrayList<Integer> getFirstLitPos() {
        return firstLitPos;
    }

    public int getTreesBurned() {
        return treesBurned;
    }

    public ArrayList<Integer> initialGrid (ArrayList<Integer> girdSize, double treeDensity)
    {
        return initialGrid(getGridSize(), getTreeDensity());
    }

    public ArrayList<Integer> simulateSpread (ArrayList<Integer> firstLitPos, ArrayList<Integer> neighborhoods, double growProb, double strikeProb)
    {
        return simulateSpread(getFirstLitPos(), getNeighborhoods(), getGrowProb(), getStrikeProb());
    }

    public String printSpread ()
    {
        String print = "Neighborhoods: " + getNeighborhoods() + "."
                + "Grid Size: " + getGridSize() + "."
                + "Tree Density: " + getTreeDensity() + "."
                + "Grow Probability: " + getGrowProb() + "."
                + "Strike Probability: " + getStrikeProb() + "."
                + "First Lit Pos: " + getFirstLitPos() + "."
                + "Number of Trees Burned: " + getTreesBurned() + "."
                + "Initial Grid: " + initialGrid(getGridSize(), getTreeDensity()) + "."
                + "Similation of the Spread: " + simulateSpread(getFirstLitPos(), getNeighborhoods(), getGrowProb(), getStrikeProb());

        return print;
    }
}
