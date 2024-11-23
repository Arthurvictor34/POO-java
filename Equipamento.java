public class Equipamento {
    protected int registro;
    public String nomeEquipamento;
    public String tipoEquipamento;

    // construtor
    public Equipamento(int registro, String nomeEquipamento, String tipoEquipamento){

        this.registro = registro;
        this.nomeEquipamento = nomeEquipamento;
        this.tipoEquipamento = tipoEquipamento;
    }

    // getters e setters

    public void setRegistro(int registro){
        this.registro = registro;
    } 

    public int getRegistro(){
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