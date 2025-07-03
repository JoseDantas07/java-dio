package functions;

public non-sealed class Seller extends ExtendUser{
    private String verifyName = "ariel";
    private String verifyPassword = "123";
    private int MakeSale = 0;

    public void MakeSale(){
        System.out.println("vendendo produtos");
        addMakeSale();
    }

    public void getMakeSale() {
        System.out.printf("Fizemos %d vendas ate agora\n",MakeSale);
    }

    public void addMakeSale() {
        MakeSale++;
    }

    public String getVerifyName() {
        return verifyName;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }
}
