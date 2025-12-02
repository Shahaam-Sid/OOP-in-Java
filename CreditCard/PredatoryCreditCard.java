public class PredatoryCreditCard extends CreditCard {
    private double apr;

    public PredatoryCreditCard(String customer, String bank, String Id, int limit, double balance, double rate) {
        super(customer, bank, Id, limit, balance);
        apr = rate;
    }

    public void processMonth() {
        if (bal > 0) {
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);
            bal *= monthlyFactor;
        }
    }
    @Override
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if (!isSuccess) {bal += 5;}
        return isSuccess;
    }
}
