import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Spread park = new Spread();
        System.out.println("Initial grid: ");
        park.displayGrid();
        //park.setStrike(10, 10);

        for(int i=0; i<50; i++){
            System.out.println("\nround "+(i+1)+": ");
            park.strike();
            park.spreadFire();
            System.out.println("number of burnt trees: "+park.getBurntNum());
            JFrame f = new JFrame();
            f.add(park);
            f.setSize(400,400);
            f.setVisible(true);
            Thread.sleep(500);
        }
    }
}
