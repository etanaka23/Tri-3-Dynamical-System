public class profit
{
    private int dayTicket;
    private int parkingPrice;
    private int annualTicket;

    public profit(int dayTicket, int parkingPrice, int annualTicket)
    {
        dayTicket = this.dayTicket;
        parkingPrice = this.parkingPrice;
        annualTicket = this.annualTicket;
    }
    /**
    * sets the price of a day ticket
    *@param dayTicket
    */

    public void setDayTicket(int dayTicket) {
        this.dayTicket = dayTicket;
    }
      /**
    * sets the price of the parking pass
    *@param parkingPrice
    */

    public void setParkingPrice(int parkingPrice) {
        this.parkingPrice = parkingPrice;
    }
      /**
    *sets the price of the annual ticket
    *@param annualTicket
    */

    public void setAnnualTicket(int annualTicket) {
        this.annualTicket = annualTicket;
    }
      /**
    *sets total profit, adding all of the compnents together
    *@param dayticket
    *@param parkingPrice
    *@param annualTicket
    */

    public void setProfit (int dayTicket, int parkingPrice, int annualTicket)
    {
        int profit = dayTicket + parkingPrice + annualTicket;
    }
      /**
    * gets the price of a day ticket
    *@return
    */

    public int getDayTicket() {
        return dayTicket;
    }
      /**
    *gets the price of the parking price
    *@return
    */

    public int getParkingPrice() {
        return parkingPrice;
    }
      /**
    *gets the price of the annual ticket
    *@return
    */

    public int getAnnualTicket() {
        return annualTicket;
    }
      /**
    *gets the total profit, adding all of the components
    *@return
    */

    public int getProfit ()
    {
        int profit = dayTicket + parkingPrice + annualTicket;
        return profit;
    }
}
