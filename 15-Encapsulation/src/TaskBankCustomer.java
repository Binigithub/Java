public class TaskBankCustomer {   
	public static void main(String[] args) {

        

      TaskBankAccount mikeAccount = new TaskBankAccount();

        mikeAccount.setAccountNumber("5555555");

        mikeAccount.setBalance(2.5);

        mikeAccount.setCustomerName("mike");

         mikeAccount.withdrawal(100.0);

        mikeAccount.deposit(150.000);

        mikeAccount.withdrawal(50.0);

        System.out.println(mikeAccount.getCustomerName());
}
}