public class Data {
    private String nama;
    private String namaBarang;
    private int jumlah;
    private double hargaSatuan;
    private double totalHarga;

    public Data( String nama, String namaBarang, int jumlah, double hargaSatuan, double totalHarga) {
        this.nama = nama;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.totalHarga = totalHarga;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }



    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }


    public String toString() {
        return getNama() + "\t \t" + getNamaBarang() + "\t \t" + getJumlah() + "\t \t" + getHargaSatuan() + "\t \t" + getTotalHarga();
    }
}
