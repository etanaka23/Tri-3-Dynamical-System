public class tourism
{
    private int visitorsNum;
    private int expectedVisitorNum;

    public tourism (int visitorsNum, int expectedVisitorNum)
    {
        visitorsNum = this.visitorsNum;
        expectedVisitorNum = this.expectedVisitorNum;
    }
     /**
    * sets the number of vistors
    * @param vistorsNum
    *
    */

    public void setVisitorsNum(int visitorsNum) {
        this.visitorsNum = visitorsNum;
    }
     /**
    * sets the number of expected visitors
    * @param expectedVisitorNum
    *
    */

    public void setExpectedVisitorNum(int expectedVisitorNum) {
        this.expectedVisitorNum = expectedVisitorNum;
    }
    /**
    *gets the number of visitors
    *@return 
    */
 

    public int getVisitorsNum() {
        return visitorsNum;
    }
    /**
    *gets the number of expected visitors
    *@return 
    */
  

    public int getExpectedVisitorNum() {
        return expectedVisitorNum;
    }
    /**
    *prints the data 
    *@return 
    */

    public String printTourism ()
    {
        String tourism = "Observed Visitors: " + Integer.toString(visitorsNum) + "." + "Expected Visitors: " + Integer.toString(expectedVisitorNum) + ".";
        return tourism;
    }
}
