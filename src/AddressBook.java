import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tooba","Canada","1");
        AddressBook buddies = new AddressBook();

        buddies.addBuddy(buddy);
        buddies.removeBuddy(buddy);

        System.out.println("Address Book");
    }
}
