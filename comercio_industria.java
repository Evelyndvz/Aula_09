import static java.lang.IO.*;

void main() {
    //entrada
    IO.print("Digite o consumo: ");
    float consumo = Float.parseFloat(readln());

    if(consumo <=10) {
        IO.print("R$ valor = 44,95m³");
    }  else if (consumo <= 20) {
        IO.print("R$ valor 8,75m³ total;"+ 8.75*consumo);
    } else if (consumo <= 50) {
        IO.print("R$ valor 26,76m³ total;"+ 16.76*consumo);
    } else if (consumo >=50) {
        IO.print("R$17,46m³ total;" + 17.46*consumo);
    }
}