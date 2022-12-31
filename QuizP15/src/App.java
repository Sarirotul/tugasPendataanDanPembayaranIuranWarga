import java.util.Scanner;;

class ParentData {
    public String nama;
    public String NIK;
    public String alamat;
    public String no_telp;
    public String pekerjaan;
    public String alamat_pekerjaan;
    public String status;
    public String nama_pasangan;
    public int jumlah_anak;
    public int menu_iuran;

    Scanner sc = new Scanner(System.in);

    public void inputData (String nama_i, String NIK_i, String alamat_i, String no_telp_i) {
        System.out.println("*** Data Warga ***");
        System.out.print("Masukkan Nama: ");
        nama_i = sc.nextLine();
        nama = nama_i;
        System.out.print("Masukkan NIK: ");
        NIK_i = sc.nextLine();
        NIK = NIK_i;
        System.out.print("Masukkan Alamat: ");
        alamat_i = sc.nextLine();
        alamat = alamat_i;
        System.out.print("Masukkan No. Telp: ");
        no_telp_i = sc.nextLine();
        no_telp = no_telp_i;
    }

    public void inputData (String pekerjaan_i, String alamat_perkerjaan_i) {
        System.out.println("*** Data Pekerjaan ***");
        System.out.print("Masukkan Pekerjaan: ");
        pekerjaan_i = sc.nextLine();
        pekerjaan = pekerjaan_i;
        System.out.print("Masukkan Alamat Pekerjaan: ");
        alamat_perkerjaan_i = sc.nextLine();
        alamat_pekerjaan = alamat_perkerjaan_i;
    }

    public void inputData (String status_i, String nama_pasangan_i, int jumlah_anak_i) {
        System.out.println("*** Data Status ***");
        System.out.print("Masukkan Status: ");
        status_i = sc.nextLine();
        status = status_i;
        System.out.print("Masukkan Nama Suami/ Istri: ");
        nama_pasangan_i = sc.nextLine();
        nama_pasangan = nama_pasangan_i;
        System.out.print("Masukkan Jumlah Anak: ");
        jumlah_anak_i = sc.nextInt();
        jumlah_anak = jumlah_anak_i;
    }
}

class dataIuran extends ParentData {
    double iuran_sampah;
    double iuran_keamanan;
    double iuran_sekunder;
    ParentData p = new ParentData();

    Scanner sc = new Scanner(System.in);

    public void dataIuran () {
        System.out.println();
        System.out.println("-------------------o0o--------------------");
        System.out.println("*** Data Iuran Pokok ***");
        System.out.println("NIK : " + super.NIK);
        System.out.print("Masukkan Iuran Sampah: ");
        iuran_sampah = sc.nextDouble();
        System.out.print("Masukkan Iuran Keamanan: ");
        iuran_keamanan = sc.nextDouble();
        System.out.println();
        System.out.println("*** Data Iuran Sekunder ***");
        System.out.print("Masukkan Sumbangan: ");
        iuran_sekunder = sc.nextDouble();
    }

    public double totalIuran (double iuranSampah, double iuranKeamanan, double iuranSekunder) {
        return iuranSampah + iuranSekunder + iuranSekunder;
    }

    public void pilihIuran () {
        System.out.println();
        System.out.println("Lanjut Bayar Iuran ?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan Jawaban: ");
        menu_iuran = sc.nextInt();
    }
}

class Menu {
    int menu;
    Scanner sc = new Scanner(System.in);
    public void pilihMenu () {
        System.out.println("=====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("=====================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println();
        System.out.print("PILIHAN MENU: ");
        menu = sc.nextInt();
        System.out.println();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Menu m = new Menu();
        dataIuran d = new dataIuran();

        m.pilihMenu();
        
        if (m.menu == 1) {
            d.inputData(null, null, null, null);
            System.out.println();
            d.inputData(null, null);
            System.out.println();
            d.inputData(null, null, 0);
            d.pilihIuran();
            if (d.menu_iuran == 1) {
                d.dataIuran();
                d.pilihIuran();
                if (d.menu_iuran == 1) {
                    d.dataIuran();
                    d.pilihIuran();
                } else {
                    System.out.println();
                    System.out.println("|| NIK                            || " + d.NIK);
                    System.out.println("|| Total Pembayaran Iuran Warga   || " + d.totalIuran(d.iuran_sampah, d.iuran_keamanan, d.iuran_sekunder));
                    System.out.println("Terima kasih " + d.nama + " Iuran Anda sudah dibayarkan");
                    System.out.println();
                }
            } else {
                System.out.println();
                System.out.println("|| NIK                            || " + d.NIK);
                System.out.println("|| Total Pembayaran Iuran Warga   || " + d.totalIuran(d.iuran_sampah, d.iuran_keamanan, d.iuran_sekunder));
                System.out.println("Terima kasih " + d.nama + " Iuran Anda sudah dibayarkan");
                System.out.println();
            }
        } 
        else if (m.menu == 2) {
            d.dataIuran();
            d.pilihIuran();
            if (d.menu_iuran == 1) {
                d.dataIuran();
            } else {
                System.out.println();
                System.out.println("|| NIK                            || " + d.NIK);
                System.out.println("|| Total Pembayaran Iuran Warga   || " + d.totalIuran(d.iuran_sampah, d.iuran_keamanan, d.iuran_sekunder));
                System.out.println("Terima kasih " + d.nama + " Iuran Anda sudah dibayarkan");
                System.out.println();
            }
        } else {}
    }
}
