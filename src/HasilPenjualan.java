
import java.util.ArrayList;

public class HasilPenjualan {
    private ArrayList<Data> tabel = new ArrayList<Data>();

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
        int length = tabel.size();
        switch (n) {
            case 0:
                System.out.println("\033[0;33mSorting Nama Pelanggan Ascending\n");
                for (int i = 1; i < length; i++) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getNama().compareTo(key.getNama()) > 0) {
                        tabel.set(j + 1, tabel.get(j));
                        j--;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 1:
                System.out.println("\033[0;33mSorting Nama Pelanggan Descending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getNama().compareTo(key.getNama()) < 0) {
                        tabel.set(j + 1, tabel.get(j));
                        j--;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 2:
                System.out.println("\033[0;33mSorting Nama Barang Ascending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getNamaBarang().compareTo(key.getNamaBarang()) > 0) {
                        tabel.set(j + 1, tabel.get(j));
                        j--;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 3:
                System.out.println("\033[0;33mSorting Nama Barang Descending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getNamaBarang().compareTo(key.getNamaBarang()) < 0) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 4:
                System.out.println("\033[0;33mSorting Jumlah Ascending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getJumlah() > key.getJumlah()) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 5:
                System.out.println("\033[0;33mSorting Nama Jumlah Descending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getJumlah() < key.getJumlah()) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 6:
                System.out.println("\033[0;33mSorting Harga Satuan Ascending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getHargaSatuan() > key.getHargaSatuan()) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 7:
                System.out.println("\033[0;33mSorting Harga Satuan Descending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getHargaSatuan() < key.getHargaSatuan()) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 8:
                System.out.println("\033[0;33mSorting Total Harga Ascending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getTotalHarga() > key.getTotalHarga()) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;
            case 9:
                System.out.println("\033[0;33mSorting Total Harga Descending\n");
                for (int i = 1; i < length; ++i) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getTotalHarga() < key.getTotalHarga()) {
                        tabel.set(j + 1, tabel.get(j));
                        j = j - 1;
                    }

                    tabel.set(j + 1, key);
                }
                break;

            case 11:
                for (int i = 1; i < length; i++) {
                    Data key = tabel.get(i);
                    int j = i - 1;

                    while (j >= 0 && tabel.get(j).getNama().compareTo(key.getNama()) > 0) {
                        tabel.set(j + 1, tabel.get(j));
                        j--;
                    }

                    tabel.set(j + 1, key);
                }
                break;
        }
        print(tabel);
    }

    public void search(ArrayList<Data> tabel, String text) {
        ArrayList<Data> hasil = new ArrayList<Data>();

        for (Data k : tabel) {
            String source = k.getNamaBarang().toLowerCase();
            String input = text.toLowerCase();

            if (source.contains(input)) {
                hasil.add(k);
            }
        }

        System.out.println("\n\033[0;33mSearch : " + text + "\033[0m\n");
        sort(hasil, 11);
    }

    public void print(ArrayList<Data> tabel) {
        // Warna Text
        String BLACK = "\033[0;30m"; // BLACK
        String WHITE = "\033[0;37m"; // WHITE
        String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
        String RESET = "\033[0m"; // Text Reset

        int i = 1;
        System.out.format(WHITE_BOLD_BRIGHT + "%-10s%s%-22s%s%-25s%s%-10s%s%-15s%s%-15s%n", "    No.", "|", "    Nama Mitra",
                "|", "    Nama Barang", "|", "  Jumlah", "|", "  Harga Satuan", "|", "  Total Harga" + RESET);

        for (int j = 0; j < 94; j++) {
            System.out.print("-");
        }

        System.out.println();
        for (Data k : tabel) {
            if (i % 2 == 0) {
                System.out.printf(WHITE + "%-10s%s%-22s%s%-25s%s%-10s%s%-15s%s%-15s",
                        ("    " + i), "|", "    " + k.getNama(), "|", "    " + k.getNamaBarang(), "|",
                        "    " + k.getJumlah(), "|", formatCurrency(k.getHargaSatuan()), "|", formatCurrency(k.getTotalHarga()) + RESET);
                System.out.println();
            } else {
                System.out.printf(BLACK + "%-10s%s%-22s%s%-25s%s%-10s%s%-15s%s%-15s",
                        ("    " + i), "|", "    " + k.getNama(), "|", "    " + k.getNamaBarang(), "|",
                        "    " + k.getJumlah(), "|", formatCurrency(k.getHargaSatuan()), "|", formatCurrency(k.getTotalHarga()) + RESET);
                System.out.println();
            }
            i++;
        }
    }
    
    private String formatCurrency(double amount) {
        return String.format("   Rp.%,.2f", amount);
    }
}
