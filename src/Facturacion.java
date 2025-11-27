import java.util.Scanner;

public class Facturacion {
    public static void facturacion() {
    Scanner scanner = new Scanner(System.in);
        final double TAX = 0.21;

        System.out.printf("Ingresa nombre de producto => ");
        String productName = scanner.nextLine();
        System.out.printf("Ingresa precio => ");
        double productPrice = scanner.nextDouble();
        System.out.printf("Ingresa cantidad => ");
        int productQuantity = scanner.nextInt();
        System.out.printf("Ingresa tu dinero disponible => ");
        double availableCash = scanner.nextDouble();

        double subTotal = productPrice * productQuantity;
        double totalPay = (subTotal * TAX) + subTotal;
        int roundedTotal = (int) totalPay;

        boolean canBuy = availableCash >= totalPay;

        if (canBuy) {
            System.out.println("\nCompra aprobada!!\n");
            System.out.println(
                    "------------------\n" +
                    "*** TECH STORE ***\n" +
                    "------------------\n" +
                    "PRODUCTO => " + productName +
                    "\nPRECIO   => $" + productPrice +
                    "\nCANTIDAD => " + productQuantity +
                    "\nSUBTOTAL => $" + subTotal +
                    "\nTOTAL    => $" + roundedTotal +
                    "\n------------------" +
                    "\nIMPUESTO\n" + TAX +"% => " + (subTotal * TAX)
            );

        } else {
            System.out.println("\nCompra rechazada, fondos insuficientes.");
        }

    }
}
