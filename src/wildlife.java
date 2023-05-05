public class wildlife
{
    private int treeNum;
    private int redKangarooNum;
    private int dingoNum;
    private int moleNum;
    private int malaNum;
    private int pythonNum;

    public static void wildlife(int treeNum, int kangarooNum, int dingoNum, int moleNum, int malaNum, int pythonNum){ }
    public static void setTreeNum (int treeNum){
        treeNum = 500000;
    }
    public static void setRedKangarooNum (int redKangarooNum){
        redKangarooNum =2500 ;
    }
    public static void setDingoNum (int dingoNum){
        dingoNum = 500;
    }
    public static void setMoleNum (int moleNum){
        moleNum= 1000;
    }
    public static void setMalaNum (int malaNum){
        malaNum= 1500;
    }
    public static void setPythonNum (int pythonNum){
        pythonNum= 100;
    }
    public static int getTreeNum(int treeNum){
        return treeNum;
    }
    public static int getRedKangarooNum(int redKangarooNum) {
        return redKangarooNum;
    }
    public static int getDingoNum (int dingoNum){
        return dingoNum;
    }
    public static int getMoleNum (int moleNum){
        return moleNum;
    }
    public static int getMalaNum (int malaNum){
        return malaNum;
    }
    public static int getPythonNum (int pythonNum){
        return pythonNum;
    }
    public static void printWildlife (int treeNum, int redKangarooNum, int dingoNum, int moleNum, int malaNum, int pythonNum){
        System.out.print(" Pre- fire data: Wilflife \n Number of Trees: " + treeNum + "\n Number of Red Kangaroos: " + redKangarooNum +  " \n Number of Dingos: " + dingoNum + " \n Number of Moles: " + moleNum + "  \n Number of Mala: " + malaNum +  " \n Number of Pythons: " + pythonNum ;
    }
}
