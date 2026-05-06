import static java.lang.IO.*;

void main() {
    IO.println("***** PROGRAMA DO MENU DE OPCOES ****");

    IO.println("Digite a opcao desejada: ");
    int dia = Integer.parseInt(readln());

    switch(dia){
        case 1:
            IO.println("VOCE ESCOLHEU A OPCAO 1");
            break;
        case 2:
            IO.println("VOCE ESCOLHEU A OPCAO 1");
            break;
        case 3:
            IO.println("VOCE ESCOLHEU A OPCAO 1");
            break;
        case 4:
            IO.println("VOCE ESCOLHEU A OPCAO SAIR");
            break;
        default:IO.println("OPÇÃO INVÁLIDA");
            break;
    }
}