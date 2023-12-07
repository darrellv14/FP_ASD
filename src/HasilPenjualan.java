
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HasilPenjualan {
    private ArrayList<Data> tabel = new ArrayList<Data>();

    public HasilPenjualan() {

    }

    public ArrayList<Data> getTabel() {
        return tabel;
    }

    public void add(String nama, String namaBarang, int jumlah, double hargaSatuan, double totalHarga) {
        Data data = new Data(nama, namaBarang, jumlah, hargaSatuan, totalHarga);
        tabel.add(data);
    }

    public void remove(int n) {
        tabel.remove(n);
    }

    public void sort(ArrayList<Data> tabel, int n) {
        // 1 = sort berdasarkan Nama
        // 3 = sort berdasarkan Jumlah secara Ascending
        // 4 = sort berdasarkan Jumlah secara Descending
        // 5 = sort berdasarkan Harga Satuan secara Ascending
        // 6 = sort berdasarkan Harga Satuan secara Descending
        // 7 = sort berdasarkan Total Harga secara Ascending
        // 8 = sort berdasarkan Total Harga secara Descending
        int length = tabel.size();
        if (n == 3) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getJumlah() > key.getJumlah()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }

        } else if (n == 4) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;

                while (j >= 0 && tabel.get(j).getJumlah() < key.getJumlah()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 5) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getHargaSatuan() > key.getHargaSatuan()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 6) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getHargaSatuan() < key.getHargaSatuan()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 7) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getTotalHarga() > key.getTotalHarga()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 8) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getTotalHarga() < key.getTotalHarga()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        }

        print(tabel);
    }

    public void print(ArrayList<Data> tabel) {
        String header = "No.\t|\tNama\t|\tNama Barang\t|\tJumlah\t|\tHarga Satuan\t|\tTotal Harga";
        System.out.println(header);
        int i = 1;
        for (Data k : tabel) {
            System.out.print(i + "\t|\t");
            System.out.println(k);
            i++;
        }
    }

    public ArrayList<Data> sortJumlahA(ArrayList<Data> tabel) {
        return tabel;
    }

    public ArrayList<Data> sortJumlahD(ArrayList<Data> tabel) {
        return tabel;
    }

    public ArrayList<Data> sortTotalHargaA(ArrayList<Data> tabel) {
        return tabel;
    }

    public ArrayList<Data> sortTotalHargaD(ArrayList<Data> tabel) {
        return tabel;
    }

    public void sortNamaA(ArrayList<Data> tabel) {
        int panjang = tabel.size();
        for (int i = 1; i < panjang; ++i) {
            Data key = tabel.get(i);
            int j = i - 1;

            while (j >= 0 && tabel.get(j).getNamaBarang().compareTo(key.getNamaBarang()) > 0) {
                tabel.set(j + 1, tabel.get(j));
                j = j - 1;
            }

            tabel.set(j + 1, key);
        }
    }

    public void sortNamaD(ArrayList<Data> tabel) {
        int panjang = tabel.size();
        for (int i = 1; i < panjang; ++i) {
            Data key = tabel.get(i);
            int j = i - 1;

            while (j >= 0 && tabel.get(j).getNamaBarang().compareTo(key.getNamaBarang()) < 0) {
                tabel.set(j + 1, tabel.get(j));
                j = j - 1;
            }

            tabel.set(j + 1, key);
        }
    }

}
