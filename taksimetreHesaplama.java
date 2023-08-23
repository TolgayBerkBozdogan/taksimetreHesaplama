import java.util.Scanner;
public class taksimetreHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,perkm= 10,distance,price;
        System.out.print("Gidilecek KM'yi Giriniz: ");
        km = input.nextDouble();
        int startprice = 12;
        distance = startprice+(km*perkm);
        price = distance<30? 30:distance;
        System.out.print(price);

    }
}
