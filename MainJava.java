public class MainJava {
    
    public static void main(String[] args){
        
        Cliente cl1 = new Cliente(" ", 0, " ", " ", " ", 0, 0);
        cl1.setnomeCompleto("Arthur Victor ");
        cl1.setIdade(18);
        cl1.setCPF("123.456.678-11");
        cl1.setEndereço("Rua Centro");
        cl1.setCelular("98 94002-8922");
        cl1.setSalario(1374.54);
        cl1.setCadastro(1);

        Aluguel al1 = new Aluguel(0, 0, 0);
        al1.setcustoAluguel(150.45);
        al1.setcustoManutenção(120.87);
        al1.setprazoAluguel(5); //quantidade de dias

        Equipamento eq1 = new Equipamento(0," ", " ");
        eq1.setRegistro(3);
        eq1.setnomeEquipamento("Machado");
        eq1.settipoEquipamento("Manual");

        
    }
}
