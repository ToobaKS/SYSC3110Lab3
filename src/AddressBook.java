import java.util.ArrayList;

//Testing

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null){
            buddies.add(buddy);
        }
    }

    public void newMethod() {
        System.out.println("Testing");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tooba","Canada","1");
        AddressBook buddies = new AddressBook();

        buddies.addBuddy(buddy);
        buddies.removeBuddy(buddy);

        System.out.println("Address Book");
    }
}
