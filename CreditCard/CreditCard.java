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
    public int getLimit() {return lim;}
    public double getBalance() {return bal;}
    public boolean charge(double credit) {
        if ((credit + bal) > lim) {
            return false;
        } else {
            bal += credit;
            return true;
        }
    }
    public void makePayment(double bill) {
        if (bill > 0) {
            bal -= bill;
        }
    }
    public void  updateLimit(int limit) {
        lim = limit;
    }
    public void printSummary() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank: " + bankName);
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + bal);
        System.out.println("Limit: " + lim);
    }

    @Override
    public String toString() {
        return "Customer Name: " + customerName +
        "Bank: " + bankName + "ID: " + accountId + 
        "Balance: " + bal + "Limit: " + lim;
    }
    public static void main(String[] args) {
    CreditCard[] wallet = new CreditCard[3];
    wallet[0] = new CreditCard("John Bowman", "California Savings",
                              "5391 0375 9387 5309", 5000);
    wallet[1] = new CreditCard("John Bowman", "California Federal",
                              "3485 0399 3395 1954", 3500);
    wallet[2] = new CreditCard("John Bowman", "California Finance",
                              "5391 0375 9387 5309", 2500, 300);

    for (int val = 1; val <= 16; val++) {
        wallet[0].charge(3 * val);
        wallet[1].charge(2 * val);
        wallet[2].charge(val);
    }

    for (CreditCard card : wallet) {
        card.printSummary();
        while (card.getBalance() > 200.0) {
            card.makePayment(200);
            System.out.println("New balance = " + card.getBalance());
        }
    }
    }        

}
