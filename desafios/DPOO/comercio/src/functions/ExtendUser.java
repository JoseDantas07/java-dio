package functions;

public sealed abstract class ExtendUser permits Manager,Seller,Attendant{
    private String name;
    private String password;
    private String email;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
