public class Aluguel implements IcalculoValores {
    protected double custoAluguel;
    protected double custoManutenção;
    protected int prazoAluguel;

    // construtor 
    public Aluguel(double custoAluguel, double custoManutenção, int prazoAluguel){

        this.custoAluguel = custoAluguel;
        this.custoManutenção = custoManutenção;
        this.prazoAluguel = prazoAluguel;
    }

    @Override
    public double CalculaDiaria(double diaria){
        return custoAluguel * diaria;
    }

    @Override 
    public double CalculaHora(double hora){
        return custoAluguel * hora;
    }


    // getters e setters

    public void setcustoAluguel(double custoAluguel){
        this.custoAluguel = custoAluguel;
    }

    public double getcustoAluguel(){
        return this.custoAluguel;
    }

    public void setcustoManutenção(double custoManutenção){
        this.custoManutenção = custoManutenção;
    }

    public double getcustoManutenção(){
        return this.custoManutenção;
    }

    public void setprazoAluguel(int prazoAluguel){
        this.prazoAluguel = prazoAluguel;
    }

    public int getprazoAluguel(){
        return this.prazoAluguel;
    }
}
