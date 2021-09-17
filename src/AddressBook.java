import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook(ArrayList<BuddyInfo> buddy) {
        this.buddies = buddy;
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public static void main(String[] args) {
        //BuddyInfo buddy = new BuddyInfo("Tooba","Canada","1");

        System.out.println("Address Book");
    }
}
