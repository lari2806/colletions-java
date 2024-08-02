package ListaTarefas;
public class Tarefa {
    private String descriçao;
      public Tarefa(String descriçao){
        this.descriçao = descriçao;
      }
    
    public String getDescriçao(){
        return descriçao;
    }
    @Override
    public String toString(){
        return descriçao;
    }
}
