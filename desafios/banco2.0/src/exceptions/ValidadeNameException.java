package exceptions;

public class ValidadeNameException {
    private String name;
    private boolean finish = true;

    public void validadeName(String name){
        if (name.isEmpty()){
            setFinish(true);
            throw new IllegalArgumentException("Nome invalido");
        }else {
            this.name = name;
            setFinish(false);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
