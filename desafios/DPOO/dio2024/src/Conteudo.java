public abstract class Conteudo {

    protected static final double xp = 10d;

    private String nome;
    private String descricao;

    public abstract double calcularXp();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
