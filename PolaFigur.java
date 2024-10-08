import java.util.Scanner;
public class PolaFigur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wybor = menu(scan);
        switch (wybor) {
            case "1":
                System.out.print("Bok: ");
                double bok = scan.nextDouble();
                System.out.println("Wynik: " + zaokroglenie(Math.pow(bok, 2)));
                break;
            case "2":
                System.out.print("Bok1: ");
                double bok1 = scan.nextDouble();
                System.out.print("Bok2: ");
                double bok2 = scan.nextDouble();
                System.out.println("Wynik: " + zaokroglenie(bok1*bok2));
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
    static double zaokroglenie(double liczba) {
        return Math.floor(liczba * 100) / 100;
    }
    static String menu(Scanner scan){
        System.out.println("Menu");
        System.out.println("1.Kwadrat");
        System.out.println("2.Prostokat");
        System.out.println("3.Trojkat");
        System.out.println("4.Kolo");
        System.out.print("Wybor: ");
        return scan.nextLine();
    }
}