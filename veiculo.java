public abstract class veiculo {

    private String placa;
    private String modelo;
    protected double capacidadeCargaKg;

    public veiculo(String placa, String modelo, double capacidadeCargaKg) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCargaKg = capacityValida(capacidadeCargaKg);
    }

    private double capacityValida(double carga) {
        return carga > 0 ? carga : 100;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public abstract double calcularCustoFrete(double distanciaKm);
}