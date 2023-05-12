public class originalData
{
   private double totalAcres = 512.0;
   private int treeNum = 500000;
   private int redKangarooNum = 2500;
   private int dingoNum = 500;
   private int moleNum = 1000;
   private int malaNum = 1500;
   private int pythonNum = 100;
   private double waterQuality = 7.4;
   private int pathwayNum = 100;
   private int facilityNum = 10;
   private int employeeNum = 750;
   private int annualVisitorNum = 250000;
   private double annualProfit = 320000000;

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
    public void setTreeNum (int tree){
        treeNum = tree;
    }
    public void setRedKangarooNum (int redKangaroo){
        redKangarooNum = redKangaroo;
    }
    public void setDingoNum (int dingo){
        dingoNum = dingo;
    }
    public void setMoleNum (int mole){
        moleNum = mole;
    }
    public void setMalaNum (int mala){
        malaNum = mala;
    }
    public void setPythonNum (int python){
        pythonNum = python;
    }
    public void setWaterQuality (double waterQ){
       waterQuality = waterQ;
       // this is the pH 
   }
    public void setPathwayNum (int pathway){
       pathwayNum = pathway;
       // this is the miles of pathways 
   }
    public void setFacilityNum (int facility){
       facilityNum = facility;
       //number of buildings in the park 
   }
    public void setEmployeeNum (int employee) {
       employeeNum = employee;
       
   }
    public void setAnnualVisitorNum (int annualVisitor){
       annualVisitorNum = annualVisitor;
   }
    public void setAnnualProfitNum (double annualProfit){
       annaulProfitNum = annualProfit;
   }

    public int getTreeNum(){
        return treeNum;
    }
    public int getRedKangarooNum() {
        return redKangarooNum;
    }
    public int getDingoNum (){
        return dingoNum;
    }
    public int getMoleNum (){
        return moleNum;
    }
    public int getMalaNum (){
        return malaNum;
    }
    public int getPythonNum (){
        return pythonNum;
    }
    public double getWaterQuality (){
       return waterQuality;
   }
    public int getPathwaysNum (){
       return pathwayNum;
   }
    public int getFacilitiesNum (){
       return facilityNum;
   }
    public int getEmployeeNum (){
       return employeeNum;
   } 
    public int getAnnualVisitorNum (){
       return annualVisitorNum;
   }
    public double getAnnualProfitNum (){
       return annualProfitNum;
    }
    public String  printWildlife (){
        return "Pre- fire data: Wilflife \nNumber of Trees: " + treeNum + "\nNumber of Red Kangaroos: " + redKangarooNum +  " \nNumber of Dingos: " + dingoNum + " \nNumber of Moles: " + moleNum + "  \nNumber of Mala: " + malaNum +  " \nNumber of Pythons: " + pythonNum;
    }
}
