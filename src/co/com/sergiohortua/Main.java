package co.com.sergiohortua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc =new Scanner(System.in);
        double compra=0, compraTotal=0;
        int opc;

        int seguir=0;
        do {
            System.out.println("===ALMACEN JAVA===");
            System.out.println("1. Camisa -> $70.000");
            System.out.println("2. Pantalon -> $90.000");
            System.out.println("3. Chaqueta -> $120.000");
            System.out.println("4. Zapatos -> $250.000");
            System.out.println("5. Cinturon -> $100.000");
            System.out.println("6. Bufanda -> $60.000");
            System.out.print("Digite el articulo a comprar: ");
            opc = tc.nextInt();
            switch (opc){
                case 1:compraTotal+=70000;
                        break;
                case 2:compraTotal+=90000;
                    break;
                case 3:compraTotal+=120000;
                    break;
                case 4:compraTotal+=250000;
                    break;
                case 5:compraTotal+=100000;
                    break;
                case 6:compraTotal+=70000;
                    break;
                default:
                    System.out.println("Elije bien");
            }

            System.out.println("DESEA COMPRAR OTRO ARTICULO: \n(1. SI\n2. NO )");
            seguir = tc.nextInt();

        } while (seguir != 2);

        System.out.println("compra total: " + compraTotal);

        if (compraTotal<=100000){
            double desc1= compraTotal*0.1;
            System.out.println("Su descuento por compras inferiores a 100.000 es: " + desc1);
            System.out.println("El valor total de su factura es: "+(compraTotal-desc1));
        }else if (compraTotal>=101000 && compraTotal<=300000){
            double desc2= compraTotal*0.15;
            System.out.println("Su descuento por compras superiores a 101.000 e  inferiores a 300.000 es: " + desc2);
            System.out.println("El valor total de su factura es: "+(compraTotal-desc2));
        }else if (compraTotal>=301000 && compraTotal<=500000){
            double desc3= compraTotal*0.2;
            System.out.println("Su descuento por compras superiores a 301.000 e inferiores a 500.000 es: " + desc3);
            System.out.println("El valor total de su factura es: "+(compraTotal-desc3));
        }else if (compraTotal>501000) {
            double desc4 = compraTotal * 0.3;
            System.out.println("Su descuento por compras superiores a 501.000 es: " + desc4);
            System.out.println("El valor total de su factura es: " + (compraTotal - desc4));
        }


        System.out.println("Final de la compra");

    }

}

