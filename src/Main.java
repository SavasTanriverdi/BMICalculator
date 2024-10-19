import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sınıfını başlatma
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kilo (kg) ve boy (m) bilgilerini alma
        System.out.print("Lütfen kilonuzu (kg cinsinden) girin: ");
        double weight = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) girin: ");
        double height = scanner.nextDouble();

        // BMI hesaplama formülü
        double bmi = weight / (height * height);

        // BMI sonucunu gösterme
        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f\n", bmi);

        // Kullanıcının BMI'ine göre kategori belirleme
        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Durum: Normal Kilolu");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Durum: Fazla Kilolu");
        } else {
            System.out.println("Durum: Obez");
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}