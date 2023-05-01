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

    public void setDayTicket(int dayTicket) {
        this.dayTicket = dayTicket;
    }

    public void setParkingPrice(int parkingPrice) {
        this.parkingPrice = parkingPrice;
    }

    public void setAnnualTicket(int annualTicket) {
        this.annualTicket = annualTicket;
    }

    public void setProfit (int dayTicket, int parkingPrice, int annualTicket)
    {
        int profit = dayTicket + parkingPrice + annualTicket;
    }

    public int getDayTicket() {
        return dayTicket;
    }

    public int getParkingPrice() {
        return parkingPrice;
    }

    public int getAnnualTicket() {
        return annualTicket;
    }

    public int getProfit ()
    {
        int profit = dayTicket + parkingPrice + annualTicket;
        return profit;
    }
}
