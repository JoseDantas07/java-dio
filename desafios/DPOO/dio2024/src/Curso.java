public class Curso extends Conteudo{

private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return xp * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +"nome=" + getNome() +"descrição="+getDescricao()+ "cargaHoraria=" + cargaHoraria + '}';
    }
}
