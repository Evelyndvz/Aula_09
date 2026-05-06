import static java.lang.IO.*;
void main() {
    //entrada
    IO.print("Digite o consumo: ");
    float consumo = Float.parseFloat(readln());

    if(consumo <=10) {
        IO.print("R$ valor = 22,38m³");
    }  else if (consumo <= 20) {
        IO.print("R$ valor 3,50m³ total;"+ 3.50*consumo);
    } else if (consumo <= 50) {
        IO.print("R$ valor 8,75m³ total;"+ 8.75*consumo);
    } else if (consumo >=50) {
        IO.print("R$9,64m³ total;" + 9.64 * consumo);
    }
}