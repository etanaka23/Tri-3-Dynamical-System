import java.awt.*;

public class originalData extends Canvas
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
   /**
   * sets the number of trees
   *@param tree
   */
    public void setTreeNum (int tree){
        treeNum = tree;
    }
   /**
   *sets the number of red kangaroos
   * @param redKangaroo
   */
    public void setRedKangarooNum (int redKangaroo){
        redKangarooNum = redKangaroo;
    }
   /**
   *sets the number of dingos
   *@param dingo
   */
    public void setDingoNum (int dingo){
        dingoNum = dingo;
    }
   /**
   *sets the number of moles
   *@param mole
   */
    public void setMoleNum (int mole){
        moleNum = mole;
    }
   /**
   *sets the number of mala
   *@param mala
   */
    public void setMalaNum (int mala){
        malaNum = mala;
    }
   /**
   *sets the number of python
   *@param python
   */
    public void setPythonNum (int python){
        pythonNum = python;
    }
   /**
   *sets the water quality
   *@param waterQ
   */
    public void setWaterQuality (double waterQ){
       waterQuality = waterQ;
       // this is the pH 
   }
   /**
   *sets the number of pathways
   *@param pathway
   */
    public void setPathwayNum (int pathway){
       pathwayNum = pathway;
       // this is the miles of pathways 
   }
   /**
   *sets the number of facilities
   *@param facility
   */
    public void setFacilityNum (int facility){
       facilityNum = facility;
       //number of buildings in the park 
   }
   /**
   *sets the number of employees
   *@param employye
   */
    public void setEmployeeNum (int employee) {
       employeeNum = employee;
       
   }
   /**
   *sets the number of annual visitors
   * @param annualVisitor
   */
    public void setAnnualVisitorNum (int annualVisitor){
       annualVisitorNum = annualVisitor;
   }
   /**
   *sets the annual profit
   * @param annualProfit
   */
    public void setAnnualProfitNum (double annualProfit){
       annaulProfitNum = annualProfit;
   }
   /**
   *gets the number of trees
   *@return
   */

    public int getTreeNum(){
        return treeNum;
    }
   /**
   *gets the number of red kangaroos
   *@return
   */
    public int getRedKangarooNum() {
        return redKangarooNum;
    }
   /**
   *gets the number of dingos
   *@return
   */
    public int getDingoNum (){
        return dingoNum;
    }
   /**
   *gets the number of moles
   *@return
   */
    public int getMoleNum (){
        return moleNum;
    }
   /**
   *gets the number of mala
   *@return
   */
    public int getMalaNum (){
        return malaNum;
    }
   /**
   *gets the number of pythons
   *@return
   */
    public int getPythonNum (){
        return pythonNum;
    }
   /**
   * gets the water quality
   *@return
   */
    public double getWaterQuality (){
       return waterQuality;
   }
   /**
   *gets the number of pathways
   *@return
   */
    public int getPathwaysNum (){
       return pathwayNum;
   }
   /**
   *gets the number of facilities
   *@return
   */
    public int getFacilitiesNum (){
       return facilityNum;
   }
   /**
   *gets the number of employees
   *@return
   */
    public int getEmployeeNum (){
       return employeeNum;
   } 
   /**
   *gets the number of annual visitors
   *@return
   */
    public int getAnnualVisitorNum (){
       return annualVisitorNum;
   }
   /**
   *gets the annual profit
   *@return
   */
    public double getAnnualProfitNum (){
       return annualProfitNum;
    }
   /**
   *
   *@return
   */
    public String  printWildlife (){
        return "Pre- fire data: Wilflife \nNumber of Trees: " + treeNum + "\nNumber of Red Kangaroos: " + redKangarooNum +  " \nNumber of Dingos: " + dingoNum + " \nNumber of Moles: " + moleNum + "  \nNumber of Mala: " + malaNum +  " \nNumber of Pythons: " + pythonNum;
    }
}
