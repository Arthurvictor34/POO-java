public class Cliente extends Pessoa {
    protected double salario;
    private int cadastro;
    
    // Construtor com super
    public Cliente(String nomeCompleto, int idade, String cpf, String endereço, String celular, double salario, int cadastro){
        super(nomeCompleto, idade, cpf, endereço, celular);
        this.salario = salario;
        this.cadastro = cadastro;
    }

    // getters e setters
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setCadastro( int cadastro){
        this.cadastro = cadastro;
    }

    public int getCadastro(){
        return this.cadastro;
    }
}
