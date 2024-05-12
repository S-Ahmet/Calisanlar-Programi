public class yazilimci extends Calisan{
    private String diller;
    public yazilimci(String ad, String soyad, int id , String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void format_at(String isletin_sistemi) {
        System.out.println(getAd() + " " + isletin_sistemi + "'ni yukluyor...");

    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yazılımcının Bildiği Diller " + diller);
    }
}
