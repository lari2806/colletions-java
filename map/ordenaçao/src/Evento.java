public class Evento {
    private String nome;
    private String atraçao;
    public Evento(String nome, String atraçao) {
        this.nome = nome;
        this.atraçao = atraçao;
    }
    public String getNome() {
        return nome;
    }
    public String getAtraçao() {
        return atraçao;
    }
    
    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", atraçao=" + atraçao + "]";
    }
    
    
}
