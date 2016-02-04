package behavioral.mediator.DerekB;

/**
 * I can play with multi threading with this code sample
 */
public class TestStockMediator {

    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        GormanSlacks broker = new GormanSlacks(nyse);

        JTPoorman broker2 = new JTPoorman(nyse);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker.buyOffer("NRG", 10);

        nyse.getstockOfferings();

    }

}