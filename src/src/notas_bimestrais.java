import static java.lang.IO.*;

void main() {
    print("Digite a 1ª nota: ");
    double n1 = Double.parseDouble(readln());
    print("Digite a 2ª nota: ");
    double n2 = Double.parseDouble(readln());
    print("Digite a 3ª nota: ");
    double n3 = Double.parseDouble(readln());
    print("Digite a 4ª nota: ");
    double n4 = Double.parseDouble(readln());

    double media = (n1 + n2 + n3 + n4) / 4;

    String conceito;
    if (media >= 9.0) {
        conceito = "A";
    } else if (media >= 7.5) {
        conceito = "B";
    } else if (media >= 6.0) {
        conceito = "C";
    } else if (media >= 4.0) {
        conceito = "D";
    } else {
        conceito = "E";
    }

    String status = switch (conceito) {
        case "A", "B", "C" -> "APROVADO";
        case "D", "E"      -> "REPROVADO";
        default            -> "ERRO";
    };

    // 5. Exibição dos resultados
    println("\n--- BOLETIM SEMESTRAL ---");
    println("Notas: " + n1 + " | " + n2 + " | " + n3 + " | " + n4);
    println("Média Final: " + String.format("%.1f", media));
    println("Conceito: " + conceito);
    println("Status: " + status);
    println("-------------------------");
}