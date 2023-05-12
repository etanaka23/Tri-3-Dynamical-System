public class Main
{
    public static void main(String[] args)
    {
        Spread park = new Spread();
        System.out.println("Initial grid: ");
        park.displayGrid();
        park.setStrike(5, 5);
        
        for(int i=0; i<20; i++){
            System.out.println("\nround "+(i+1)+": ");
            park.spreadFire();
            System.out.println("number of burnt trees: "+park.getCount());
        }
    }
}
