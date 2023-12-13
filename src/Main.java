import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Main.class.getResourceAsStream("input.txt"));
        Scanner sc2 = new Scanner(System.in);
        HasilPenjualan tabel = new HasilPenjualan();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineSplit = line.split(",");
            tabel.add(lineSplit[0], lineSplit[1], Integer.parseInt(lineSplit[2]), Double.parseDouble(lineSplit[3]),
                    Double.parseDouble(lineSplit[4]));
        }
        sc.close();
        int j = 1;

        tabel.print(tabel.getTabel());
        System.out.println();
        
        String con = "";
        while (true) {
            System.out.println("[0] Sort Nama A-Z");
            System.out.println("[1] Sort Nama Z-A");
            System.out.println("[2] Sort Nama Barang A-Z");
            System.out.println("[3] Sort Nama Barang Z-A");
            System.out.println("[4] Sort Jumlah Ascending");
            System.out.println("[5] Sort Jumlah Descending");
            System.out.println("[6] Sort Harga Satuan Ascending");
            System.out.println("[7] Sort Harga Satuan Descending");
            System.out.println("[8] Sort Total Harga Ascending");
            System.out.println("[9] Sort Total Harga Descending");
            System.out.println("[10] Search berdasarkan Nama Barang\n");

            System.out.print("\033[1;92mPilih pengolahan ingin dipilih : \033[0m");
            int input;
            try {
                input = sc2.nextInt();
            } catch (Exception e) {
                System.out.println("\033[1;91mMasukkan nomor pengolahan antara 0 - 10\033[0m\n");
                sc2.nextLine();
                continue;
            }
            System.out.println();

            if (input == 10) {
                System.out.print("Masukkan nama barang yang ingin dicari : ");
                String namaBarang = sc2.next();
                tabel.search(tabel.getTabel(), namaBarang);
            } else if (input > 10 || input < 0) {
                System.out.println("\033[1;91mMasukkan nomor pengolahan antara 0 - 10\033[0m\n");
                continue;
            } else {
                tabel.sort(tabel.getTabel(), input);
            }

            con = "";
            while (true) {
                System.out.print("Apakah ingin melakukan pengolahan ulang (y or n)? ");
                con = sc2.next().toLowerCase();
                System.out.println();
                if (con.equals("y") || con.equals("n")) {
                    break;
                } else {
                    System.out.println("\033[1;91mMasukkan 'y' untuk ya atau 'n' untuk tidak\033[0m\n");
                }
            }

            if (con.equals("n")) {
                sc2.close();
                break;
            } 

        }
    }
}
