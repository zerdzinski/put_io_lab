package put.io.testing.audiobooks;

public class AudiobookPriceCalculator {
    public double calculate(Customer customer, Audiobook audiobook) {
        if (customer.isSubscriber())
            return 0.0;

        if (customer.getLoyaltyLevel() == Customer.LoyaltyLevel.SILVER)
            return 0.9 * audiobook.getStartingPrice();
        if (customer.getLoyaltyLevel() == Customer.LoyaltyLevel.GOLD)
            return 0.8 * audiobook.getStartingPrice();

        return audiobook.getStartingPrice();
    }
}

//5.1: whitebox
//5.2: 4 ścieżki