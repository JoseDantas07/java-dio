package functions;

public non-sealed class Manager extends ExtendUser {
    private final boolean adm = true;
    private String verifyName = "jose";
    private String verifyPassword = "0023";


    public void managerRole(){

    }

    public boolean isAdm() {
        return adm;
    }

    public String getVerifyName() {
        return verifyName;
    }

    public void setVerifyName(String verifyName) {
        this.verifyName = verifyName;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
