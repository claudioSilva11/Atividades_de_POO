public class FuncionarioA{
    private String primeiro_nome;
    protected String segundo_nome;
    protected Double salario;
 
    public FuncionarioA (String primeiro_nome, String segundo_nome,double salario){
        this.primeiro_nome=primeiro_nome;
        this.segundo_nome=segundo_nome;
        this.salario=salario;
    }
    public String getPrimeiro_nome(){
        return primeiro_nome;
    }
    public void setPrimeiro_nome(String primeiro_nome){
        this.primeiro_nome=primeiro_nome;
    }
    public String getSegundo_nome(){
        return segundo_nome;
    }
    public void setSegundo_nome(String segundo_nome){
        this.segundo_nome=segundo_nome;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario=salario;
    }
}