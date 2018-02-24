package data;

public class User {
    private String brugernavnet;

    public User() {
    }

    public User(String brugernavnet, String name) {
        this.brugernavnet = brugernavnet;
    }



    public String getBrugernavnet() {
        return brugernavnet;
    }

    public void setBrugernavnet(String brugernavnet) {
        this.brugernavnet = brugernavnet;
    }

}
