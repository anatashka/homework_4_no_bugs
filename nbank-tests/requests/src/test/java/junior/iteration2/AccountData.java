package junior.iteration2;

public class AccountData {
    private Integer id;
    private String accountNumber;
    private Double balance;
    private String transactions;

    public AccountData(Integer id, String accountNumber, Double balance, String transactions) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = transactions;
    }

    public Integer getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public String getTransactions() {
        return transactions;
    }
}
