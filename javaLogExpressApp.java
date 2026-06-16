import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaLogExpressApp {

public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    List<veiculo> frota = new ArrayList<>();
    int opcao = -1;

    while (opcao != 0) {

        System.out.println("\nJAVALOG EXPRESS:");
        System.out.println("1. Cadastrar van no sistema");
        System.out.println("2. Cadastrar caminhão no sistema");
        System.out.println("3. Listar veículos da frota e custos de frete simulados");
        System.out.println("0. Encerrar sistema");
        System.out.print("Escolha uma opção: ");

        opcao = leitor.nextInt();
        leitor.nextLine();

        switch (opcao) {

            case 1:

                System.out.print("Digite a Placa da Van: ");
                String pVan = leitor.nextLine();

                System.out.print("Digite o Modelo: ");
                String mVan = leitor.nextLine();

                System.out.print("Capacidade de Carga (kg): ");
                double cVan = leitor.nextDouble();
                leitor.nextLine();

                van van = new van(pVan, mVan, cVan);
                frota.add(van);

                System.out.println("Van cadastrada com sucesso!");
                break;

            case 2:

                System.out.print("Digite a Placa do Caminhão: ");
                String pCam = leitor.nextLine();

                System.out.print("Digite o Modelo: ");
                String mCam = leitor.nextLine();

                System.out.print("Capacidade de Carga (kg): ");
                double cCam = leitor.nextDouble();

                System.out.print("Número de Eixos do Caminhão: ");
                int eixos = leitor.nextInt();
                leitor.nextLine();

                caminhao caminhao = new caminhao(
                        pCam,
                        mCam,
                        cCam,
                        eixos
                );

                frota.add(caminhao);

                System.out.println("Caminhão cadastrado com sucesso!");
                break;

            case 3:

                System.out.println("\n--- RELATÓRIO DA FROTA E SIMULAÇÃO DE FRETE (Para 100km) ---");

                if (frota.isEmpty()) {
                    System.out.println("Nenhum veículo cadastrado na frota.");
                } else {

                    for (veiculo v : frota) {

                        if (v instanceof caminhao) {

                            caminhao c = (caminhao) v;

                            System.out.println(
                                    "Veículo: Caminhão | Placa: " + c.getPlaca()
                                    + " | Modelo: " + c.getModelo()
                                    + " | Capacidade: " + c.getCapacidadeCargaKg() + "kg"
                                    + " | Eixos: " + c.getEixos()
                                    + " | Frete Simulado: R$ "
                                    + c.calcularCustoFrete(100)
                            );

                        } else {

                            System.out.println(
                                    "Veículo: Van | Placa: " + v.getPlaca()
                                    + " | Modelo: " + v.getModelo()
                                    + " | Capacidade: " + v.getCapacidadeCargaKg() + "kg"
                                    + " | Frete Simulado: R$ "
                                    + v.calcularCustoFrete(100)
                            );
                        }
                    }
                }
                break;

            case 0:
                System.out.println("Encerrando o sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    leitor.close();
}


}
