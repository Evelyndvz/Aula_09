import  static java.lang.IO.*;

void main() {

        println("Bem-vindo(a) ao programa!"); //1-mostrar titulo do programa

//2- pedir as informaçoes
        float lado1 = Float.parseFloat(readln("Por favor digite o valor do dado da lado 1: "));
        float lado2= Float.parseFloat(readln("Por favor digite o valor do dado do lado 2: "));
        float lado3 = Float.parseFloat(readln("Por favor digite o valor do dado do lado 3: "));

//3-calcular e mostrar resultado
        if (lado1 + lado2 >= lado3 || lado2 + lado3 >= lado1 || lado3 + lado1 >= lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                println("esse triangulo e um EQUILATERO");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                println("esse triangulo e um ISOSCELES");
            } else {
                println("esse triangulo e um ESCALENO");
            }
        }
        else {
            println("isto nao e um triangulo");
        }

}