package model;

public class Veiculo {

    private String tipo;
    private String numeroChassi;
    private int numeroRodas;
    private float potenciaMotor;

    public void inicializa(String tipo, String chas, int qtde_rodas, float potencia){
        this.tipo = tipo;
        this.numeroChassi = chas;
        this.numeroRodas = qtde_rodas;
        this.potenciaMotor = potencia;
    }

    public String retornaTipo() {
        return tipo;
    }

    public String retornaNumeroChassi() {
        return numeroChassi;
    }

    public int retornaNumeroRodas() {
        return numeroRodas;
    }

    public float retornaPotenciaMotor() {
        return potenciaMotor;
    }

    public Veiculo clona(Veiculo veiculo_a_ser_clonado){
        Veiculo veiculoClone = new Veiculo();
        veiculoClone.inicializa(veiculo_a_ser_clonado.tipo, veiculo_a_ser_clonado.numeroChassi, veiculo_a_ser_clonado.numeroRodas, veiculo_a_ser_clonado.potenciaMotor);
        return veiculoClone;
    }

    public int compara(Veiculo veiculo_a_ser_comparado1, Veiculo veiculo_a_ser_comparado2){
        boolean isTipoIgual = veiculo_a_ser_comparado1.tipo.equals(veiculo_a_ser_comparado2.tipo);
        boolean isNumeroChassiIgual = veiculo_a_ser_comparado1.numeroChassi.equals(veiculo_a_ser_comparado2.numeroChassi);
        boolean isNumeroRodasIgual = veiculo_a_ser_comparado1.numeroRodas == veiculo_a_ser_comparado2.numeroRodas;
        boolean isPotenciaMotorIgual = veiculo_a_ser_comparado1.potenciaMotor == veiculo_a_ser_comparado2.potenciaMotor;

        if(isTipoIgual && isNumeroChassiIgual && isNumeroRodasIgual && isPotenciaMotorIgual){
            return 1;
        } else {
            return 0;
        }
    }
}
