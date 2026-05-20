import static java.lang.IO.*;

void main() {
    print("Digite o primeiro número (ou o número base): ");
    double n1 = Double.parseDouble(readln());

    print("Escolha a operação:\n1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão,\n5-Potência, 6-Raiz Quadrada, 7-Par/Ímpar: ");
    int opcao = Integer.parseInt(readln());

    switch (opcao) {
        case 1 -> {
            print("Digite o segundo número: ");
            double n2 = Double.parseDouble(readln());
            println("Resultado: " + (n1 + n2));
        }
        case 2 -> {
            print("Digite o segundo número: ");
            double n2 = Double.parseDouble(readln());
            println("Resultado: " + (n1 - n2));
        }
        case 3 -> {
            print("Digite o segundo número: ");
            double n2 = Double.parseDouble(readln());
            println("Resultado: " + (n1 * n2));
        }
        case 4 -> {
            print("Digite o divisor: ");
            double n2 = Double.parseDouble(readln());
            if (n2 != 0) println("Resultado: " + (n1 / n2));
            else println("Erro: Divisão por zero!");
        }
        case 5 -> {
            print("Digite o expoente: ");
            double n2 = Double.parseDouble(readln());
            println("Resultado: " + Math.pow(n1, n2));
        }
        case 6 -> {
            if (n1 >= 0) println("Raiz Quadrada: " + Math.sqrt(n1));
            else println("Erro: Número negativo não possui raiz real.");
        }
        case 7, 8 -> {
            if (n1 % 2 == 0) println(n1 + " é Par.");
            else println(n1 + " é Ímpar.");
        }
        default -> println("Opção inválida!");
    }
}