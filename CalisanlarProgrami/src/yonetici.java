public class yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    public yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad,soyad,id) ;
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yoneticinin Sorumlu Olduğu Kisi Sayisi" + sorumlu_kisi_sayisi);
    }
    public void zam_yap(int miktar) {
        System.out.println(getAd() + "Çalışanlara " + miktar + " kadar zam yapılıyor..");

    }
}
