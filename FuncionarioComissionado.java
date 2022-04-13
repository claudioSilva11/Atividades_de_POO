public class FuncionarioComissionado extends FuncionarioA {
    private double comissao;
    private int unidades;
 
    public FuncionarioComissionado (String primeiro_nome, String segundo_nome, double salario, double comissao){
        
        super(primeiro_nome, segundo_nome, salario);
        
        this.comissao=comissao;
    }
    public Double getComissao(){
        return comissao;
    }
    public void setComissao(Double comissao){
            this.comissao=comissao;   
    }
    public double calcularPagamento(){
    	return getSalario()+( comissao * unidades );
    }
    public void adicionarVendas(int unidades){
        this.unidades=this.unidades+unidades;
    }
     public void redefinirVendas(){
        unidades=0;
    }
}
