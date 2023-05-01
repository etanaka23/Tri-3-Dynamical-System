public class tourism
{
    private int visitorsNum;
    private int expectedVisitorNum;

    public tourism (int visitorsNum, int expectedVisitorNum)
    {
        visitorsNum = this.visitorsNum;
        expectedVisitorNum = this.expectedVisitorNum;
    }

    public void setVisitorsNum(int visitorsNum) {
        this.visitorsNum = visitorsNum;
    }

    public void setExpectedVisitorNum(int expectedVisitorNum) {
        this.expectedVisitorNum = expectedVisitorNum;
    }

    public int getVisitorsNum() {
        return visitorsNum;
    }

    public int getExpectedVisitorNum() {
        return expectedVisitorNum;
    }

    public String printTourism ()
    {
        String tourism = "Observed Visitors: " + Integer.toString(visitorsNum) + "." + "Expected Visitors: " + Integer.toString(expectedVisitorNum) + ".";
        return tourism;
    }
}
