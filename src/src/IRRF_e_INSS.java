import static java.lang.IO.*;

void main() {
    print("Digite o valor do salário bruto: R$ ");
    double salarioBruto = Double.parseDouble(readln());

    double inss = calcularINSS(salarioBruto);

    double baseCalculoIRRF = salarioBruto - inss;
    double irrf = calcularIRRF(baseCalculoIRRF);

    double salarioLiquido = salarioBruto - inss - irrf;

    println("\n--- DETALHAMENTO DO SALÁRIO ---");
    println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
    println("Desconto INSS: R$ " + String.format("%.2f", inss));
    println("Desconto IRRF: R$ " + String.format("%.2f", irrf));
    println("-------------------------------");
    println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
}

double calcularINSS(double salario) {
    if (salario <= 1302.00) return salario * 0.075;
    if (salario <= 2571.29) return (salario * 0.09) - 19.53;
    if (salario <= 3856.94) return (salario * 0.12) - 96.67;
    if (salario <= 7507.49) return (salario * 0.14) - 173.80;
    return 877.24;
}
double calcularIRRF(double base) {
    if (base <= 1903.98) return 0;
    if (base <= 2826.65) return (base * 0.075) - 142.80;
    if (base <= 3751.05) return (base * 0.15) - 354.80;
    if (base <= 4664.68) return (base * 0.225) - 636.13;
    return (base * 0.275) - 869.36;
}