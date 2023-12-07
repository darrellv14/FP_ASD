    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Main.class.getResourceAsStream("input.txt"));
        Scanner sc2 = new Scanner(System.in);
        HasilPenjualan tabel = new HasilPenjualan();
        
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineSplit = line.split(",");
            tabel.add(lineSplit[0],lineSplit[1],Integer.parseInt(lineSplit[2]),Double.parseDouble(lineSplit[3]),Double.parseDouble(lineSplit[4]));
        }
        sc.close();
        int j =1;
        // String header = "No.\t|\tNama\t|\tNama Barang\t|\tJumlah\t|\tHarga Satuan\t|\tTotal Harga";
        // System.out.println(header);

        // for(Data k : tabel.getTabel()) {
        //     System.out.print(j + "\t");
        //     System.out.println(k);
        //     j++;
        // }
        tabel.print(tabel.getTabel());
        
        String con = "y";
        while(con.equals("y")) {
            System.out.println("1 = Sort berdasarkan Nama A-Z");
            System.out.println("2 = Sort berdasarkan Nama Z-A");
            System.out.println("3 = Sort berdasarkan Jumlah secara Ascending");
            System.out.println("4 = Sort berdasarkan Jumlah secara Descending");
            System.out.println("5 = Sort berdasarkan Harga Satuan secara Ascending");
            System.out.println("6 = Sort berdasarkan Harga Satuan secara Descending");
            System.out.println("7 = Sort berdasarkan Total Harga secara Ascending");
            System.out.println("8 = Sort berdasarkan Total Harga secara Descending");
            System.out.println("9 = Search berdasarkan Nama Barang");
            System.out.print("Pilih sort yang ingin dipilih : ");
            int input = sc2.nextInt();
            if(input == 9) {
                System.out.print("Masukkan nama barang yang ingin dicari : ");
                String namaBarang = sc2.next();
                tabel.search(tabel.getTabel(), namaBarang);
            }else {
                tabel.sort(tabel.getTabel(), input);
            }
            System.out.print("Apakah ingin melakukan pengolahan ulang (y or n)? ");
            con = sc2.next();
        }
        sc2.close();
    }
}
