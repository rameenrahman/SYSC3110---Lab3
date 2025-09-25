public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(){
        name = "Unknown";
        address = "Unknown";
        phone = "Unknown";
    }

    public BuddyInfo(String name) {
        this();
        this.name = name;
    }

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("");

        BuddyInfo buddy1 = new BuddyInfo("Homer");

        System.out.println("Hello " + buddy1.getName());
    }
}
