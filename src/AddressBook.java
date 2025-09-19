import java.util.*;

public class AddressBook {
    private Dictionary<String, BuddyInfo> buddies;

    public AddressBook(){
        buddies = new Hashtable<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(!buddy.getName().equals("Unknown")){
            buddies.put(buddy.getName(), buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy.getName());
    }

    public static void main(String[] args){
        System.out.println("Address Book");
        System.out.println("");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
