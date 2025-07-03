package functions;

public non-sealed class Seller extends ExtendUser{
    private String verifyName = "ariel";
    private String verifyPassword = "123";
    private int MakeSale = 0;

    public int MakeSale(){
        System.out.println("vendendo produtos");
        return MakeSale++;
    }
    public void consultSales(){
        System.out.println(getMakeSale());
    }

    public int getMakeSale() {
        return MakeSale;
    }

    public String getVerifyName() {
        return verifyName;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }
}
