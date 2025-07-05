package functions;

public class Google implements Browser{

    @Override
    public String displayPage() {
        return "Exibindo pagina";
    }

    @Override
    public String addNewTab() {
        return "Adicionado nova pagina";
    }

    @Override
    public String refreshPage() {
        return "Atualizando pagina";
    }
}
