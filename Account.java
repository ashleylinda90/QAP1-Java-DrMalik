package QAPPart1;

// Account class

public class Account {

    // Instance variables
    private String Name;
    private String ID;
    private int Balance = 0;

    // Paramaterized constructor
    public Account(String id, String n) {
        ID = id;
        Name = n;
    }

    // Paramaterized constructor
    public Account(String id, String n, int b) {
        ID = id;
        Name = n;
        Balance = b;
    }

    // Getters
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }

    // Credit account
    public int credit(int amount) {
        Balance += amount;
        return Balance;
    }

    // Debit account
    public int debit(int amount) {
        if (amount <= Balance) {
            Balance -= amount;
        } else {
            System.out.println("Amount exceeded balance!");
        }
        return Balance;
    }

    // Transfer funds to account
    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= Balance) {
            Balance -= amount;
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance!");
        }
        return Balance;
    }

    // toString()
    public String toString() {
        return "Account[ID = " + ID + ", Name = " + Name + ", Balance = " + Balance + "]";
    }
}
