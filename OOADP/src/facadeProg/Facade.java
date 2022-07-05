package facadeProg;
import java.util.*;

public class Facade {
    /**
     * @param boolean 
     * @param float
     */
    ItemsPurchased i;
    ProcessSales s;
    Facade(boolean b, float f) {
        // TODO implement here
        i = new ItemsPurchased();
        s = new ProcessSales(b, i.getNumItemTypes(), f);
    }

    /**
     * @return
     */
    public void displayItemsPurchased() {
        // TODO implement here
        i.getItemPurchased();
    }

    /**
     * @return
     */
    public void calculateAmountToPay() {
        // TODO implement here
        s.processSale();
    }

}