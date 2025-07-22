package exceptions;

public class ValidadeEmailException {
    private String email;
    private boolean finish = true;

    public void validadeEmail(String email){
        if (!email.contains("@")){
            setFinish(true);
            throw new IllegalArgumentException("Email invalido");
        }else {
            this.email = email;
            setFinish(false);
        }
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public String getEmail() {
        return email;
    }

}
