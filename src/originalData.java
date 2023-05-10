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
    public void setTreeNum (int treeNum){
        treeNum = 500000;
    }
    public void setRedKangarooNum (int redKangarooNum){
        redKangarooNum =2500 ;
    }
    public void setDingoNum (int dingoNum){
        dingoNum = 500;
    }
    public void setMoleNum (int moleNum){
        moleNum= 1000;
    }
    public void setMalaNum (int malaNum){
        malaNum= 1500;
    }
    public void setPythonNum (int pythonNum){
        pythonNum= 100;
    }
    public void setWaterQuality (double waterQuality){
       waterQuality = 7.4;
       // this is the pH 
   }
    public void setPathwaysNum (int pathwayNum){
       pathwayNum = 100;
       // this is the miles of pathways 
   }
    public void setFacilitiesNum (int facilitiesNum){
       facilitiesNum = 10;
       //number of buildings in the park 
   }
    public void setEmployeeNum (int employeeNum) {
       employeeNum = 750;
       
   }
    public void setAnnualVisitorsNum (int annualVisitorsNum){
       annualVisitorsNum = 250000;
   }
    public void setAnnualProfitNum (double annaulProfitNum){
       annaulProfitNum = 320000000;
   }

    public int getTreeNum(int treeNum){
        return treeNum;
    }
    public int getRedKangarooNum(int redKangarooNum) {
        return redKangarooNum;
    }
    public int getDingoNum (int dingoNum){
        return dingoNum;
    }
    public int getMoleNum (int moleNum){
        return moleNum;
    }
    public int getMalaNum (int malaNum){
        return malaNum;
    }
    public int getPythonNum (int pythonNum){
        return pythonNum;
    }
    public double getWaterQuality (double waterQuality){
       return waterQuality;
   }
    public int getPathwaysNum (int pathwayNum){
       return pathwayNum;
   }
    public int getFacilitiesNum (int facilitiesNum){
       return facilitiesNum;
   }
    public int getEmployeeNum (int employeeNum){
       return employeeNum;
   } 
    public int getAnnualVisitorsNum (int annualVisitorsNum){
       return annualVisitorsNum;
   }
    public double getAnnualProfitNum (double annualProfitNum){
       return annualProfitNum;
    }
    public void printWildlife (int treeNum, int redKangarooNum, int dingoNum, int moleNum, int malaNum, int pythonNum){
        System.out.print(" Pre- fire data: Wilflife \n Number of Trees: " + treeNum + "\n Number of Red Kangaroos: " + redKangarooNum +  " \n Number of Dingos: " + dingoNum + " \n Number of Moles: " + moleNum + "  \n Number of Mala: " + malaNum +  " \n Number of Pythons: " + pythonNum);
    }
}
