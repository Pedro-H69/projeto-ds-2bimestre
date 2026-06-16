public class van extends veiculo {

    public van(String placa, String modelo, double capacidadeCargaKg) {
        super(placa, modelo, capacidadeCargaKg);
    }

    @Override
    public double calcularCustoFrete(double distanciaKm) {

        double frete = distanciaKm * 2.5;

        if (capacidadeCargaKg > 1000) {
            frete += 30;
        }

        return frete;
    }
}
