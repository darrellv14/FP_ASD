
import java.util.ArrayList;

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
        // 0 = sort berdasarkan Nama Pelanggan Ascending
        // 1 = sort berdasarkan Nama Pelanggan Ascending
        // 2 = sort berdasarkan Nama Ascending
        // 3 = sort berdasarkan Nama Descending
        // 4 = sort berdasarkan Jumlah secara Ascending
        // 5 = sort berdasarkan Jumlah secara Descending
        // 6 = sort berdasarkan Harga Satuan secara Ascending
        // 7 = sort berdasarkan Harga Satuan secara Descending
        // 8 = sort berdasarkan Total Harga secara Ascending
        // 9 = sort berdasarkan Total Harga secara Descending
        int length = tabel.size();
        if(n == 0) {
            for(int i = 1; i < length; i++) {
                Data key = tabel.get(i);
                int j = i - 1;

                while (j >= 0 && tabel.get(j).getNama().compareTo(key.getNama()) > 0) {
                    tabel.set(j + 1, tabel.get(j));
                    j--;
                }
                tabel.set(j + 1, key);
            }
        }else if(n == 1) {
            for(int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;

                while (j >= 0 && tabel.get(j).getNama().compareTo(key.getNama()) > 0) {
                    tabel.set(j + 1, tabel.get(j));
                    j--;
                }
                tabel.set(j + 1, key);
            }
        }else if(n == 2){
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;

                while (j >= 0 && tabel.get(j).getNamaBarang().compareTo(key.getNamaBarang()) > 0) {
                    tabel.set(j + 1, tabel.get(j));
                    j--;
                }

                tabel.set(j + 1, key);
            }
        }else if(n == 3){
                for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;

                while (j >= 0 && tabel.get(j).getNamaBarang().compareTo(key.getNamaBarang()) < 0) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }

                tabel.set(j + 1, key);
            }
        }else if (n == 4) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getJumlah() > key.getJumlah()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }

        } else if (n == 5) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;

                while (j >= 0 && tabel.get(j).getJumlah() < key.getJumlah()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 6) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getHargaSatuan() > key.getHargaSatuan()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 7) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getHargaSatuan() < key.getHargaSatuan()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 8) {
            for (int i = 1; i < length; ++i) {
                Data key = tabel.get(i);
                int j = i - 1;
                while (j >= 0 && tabel.get(j).getTotalHarga() > key.getTotalHarga()) {
                    tabel.set(j + 1, tabel.get(j));
                    j = j - 1;
                }
                tabel.set(j + 1, key);
            }
        } else if (n == 9) {
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

    public void search(ArrayList<Data> tabel, String text){
        ArrayList<Data> hasil = new ArrayList<Data>();
        for(Data k : tabel){
            if(k.getNamaBarang().contains(text)){
                hasil.add(k);
            }
        }
        sort(hasil, 1);
    }

    public void print(ArrayList<Data> tabel) {
        // ANSI escape code constants for text colors and background colors
        String BLACK = "\033[0;30m";   // BLACK
        String RED = "\033[0;31m";     // RED
        String GREEN = "\033[0;32m";   // GREEN
        String YELLOW = "\033[0;33m";  // YELLOW
        String BLUE = "\033[0;34m";    // BLUE
        String PURPLE = "\033[0;35m";  // PURPLE
        String CYAN = "\033[0;36m";    // CYAN
        String WHITE = "\033[0;37m";   // WHITE
        
        String BLACK_BRIGHT = "\033[0;90m";  // BLACK
        String RED_BRIGHT = "\033[0;91m";    // RED
        String GREEN_BRIGHT = "\033[0;92m";  // GREEN
        String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
        String BLUE_BRIGHT = "\033[0;94m";   // BLUE
        String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
        String CYAN_BRIGHT = "\033[0;96m";   // CYAN
        String WHITE_BRIGHT = "\033[0;97m";  // WHITE

        String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
        String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
        String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
        String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
        String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
        String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
        String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
        String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

        String BLACK_BACKGROUND = "\033[40m";  // BLACK
        String RED_BACKGROUND = "\033[41m";    // RED
        String GREEN_BACKGROUND = "\033[42m";  // GREEN
        String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
        String BLUE_BACKGROUND = "\033[44m";   // BLUE
        String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
        String CYAN_BACKGROUND = "\033[46m";   // CYAN
        String WHITE_BACKGROUND = "\033[47m";  // WHITE

        String RESET = "\033[0m";  // Text Reset

        int i = 1;
        System.out.format(WHITE_BOLD_BRIGHT +"%-10s%s%-15s%s%-25s%s%-10s%s%-15s%s%-15s%n","    No.","|","    Nama","|","    Nama Barang","|","  Jumlah","|","  Harga Satuan","|","  Total Harga"+RESET);
        for(int j = 0;j<94;j++) {
            System.out.print("-");
        }
        System.out.println();
        for (Data k : tabel) {
            if(i%2==0){
                System.out.printf(WHITE + "%-10s%s%-15s%s%-25s%s%-10s%s%-15s%s%-15s", ("    "+i),"|", "    "+k.getNama(),"|", "    "+k.getNamaBarang(),"|", "    "+k.getJumlah(),"|", ("   Rp."+k.getHargaSatuan()),"|", ("   Rp."+k.getTotalHarga())+RESET);
                System.out.println();
            }else{
                System.out.printf(BLACK + "%-10s%s%-15s%s%-25s%s%-10s%s%-15s%s%-15s", ("    "+i),"|", "    "+k.getNama(),"|", "    "+k.getNamaBarang(),"|", "    "+k.getJumlah(),"|", ("   Rp."+k.getHargaSatuan()),"|", ("   Rp."+k.getTotalHarga())+RESET);
                System.out.println();
            }
            i++;
        }
    }

}
