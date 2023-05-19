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

    public void setPostTotalAcres(double postTotalAcres) {
        this.postTotalAcres = postTotalAcres;
    }

    public void setPostTreeNum(int postTreeNum) {
        this.postTreeNum = postTreeNum;
    }

    public void setPostRedKangarooNum(int postRedKangarooNum) {
        this.postRedKangarooNum = postRedKangarooNum;
    }

    public void setPostDingoNum(int postDingoNum) {
        this.postDingoNum = postDingoNum;
    }

    public void setPostMoleNum(int postMoleNum) {
        this.postMoleNum = postMoleNum;
    }

    public void setPostMalaNum(int postMalaNum) {
        this.postMalaNum = postMalaNum;
    }

    public void setPostPythonNum(int postPythonNum) {
        this.postPythonNum = postPythonNum;
    }

    public void setPostPathwayNum(int postPathwayNum) {
        this.postPathwayNum = postPathwayNum;
    }

    public void setPostWaterQuality(double postWaterQuality) {
        this.postWaterQuality = postWaterQuality;
    }

    public void setPostEmployeeNum(int postEmployeeNum) {
        this.postEmployeeNum = postEmployeeNum;
    }

    public void setPostFacilityNum(int postFacilityNum) {
        this.postFacilityNum = postFacilityNum;
    }

    public void setPostAnnualVisitorNum(int postAnnualVisitorNum) {
        this.postAnnualVisitorNum = postAnnualVisitorNum;
    }

    public void setPostAnnualProfit(double postAnnualProfit) {
        this.postAnnualProfit = postAnnualProfit;
    }

    @Override
    public double getWaterQuality() {
        return super.getWaterQuality()/2;
    }

    @Override
    public int getTreeNum() {
        return super.getTreeNum()/2;
    }

    @Override
    public int getRedKangarooNum() {
        return super.getRedKangarooNum()/2;
    }

    @Override
    public int getDingoNum() {
        return super.getDingoNum()/2;
    }

    @Override
    public int getMoleNum() {
        return super.getMoleNum()/2;
    }

    @Override
    public int getMalaNum() {
        return super.getMalaNum()/2;
    }

    @Override
    public int getPythonNum() {
        return super.getPythonNum()/2;
    }

    @Override
    public int getPathwaysNum() {
        return super.getPathwaysNum()/2;
    }

    @Override
    public int getFacilitiesNum() {
        return super.getFacilitiesNum()/2;
    }

    @Override
    public int getEmployeeNum() {
        return super.getEmployeeNum()/2;
    }

    @Override
    public int getAnnualVisitorNum() {
        return super.getAnnualVisitorNum()/2;
    }

    @Override
    public double getAnnualProfitNum() {
        return super.getAnnualProfitNum()/2;
    }

    @Override
    public double getTotalAcres() {
        return super.getTotalAcres()/2;
    }

    



}
