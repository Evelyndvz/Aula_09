import static java.lang.IO.*;
void main() {
   //entrada
   IO.print("Digite o consumo: ");
   float consumo = Float.parseFloat(readln());

   if(consumo <=10) {
      IO.print("R$ valor = 7,59m³");
   }  else if (consumo <= 20) {
      IO.print("R$ valor 1,31m³ total;"+ 1.31*consumo);
   } else if (consumo <= 30) {
      IO.print("R$ valor 4,64m³ total;"+ 4.64*consumo);
   } else if (consumo <=50) {
      IO.print("R$6,62m³ total;"+ 6.62*consumo);
   } else{ IO.print("R$ valor 7,31m³ total;"+ 7.31* consumo);
   }

}