import static java.lang.IO.*;
void main() {
    IO.print("Digite o número:");
    int dia = Integer.parseInt(readln());

    switch (dia){
        case    1:
            IO.println("DOMINGO!");
        break;
        case 2:
            IO.println("Segunda-feira");
            break;
        case 3:
            IO.println("Terça-feira");
            break;

        case 4:
            IO.println("Quarta-feira");
            break;
        case 5:
            IO.println("Quinta-feira");
            break;
        case 6:
            IO.println("Sexta");
            break;
        case 7:
            IO.println("Sábado");
            break;

        default: IO.println("Opção inválida");
        break;



    }
    
}