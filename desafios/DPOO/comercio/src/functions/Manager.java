package functions;

public non-sealed class Manager extends ExtendUser {
    private final boolean adm = true;
    private String verifyName = "jose";
    private String verifyPassword = "0023";


    public void generateReport(){
        System.out.println("As vendas estao batendo as metas");
        System.out.println("Não tivemos nenhuma devolução de mercadoria");
        System.out.println("È os cleintes estao gostando dos nossos preços");
    }

    public String getVerifyName() {
        return verifyName;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }
}
