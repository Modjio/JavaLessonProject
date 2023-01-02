import java.util.Date;

public class Account {
    private int id;             // идентификатор счета
    private double balance;     // остаток (баланс) счета
    private double annualInterestRate;      // годовая процентная ставка
    private Date dateCreated;   // дата создания счета

    /**
     * default constructor
     */
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }

    /**
     * base constructor
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    /**
     * set/get method
     * id
     */
    void setId(int id) {
        this.id = Math.max(id, 0);
    }

    int getId() {
        return id;
    }

    /**
     * set/get method
     * balance
     */
    void setBalance(double balance) {
        this.balance = Math.max(balance, 0);
    }

    double getBalance() {
        return balance;
    }

    /**
     * set/get method
     * annualInterestRate
     */
    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = Math.max(annualInterestRate, 0);
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * get method
     * dateCreated
     */
    Date getDateCreated() {
        return dateCreated;
    }

    /**
     * метод предназначен для возврата ежемесячных процентов
     * getMonthlyInterest
     */
    double getMonthlyInterest() {
        return balance * ((annualInterestRate / 100) / 12);
    }

    /**
     * метод который снимает со счета указанную сумму
     * withdraw
     */
    double withdraw(double amount) {
        return balance -= Math.max(amount, 0);
    }

    /**
     * метод который пополняет счет на указанную сумму
     * deposit
     */
    double deposit(double amount) {
        return balance += Math.max(amount, 0);
    }
}
