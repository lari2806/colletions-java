import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private  Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Savio", 2390);
        conjuntoConvidados.adicionarConvidado("Ariely", 1395);
        conjuntoConvidados.adicionarConvidado("Mateus", 1460);
        conjuntoConvidados.adicionarConvidado("Savio", 2390);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " convidado(s)");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1460);
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " convidado(s)");
    }
}
