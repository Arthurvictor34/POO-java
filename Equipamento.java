public class Equipamento {
    protected String registro;
    public String nomeEquipamento;
    public String tipoEquipamento;

    // construtor
    public Equipamento(String registro, String nomeEquipamento, String tipoEquipamento){

        this.registro = registro;
        this.nomeEquipamento = nomeEquipamento;
        this.tipoEquipamento = tipoEquipamento;
    }

    // getters e setters

    public void setRegistro(String registro){
        this.registro = registro;
    } 

    public String getRegistro(){
        return this.registro;
    }

    public void setnomeEquipamento(String nomeEquipamento){
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getnomeEquipamento(){
        return this.nomeEquipamento;
    }

    public void settipoEquipamento(String tipoEquipamento){
        this.tipoEquipamento = tipoEquipamento;
    }

    public String gettipoEquipamento(){
        return this.tipoEquipamento;
    }
}