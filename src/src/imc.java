import static java.lang.IO.*;

void main() {
    IO.print("Digite seu peso:");
    float peso = Float.parseFloat(readln());
    IO.println("Digite a altura:");

float altura = Float.parseFloat(readln());

            float imc = (peso/ (altura * altura));
     if (imc < 16) {
        IO.println("Magreza grave!");

    }else if (imc <17) {
            IO.println("Magreza moderada");
        }else if (imc<18.5){
                IO.println("magreza leve");

            } else if  (imc <25) {
        IO.println("Saudável");
    }else if (imc <30){
         IO.println("Sobrepeso");

    } else if (imc <35) {
         IO.println("Obesidade Grau 1");

     } else if (imc < 40) {
         IO.println("Obesidade Grau 2 (severa)");

     } else if ( imc > 40) {
         IO.println("Obesidade Grau 3(mórbida)");


     }


}