import java.util.Scanner;

public class kullanıcıgirisi {
    public static void main(String[] args) {
        String kullanici_ad, sifre;
        String kullanici_ekle, sifre_ekle;
        char sifirlama = 'H';

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Adi Olusturunuz :");
        kullanici_ekle = input.nextLine();
        System.out.println("Sifre Olusturunuz :");
        sifre_ekle = input.nextLine();

        while (true)
        {
            System.out.println("Kullanıcı Adınızı Giriniz :");
            kullanici_ad = input.nextLine();
            System.out.println("Sifrenizi Giriniz :");
            sifre = input.nextLine();
            if (kullanici_ekle.equals(kullanici_ad))
            {
                if (!sifre_ekle.equals(sifre))
                {
                    System.out.println("Sifreniz yanlis sifirlamak ister misin ? (E/H):");
                    sifirlama= input.nextLine().toUpperCase().charAt(0);
                    if (sifirlama == 'E' || sifirlama == 'e')
                    {
                        System.out.println("Yeni sifreyi giriniz");
                        sifre= input.nextLine();
                        if (sifre.equals(sifre_ekle))
                        {
                            System.out.println("Sifreniz degistirilmedi!!! Eski sifre ile ayni tekrar giris yapiniz.");
                            continue;
                        }
                        else {
                            sifre_ekle = sifre;
                            System.out.println("Sifreniz degistirildi...");
                        }
                    }
                    else {
                        System.out.println("Sifreniz sifirlanmadi tekrar giris yapiniz.");
                        continue;
                    }
                }
                else
                    System.out.println("Tebrikler Giris Yapılıyor ... ");
                return;
            }
            else
                System.out.println("\n!!! Kullanici Adi hatali ... ");
            continue;
        }
    }
}
