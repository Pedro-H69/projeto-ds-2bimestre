public class caminhao extends veiculo {

    private int eixos;

    public caminhao(String placa, String modelo,
                    double capacidadeCargaKg, int eixos) {

        super(placa, modelo, capacidadeCargaKg);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularCustoFrete(double distanciaKm) {
        return distanciaKm * 4.5 * eixos;
    }
}