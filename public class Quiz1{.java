public class Quiz1 {
    public static void main(String[] args) {
        final double [] discount= (o.15 , 0.10)//los porcentaje de los descuentos 
        final double [] productprices= (100,200) //precios de los productos 
        
        double productPrice1 = 100;
        double productPrice2 = 200;
        double tax1 = productPrice1 * 0.15;
        double tax2 = productPrice2 * 0.10;
        double totalTax = tax1 + tax2;

        if (totalTax > 50) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}