public class CreditCard {
    private String customerName, bankName, accountId;
    private int lim;
    protected double bal;

    public CreditCard(String customer, String bank, String Id, int limit, double balance) {
        customerName = customer;
        bankName = bank;
        accountId = Id;
        lim = limit;
        bal = balance;
    }
    public CreditCard(String customer, String bank, String Id, int limit) {
        this(customer, bank, Id, limit, 0);
    }
    public String getCustomerName() {return customerName;}
    public String getBankName() {return bankName;}
    public String getAccountId() {return accountId;}
    public int getLim() {return lim;}
    public double getBal() {return bal;}
    public boolean charge(double credit) {
        if ((credit + bal) > lim) {
            return false;
        } else {
            bal += credit;
            return true;
        }
    }
    public void makePayment(double bill) {
        bal -= bill;
    }
    public static void printSummary(CreditCard card) {
        System.out.println("Customer Name: " + card.customerName);
        System.out.println("Bank: " + card.bankName);
        System.out.println("ID: " + card.accountId);
        System.out.println("Balance: " + card.bal);
        System.out.println("Limit: " + card.lim);
    }
}