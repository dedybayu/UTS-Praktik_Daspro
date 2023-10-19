import java.util.Scanner;
public class UtsNimGanjil {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int jumlahMinuman=0, hargaMakanan, jumlahMakanan=0, hargaMinuman;
        float totHargaMinuman=0, totalHarga=0, totHargaMakanan=0;
        String jenisBarang, namaBarang, plastic;
        
        while (true) {
            
            System.out.print("Jenis Barang (Makanan/Minuman)/Selesai : ");
            jenisBarang  = input07.nextLine();

            if (jenisBarang.equalsIgnoreCase("makanan")){
                System.out.print("Masukan Nama Makanan : ");
                namaBarang = input07.nextLine();
                System.out.print("Masukan Harga        : ");
                hargaMakanan = input07.nextInt();
                totHargaMakanan += hargaMakanan;

                jumlahMakanan++;


            } else if (jenisBarang.equalsIgnoreCase("minuman")){
                System.out.print("Masukan Nama Minuman : ");
                namaBarang = input07.nextLine();
                System.out.print("Masukan Harga        : ");
                hargaMinuman = input07.nextInt();
                totHargaMinuman += hargaMinuman;

                jumlahMinuman++;
                

            } else if (jenisBarang.equalsIgnoreCase("selesai")){
                break;
            }   
            input07.nextLine();
        }

        System.out.print("Apakah Mau beli Plastic? y/n : ");
        plastic = input07.nextLine();
        if (plastic.equalsIgnoreCase("y")){
            totalHarga = totalHarga+200;
        }

        System.out.println("Jumlah Makanan           : "+jumlahMakanan);
        System.out.println("Jumlah Minuman           : "+jumlahMinuman);
        System.out.println("Total Harga Makanan      : "+totHargaMakanan);
        System.out.println("Total Harga Minuman      : "+totHargaMinuman);

        if (jumlahMinuman == 3){
            totHargaMinuman = (totHargaMinuman - (0.05F * totHargaMinuman));
            System.out.println("Diskon Minuman           : "+ 0.05F * totHargaMinuman);
        }

        totalHarga = totHargaMakanan + totHargaMinuman;

        System.out.println("Total Harga              : "+totalHarga);

        if (totalHarga >= 1000000){
            totalHarga = totalHarga + (0.07F * totalHarga);
            System.out.println("PPN                      : "+ 0.07F * totalHarga);
        } else {
            System.out.println("PPN                      : 0");
        }

        System.out.println("Total Harga perlu Dibayar: "+totalHarga);

    }
}
