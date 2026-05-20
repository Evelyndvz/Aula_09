import static java.lang.IO.*;

void main() {

    print("Em que turno você estuda? (M-Matutino, V-Vespertino, N-Noturno): ");
    String turno = readln();

    switch (turno) {
        case "M" -> println("Bom Dia!");
        case "V" -> println("Boa Tarde!");
        case "N" -> println("Boa Noite!");
        default  -> println("Valor Inválido!");
    }
}