import java.time.LocalTime;
import java.time.OffsetDateTime;

public class Mentoria extends Conteudo{

    LocalTime date;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return xp + 10d;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +" nome= " + getNome() +" descrição= "+getDescricao()+ " date= " + date + '}';
    }
}
