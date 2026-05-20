import static java.lang.IO.*;

void main() {
    // Entrada de dados
    print("Digite o salário atual do funcionário: R$ ");
    double salarioAntes = Double.parseDouble(readln());

    double percentual;

    // Lógica para determinar o percentual de aumento
    if (salarioAntes <= 1000.00) {
        percentual = 20;
    } else if (salarioAntes <= 1700.00) {
        percentual = 15;
    } else if (salarioAntes <= 2300.00) {
        percentual = 10;
    } else {
        percentual = 5;
    }

    // Cálculos matemáticos
    double valorAumento = salarioAntes * (percentual / 100);
    double novoSalario = salarioAntes + valorAumento;

    // Saída formatada conforme o exemplo
    println("\n--- Resumo do Reajuste ---");
    println("Salário antes do reajuste: R$ " + String.format("%.2f", salarioAntes));
    println("Percentual de aumento aplicado: " + (int)percentual + "%");
    println("Valor do aumento: R$ " + String.format("%.2f", valorAumento));
    println("Novo salário, após o aumento: R$ " + String.format("%.2f", novoSalario));
}