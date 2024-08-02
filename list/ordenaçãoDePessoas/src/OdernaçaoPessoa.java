package ordenaçãoDePessoas.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OdernaçaoPessoa {
  
    private List<Pessoa> pessoaList;

    public OdernaçaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura());;
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OdernaçaoPessoa odernaçaoPessoa = new OdernaçaoPessoa();
        odernaçaoPessoa.adicionarPessoa("Larissa", 17, 1.52);
        odernaçaoPessoa.adicionarPessoa("Savio", 16, 1.69);
        System.out.println(odernaçaoPessoa.ordenarPorAltura());
        System.out.println(odernaçaoPessoa.ordenarPorIdade());
    }
    
    
}
