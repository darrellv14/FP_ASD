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

        System.out.println();
        // tabel.print(tabel.getTabel());
        // System.out.println();

        String con = "";
        while (!con.equals("False")) {

            System.out.print(">> ");
            String input = sc2.next();

            switch (input) {
                case "help":
                    System.out.println("'view' -> Melakukan print tabel yang ada");
                    System.out.println("'sort' -> Melakukan sorting dengan beberapa pilihan");
                    System.out.println("'end' -> menghentikan program");
                    break;

                case "view":
                    tabel.print(tabel.getTabel());
                    break;

                case "sort":
                    System.out.println("[0] Sort Nama Mitra A-Z");
                    System.out.println("[1] Sort Nama Mitra Z-A");
                    System.out.println("[2] Sort Nama Barang A-Z");
                    System.out.println("[3] Sort Nama Barang Z-A");
                    System.out.println("[4] Sort Jumlah Ascending");
                    System.out.println("[5] Sort Jumlah Descending");
                    System.out.println("[6] Sort Harga Satuan Ascending");
                    System.out.println("[7] Sort Harga Satuan Descending");
                    System.out.println("[8] Sort Total Harga Ascending");
                    System.out.println("[9] Sort Total Harga Descending");
                    System.out.print(">> ");
                    int sort = sc2.nextInt();
                    tabel.sort(tabel.getTabel(), sort);
                    break;
                
                case "end":
                    con = "False";
                    break;

                case "add":

                    break;

                default :
                    System.out.println("'" + input + "' bukan sebuah command");
                    System.out.println("ketik 'help' untuk melihat daftar command");
                    break;
            }


            // System.out.println("[0] Sort Nama Mitra A-Z");
            // System.out.println("[1] Sort Nama Mitra Z-A");
            // System.out.println("[2] Sort Nama Barang A-Z");
            // System.out.println("[3] Sort Nama Barang Z-A");
            // System.out.println("[4] Sort Jumlah Ascending");
            // System.out.println("[5] Sort Jumlah Descending");
            // System.out.println("[6] Sort Harga Satuan Ascending");
            // System.out.println("[7] Sort Harga Satuan Descending");
            // System.out.println("[8] Sort Total Harga Ascending");
            // System.out.println("[9] Sort Total Harga Descending");
            // System.out.println("[10] Search berdasarkan Nama Barang\n");

            // System.out.print("\033[1;92mPilih pengolahan yang ingin dipilih : \033[0m");
            // int input;

            // try {
            // input = sc2.nextInt();
            // } catch (Exception e) {
            // System.out.println("\033[1;91mMasukkan nomor pengolahan antara 0 -
            // 10\033[0m\n");
            // sc2.nextLine();
            // continue;
            // }
            // System.out.println();

            // if (input == 10) {
            // System.out.print("\033[1;92mMasukkan nama barang yang ingin dicari :
            // \033[0m");
            // String namaBarang = sc2.next();
            // tabel.search(tabel.getTabel(), namaBarang);
            // } else if (input > 10 || input < 0) {
            // System.out.println("\033[1;91mMasukkan nomor pengolahan antara 0 -
            // 10\033[0m\n");
            // continue;
            // } else {
            // tabel.sort(tabel.getTabel(), input);
            // }

            // con = "";
            // while (true) {
            // System.out.print("\n\033[1;92mApakah ingin melakukan pengolahan ulang (y or
            // n)? \033[0m");
            // con = sc2.next().toLowerCase();
            // System.out.println();
            // if (con.equals("y") || con.equals("n")) {
            // break;
            // } else {
            // System.out.println("\n\033[1;91mMasukkan 'y' untuk ya atau 'n' untuk
            // tidak\033[0m\n");
            // }
            // }

            // if (con.equals("n")) {
            // sc2.close();
            // break;
            // }

        }
    }
}
