public class AccountClient {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000);

        account1.setAnnualInterestRate(4.5);

        account1.withdraw(2500);

        account1.deposit(3000);

        System.out.println("Идентификатор " + account1.getId() + ", баланс " + account1.getBalance() +
                "₽, начисленные проценты " + account1.getMonthlyInterest() + "₽, дата создания счёта " + account1.getDateCreated());
    }
}
