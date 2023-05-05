public class originalData
{
   private double totalAcres;
   private int treeNum;
   private int redKangarooNum;
   private int dingoNum;
   private int moleNum;
   private int malaNum;
   private int pythonNum;
   private double waterQuality;
   private int pathwayNum;
   private int facilityNum;
   private int employeeNum;
   private int annualVisitorNum;
   private double annualProfit;

   public originalData(double totalAcres, int treeNum, int redKangarooNum, int dingoNum, int moleNum, int malaNum, int pythonNum, double waterQuality, int pathwayNum, int facilityNum, int employeeNum, int annualVisitorNum, double annualProfit){
       this.totalAcres = totalAcres;
       this.treeNum = treeNum;
       this.redKangarooNum = redKangarooNum;
       this.dingoNum = dingoNum;
       this.moleNum = moleNum;
       this.malaNum = malaNum;
       this.pythonNum = pythonNum;
       this.waterQuality = waterQuality;
       this.pathwayNum = pathwayNum;
       this.facilityNum = facilityNum;
       this.employeeNum = employeeNum;
       this.annualVisitorNum = annualVisitorNum;
       this.annualProfit = annualProfit;
   }
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
    public static void setWaterQuality (double waterQuality){
       
   }
    public static void setPathwaysNum (int pathwayNum){
       
   }
    public static void setFacilitiesNum (int facilitiesNum){
       
   }
    public static void setEmployeeNum (int employeeNum) {
       
   }
    public static void setAnnualVisitorsNum (int annaulVisitorsNum){
       
   }
    public static void setAnnualProfitNum (double annaulProfitNUm){
       
   }
    public static void setOriginalData () {
       
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
    public static int getWaterQuality (){
   }
    public static int getPathwaysNum (){
   }
    public static int getFacilitiesNum (){
   }
    public static int getEmployeeNum (){
   } 
    public static int getAnnualVisitorsNum (){
   }
    public static int getAnnualProfitNum (){
   }
    public static String getOriginalData (){
   } 

    public static void printWildlife (int treeNum, int redKangarooNum, int dingoNum, int moleNum, int malaNum, int pythonNum){
        System.out.print(" Pre- fire data: Wilflife \n Number of Trees: " + treeNum + "\n Number of Red Kangaroos: " + redKangarooNum +  " \n Number of Dingos: " + dingoNum + " \n Number of Moles: " + moleNum + "  \n Number of Mala: " + malaNum +  " \n Number of Pythons: " + pythonNum ;
    }
}
