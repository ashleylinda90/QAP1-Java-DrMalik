package QAPPart1;

public class TestAccount {
    public static void main(String[] args) {

        // Memory allocated to blocks that have space to store its own name, ID, balance
        Account A = new Account("123", "AccountA", 1000);
        Account B = new Account("456", "AccountB", 1000);

        // Print statements
        // Balance in each account
        System.out.println("Account A has balance of = " + A.getBalance());
        System.out.println("Account B has balance of = " + B.getBalance());

        System.out.println("=============================");

        // Credit $1000 to account A
        System.out.println("Credit $1000 in Account A");
        System.out.println("Account A now has balance of = " + A.credit(1000));

        // Credit $2000 to account B
        System.out.println("Credit $2000 in Account B");
        System.out.println("Account B now has balance of = " + B.credit(2000));

        System.out.println("=============================");

        // Transfer $1000 to A from B
        System.out.println("Transfer $1000 from Account B to Account A");
        System.out.println("Account B now has balance of = " + B.transferTo(A, 1000)); // B's balance
        System.out.println("Account A now has balance of = " + A.getBalance()); // Added A's balance

        System.out.println("=============================");

        // Debit $100 from A
        System.out.println("Debit $100 from Account A");
        System.out.println("Account A now has balance of = " + A.debit(100));

        // Try to debit $3000 from B
        System.out.println("Debit $3000 from Account B");
        System.out.println("Account B has balance of = " + B.debit(3000));

    }
}
