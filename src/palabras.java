public class palabras {

    public void evaluar(){

        System.out.print("Ingresa una palabra: ");
        palabra1 = ingreso.next();
        System.out.print("Ingresa otra palabra: ");
        palabra2 = ingreso.next();
        conteo1 = palabra1.length();//cuenta nro de letras
        conteo2 = palabra2.length();
        diferencia = Math.abs(conteo1 - conteo2); //valor absoluto

        if (conteo1 > conteo2){
            System.out.printf("\nLa palabra mayor es %s\n", palabra1);
        }
        if (conteo1 < conteo2){
            System.out.printf("\nLa palabra mayor es %s\n", palabra2);
        }
        if(conteo1 == conteo2){
            System.out.printf("\nLas palabras tienen la misma longitud\n");
        }

        System.out.printf("La diferencia es de %d letra(s)\n", diferencia);


    }
}
