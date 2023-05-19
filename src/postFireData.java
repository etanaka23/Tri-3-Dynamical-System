import java.util.ArrayList;

public class postFireData extends originalData
{
    private double postTotalAcres;
    private int postTreeNum;
    private int postRedKangarooNum;
    private int postDingoNum;
    private int postMoleNum;
    private int postMalaNum;
    private int postPythonNum;
    private double postWaterQuality;
    private int postPathwayNum;
    private int postFacilityNum;
    private int postEmployeeNum;
    private int postAnnualVisitorNum;
    private double postAnnualProfit;
    public postFireData(double postTotalAcres, int postTreeNum, int postRedKangarooNum, int postDingoNum, int postMoleNum, int postMalaNum,
                        int postPythonNum, double postWaterQuality, int postPathwayNum, int postFacilityNum, int postEmployeeNum,
                        int postAnnualVisitorNum, double postAnnualProfit)
    {
        this.postTotalAcres = postTotalAcres;
        this.postTreeNum = postTreeNum;
        this.postRedKangarooNum = postRedKangarooNum;
        this.postDingoNum = postDingoNum;
        this.postMoleNum = postMoleNum;
        this.postMalaNum = postMalaNum;
        this.postPythonNum = postPythonNum;
        this.postWaterQuality = postWaterQuality;
        this.postPathwayNum = postPathwayNum;
        this.postFacilityNum = postFacilityNum;
        this.postEmployeeNum = postEmployeeNum;
        this.postAnnualVisitorNum = postAnnualVisitorNum;
        this.postAnnualProfit = postAnnualProfit;
    }
    /**
    *
    * sets total acres
    *@param postTotalAcres
    *
    */
    public void setPostTotalAcres(double postTotalAcres) {
        this.postTotalAcres = postTotalAcres;
    }
     /**
    * sets the number of trees
    * @param postTreeNum
    *
    */

    public void setPostTreeNum(int postTreeNum) {
        this.postTreeNum = postTreeNum;
    }
     /**
    * sets the number of red kangaroos 
    * @param postRedKangarooNum
    *
    */

    public void setPostRedKangarooNum(int postRedKangarooNum) {
        this.postRedKangarooNum = postRedKangarooNum;
    }
     /**
    * sets the number of dingos
    * @param post DingoNum
    *
    */

    public void setPostDingoNum(int postDingoNum) {
        this.postDingoNum = postDingoNum;
    }
     /**
    * sets the number of moles
    * @param postMoleNum
    *
    */

    public void setPostMoleNum(int postMoleNum) {
        this.postMoleNum = postMoleNum;
    }
     /**
    * sets the number of Malas
    * @ param postMalaNum
    *
    */

    public void setPostMalaNum(int postMalaNum) {
        this.postMalaNum = postMalaNum;
    }
     /**
    * sets the number of Pythons
    * @param postPythonNum
    *
    */

    public void setPostPythonNum(int postPythonNum) {
        this.postPythonNum = postPythonNum;
    }
     /**
    * sets the number of pathways
    * @param postPathwayNum
    *
    */

    public void setPostPathwayNum(int postPathwayNum) {
        this.postPathwayNum = postPathwayNum;
    }
     /**
    * sets the water quality
    * @param postWaterQuality
    *
    */

    public void setPostWaterQuality(double postWaterQuality) {
        this.postWaterQuality = postWaterQuality;
    }
     /**
    *sets the number of employees
    * @param postEmployeeNum
    *
    */

    public void setPostEmployeeNum(int postEmployeeNum) {
        this.postEmployeeNum = postEmployeeNum;
    }
     /**
    * sets the number of facilities there are 
    * @param postFacilityNum
    *
    */

    public void setPostFacilityNum(int postFacilityNum) {
        this.postFacilityNum = postFacilityNum;
    }
     /**
    * sets the number of annual vistors
    * @param postAnnualVisitorNum
    *
    */

    public void setPostAnnualVisitorNum(int postAnnualVisitorNum) {
        this.postAnnualVisitorNum = postAnnualVisitorNum;
    }
     /**
    * set the annual profit 
    * @param postAnnualProfit
    *
    */

    public void setPostAnnualProfit(double postAnnualProfit) {
        this.postAnnualProfit = postAnnualProfit;
    }
     /**
    *
    * gets the water quality
    *@return
    */

    @Override
    public double getWaterQuality() {
        return super.getWaterQuality()/2;
    }
     /**
    *
    * gets the number of trees
    *@return
    */

    @Override
    public int getTreeNum() {
        return super.getTreeNum()/2;
    }
     /**
    *
    * gets the number of red kangaroos
    *@return
    */

    @Override
    public int getRedKangarooNum() {
        return super.getRedKangarooNum()/2;
    }
     /**
    *
    * gets the number of dingos
    *@return
    */

    @Override
    public int getDingoNum() {
        return super.getDingoNum()/2;
    }
     /**
    *
    * gets the number of moles
    *@return
    */

    @Override
    public int getMoleNum() {
        return super.getMoleNum()/2;
    }
     /**
    *
    * gets the number of mala
    *@return
    */

    @Override
    public int getMalaNum() {
        return super.getMalaNum()/2;
    }
     /**
    *
    * gets the number of pythons
    *@return
    */

    @Override
    public int getPythonNum() {
        return super.getPythonNum()/2;
    }
     /**
    *
    * gets the number of pathways
    *@return
    */

    @Override
    public int getPathwaysNum() {
        return super.getPathwaysNum()/2;
    }
     /**
    *
    * gets the number of facilities
    *@return
    */

    @Override
    public int getFacilitiesNum() {
        return super.getFacilitiesNum()/2;
    }
     /**
    *
    * gets the number of employees
    *@return
    */

    @Override
    public int getEmployeeNum() {
        return super.getEmployeeNum()/2;
    }
     /**
    *
    * gets the number of annual visitors
    *@return
    */

    @Override
    public int getAnnualVisitorNum() {
        return super.getAnnualVisitorNum()/2;
    }
     /**
    *
    * gets the annual profit
    *@return
    */

    @Override
    public double getAnnualProfitNum() {
        return super.getAnnualProfitNum()/2;
    }
     /**
    *
    * gets the total acres 
    *@return
    */

    @Override
    public double getTotalAcres() {
        return super.getTotalAcres()/2;
    }

    



}
