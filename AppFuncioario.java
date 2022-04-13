public class AppFuncioario {
    public static void main(String [] arg){
    	FuncionarioComissionado f1 = new FuncionarioComissionado("Cláudio", "Silva", 1200, 23.0);
    	f1.adicionarVendas(5);

        FuncionarioComissionado f2 = new FuncionarioComissionado("João", "Silva", 1200, 25.0);
    	f1.adicionarVendas(9);

        System.out.println("......1° funcionario....... ");
    	System.out.println("primeiro nome: "+f1.getPrimeiro_nome());
    	System.out.println("segundo nome: "+f1.segundo_nome);
    	System.out.println("salario base: "+f1.salario);
    	System.out.println("pagamento total: "+f1.calcularPagamento());

        System.out.println("......2° funcionario....... ");
        System.out.println("primeiro nome: "+f2.getPrimeiro_nome());
    	System.out.println("segundo nome: "+f2.segundo_nome);
    	System.out.println("salario base: "+f2.salario);
    	System.out.println("pagamento total: "+f2.calcularPagamento());
    }
}
