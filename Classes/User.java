package Classes;

public class User {
    String name, id;
    public User() {
        this.name = "NO_NAME";
        this.id = "0";
    }
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void showDetails() {
        System.out.println("User Name : " + name);
        System.out.println("User ID : " + id);
    }
}
