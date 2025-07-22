package exceptions;

public class ValidateCpfException {
    private String cpf;
    private boolean finish = true;



    public void ValidateCpf(String cpf){
        cpf = cpf.replaceAll("\\D","");
        if (!cpf.matches("\\d{11}")){
            setFinish(true);
            throw new IllegalArgumentException("O cpf deve ter 11 digitos");
        }else {
            this.cpf = cpf;
            setFinish(false);
        }

    }

    public boolean isFinish() {
        return finish;
    }
    public void setFinish(boolean finish){
        this.finish = finish;
    }

    public String getCpf() {
        return cpf;
    }
}
