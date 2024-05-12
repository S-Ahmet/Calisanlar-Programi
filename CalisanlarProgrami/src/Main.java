import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ");
        String islemler = "işlemler \n"
                +"1. Yazılımcı İşlemleri\n"
                +"2. Yonetici İşlemleri\n"
                + "Çıkış için q'ya bas";
        System.out.println(islemler);
        System.out.println("*********************************");
        while (true) {
            System.out.println("İslem Seçiniz:");
            String islem = scan.nextLine();
            if(islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor.....");
                break;
            }
            else if ((islem.equals("1"))) {
                System.out.println("Yazılımcı İşlemleri Seçildi.");
                yazilimci yazilimci = new yazilimci("Sadık Ahmet","Karabulut", 520, "java,c" );
                String yazılımcı_islemler = "1. Format At\n"
                        +"2. Bilgileri Göster\n"
                        +"Çıkış İçin q'ya bas";
                System.out.println(yazılımcı_islemler);
                while (true) {
                    System.out.println("İşlem Seçiniz:");
                    String yazilimci_islem = scan.nextLine();
                    if (yazilimci_islem.equals("1")) {
                        String isletim_sistemi = scan.nextLine();
                        yazilimci.format_at(isletim_sistemi);
                    }
                    else if (yazilimci_islem.equals("2")) {
                        System.out.println("Bilgiler Gösteriliyor....");
                        yazilimci.bilgileri_goster();
                    }
                    else if(yazilimci_islem.equals("q")) {
                        System.out.println("Yazılımcı İşleminden Çıkılıyor.....");
                        break;
                    }
                    else {
                        System.out.println("Geçersiz İşlem Seçtiniz");
                    }

                }
            }
            else if(islem.equals("2")) {
                System.out.println("Yönetici İşlemleri Seçildi.");
                yonetici yonetici = new yonetici("Ali","Veli",666,10);
                String yonetici_islemler = "1. Zam Yap \n"
                                          +"2. Bilgileri Goster \n"
                                          +"Çıkış İçin q'ya Bas \n";
                System.out.println(yonetici_islemler);
                while (true) {
                    System.out.println("İşlem Seçiniz:");
                    String yonetici_islem = scan.nextLine();
                    if (yonetici_islem.equals("1")) {
                        System.out.println("Ne Kadar Zam Yapmak İstiyorsunuz : ");
                        int zam_miktarı = scan.nextInt();
                        scan.nextLine();
                        yonetici.zam_yap(zam_miktarı);
                    }
                    else if(yonetici_islem.equals("2")) {
                        yonetici.bilgileri_goster();
                    }
                    else if(yonetici_islem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkış Yapılıyor.....");
                        break;
                    }
                    else {
                        System.out.println("Geçersiz İşlem Seçtiniz");
                    }
                }
            }
            else {
                System.out.println("Geçersiz İşlem Seçtiniz");
            }
        }
    }
}