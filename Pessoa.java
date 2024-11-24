public abstract class Pessoa {
    private String nomeCompleto;
    private int idade;
    private String cpf;
    protected String endereço;
    private String celular;

    public Pessoa(){
        // Construtor Vazio
    }
    
    // Construtor
    public Pessoa(String nomeCompleto, int idade, String cpf, String endereço, String celular){
        
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.cpf = cpf;
        this.endereço = endereço;
        this.celular = celular;
    }

    // getters e setters

    public void setnomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getnomeCompleto(){
        return this.nomeCompleto;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public String getEndereço(){
        return this.endereço;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public String getCelular(){
        return this.celular;
    }
}
