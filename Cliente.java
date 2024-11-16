public class Cliente extends Pessoa {
    protected double salario;
    private String cadastro;
    
    // Construtor com super
    public Cliente(String nomeCompleto, int idade, String cpf, String endereço, String celular, double salario, String cadastro){
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

    public void setCadastro( String cadastro){
        this.cadastro = cadastro;
    }

    public String getCadastro(){
        return this.cadastro;
    }
}
