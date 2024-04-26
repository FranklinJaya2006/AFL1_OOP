import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    /// Mendefinisikan ArrayList untuk menyimpan daftar buku yang dipinjam
    ArrayList<Buku_Majalahataujurnal> bukuDipinjam = new ArrayList<>();

    // Mendefinisikan ArrayList untuk menyimpan daftar CD yang dipinjam
    ArrayList<CD> cdDipinjam = new ArrayList<>();

    
    public static void main(String[] args) {
        // Mendefinisikan ArrayList untuk menyimpan daftar buku, CD, dan buku yang sedang dipinjam
        ArrayList<Buku_Majalahataujurnal> bukuList = new ArrayList<>();
        ArrayList<CD> cdList = new ArrayList<>();
        ArrayList<Buku_Majalahataujurnal> bukuDipinjam = new ArrayList<>();
        ArrayList<CD> cdDipinjam = new ArrayList<>();
        
        

        // Menambahkan beberapa contoh buku ke dalam ArrayList bukuList
        bukuList.add(new Buku_Majalahataujurnal(123, "Judul Buku 1", "2021", 100, 10, 5, 85, 123456789, "Edisi 1", "Sampul Keras"));
        bukuList.add(new Buku_Majalahataujurnal(124, "Judul Buku 2", "2022", 120, 12, 3, 105, 987654321, "Edisi 2", "Sampul Lembut"));
        bukuList.add(new Buku_Majalahataujurnal(125, "Judul Buku 3", "2023", 90, 1, 8, 81, 123456788, "Edisi 3", "Sampul Keras"));
        bukuList.add(new Buku_Majalahataujurnal(126, "Judul Buku 4", "2024", 130, 17, 8, 105, 987654351, "Edisi 4", "Sampul Lembut"));


        // Menambahkan beberapa contoh CD ke dalam ArrayList cdList
        cdList.add(new CD(111, "Judul CD 1", "2020", 50, 5, 1, 44));
        cdList.add(new CD(112, "Judul CD 2", "2021", 60, 6, 0, 54));
        cdList.add(new CD(113, "Judul CD 3", "2022", 70, 8, 2, 60));
        cdList.add(new CD(114, "Judul CD 4", "2023", 80, 9, 3, 68));

        FileWriter keluar = null;
        

        try {
            keluar = new FileWriter("output_Perpus.txt");
            Boolean b = true;
            while (b) {
            
            // Membuat objek Scanner untuk input dari pengguna
            Scanner scan = new Scanner(System.in);

            // Meminta pengguna untuk memasukkan angka 1, 2, atau 3
            System.out.println("1. Masukkan angka 1 untuk login sebagai mahasiswa");
            System.out.println("2. Masukkan angka 2 untuk login sebagai dosen_staff");
            System.out.println("3. Masukkan angka 3 untuk login sebagai Pustakawan");
            System.out.println("4. Log out");
            System.out.println("Masukkan angka :");
            int input = scan.nextInt();

            // Memproses input sesuai dengan angka yang dimasukkan
            if (input == 1) {
                System.out.println("Anda Login Sebagai Mahasiswa");

                Boolean a = true;
                while (a) {
                    System.out.println("1. Baca buku/CD");
                    System.out.println("2. Kembalikan buku/cd");
                    System.out.println("3. Bayar Denda");
                    System.out.println("4. Pinjam Buku/cd");
                    System.out.println("5. Ingfo buku/cd yang tersedia");
                    System.out.println("6. Log Out");
                    System.out.println("Apa yang anda ingin lakukan");
                    int inpu = scan.nextInt();
                    switch (inpu) {
                        case 1:
                            System.out.println("Pilih 1. Lihat Buku yang tersedia atau 2. Lihat CD yang tersedia");
                            int o = scan.nextInt();
                            if (o == 1) {
                                System.out.println("Buku yang tersedia:");
                                for (int i = 0; i < bukuList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bukuList.get(i).getJudul());
                                }
                                System.out.println("Silahkan Pilih Buku yang ingin anda baca (masukkan nomor urutnya):");
                                int bukuIndex = scan.nextInt();
                                Buku_Majalahataujurnal bukuPilihan = bukuList.get(bukuIndex - 1);
                                System.out.println("Anda memilih untuk membaca buku: " + bukuPilihan.getJudul());
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                              Baca Buku                                          |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                
                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndex, bukuPilihan.getJudul(), "Mahasiswa                                               "));
                                
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                // Lanjutkan dengan tindakan berikutnya
                            } else if (o == 2) {
                                System.out.println("CD yang tersedia:");
                                for (int i = 0; i < cdList.size(); i++) {
                                    System.out.println((i + 1) + ". " + cdList.get(i).getJudul());
                                }
                                System.out.println("Silahkan Pilih CD yang ingin anda dengarkan (masukkan nomor urutnya):");
                                int cdIndex = scan.nextInt();
                                CD cdPilihan = cdList.get(cdIndex - 1);
                                System.out.println("Anda memilih untuk mendengarkan CD: " + cdPilihan.getJudul());
                                // Lanjutkan dengan tindakan berikutnya
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                             Gunakan CD                                          |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| No. | CD Pilihan                     | Pembaca                                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                
                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndex, cdPilihan.getJudul(), "Mahasiswa                                               "));
                                
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                // Lanjutkan dengan tindakan berikutnya
                            } else {
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("Tekan 1 untuk mengembalikan buku, tekan 2 untuk mengembalikan CD:");
                            int returnChoice = scan.nextInt();
                            
                            if (returnChoice == 1) {
                                // Proses pengembalian buku
                                if (!bukuDipinjam.isEmpty()) {
                                    System.out.println("Buku yang sedang dipinjam:");
                                    for (int i = 0; i < bukuDipinjam.size(); i++) {
                                        System.out.println((i + 1) + ". " + bukuDipinjam.get(i).getJudul());
                                    }
                        
                                    System.out.println("Silahkan Pilih Buku yang ingin Anda kembalikan (masukkan nomor urutnya):");
                                    int bukuIndexToReturn = scan.nextInt();
                        
                                    if (bukuIndexToReturn > 0 && bukuIndexToReturn <= bukuDipinjam.size()) {
                                        Buku_Majalahataujurnal bukuKembali = bukuDipinjam.remove(bukuIndexToReturn - 1);
                                        System.out.println("Anda mengembalikan buku: " + bukuKembali.getJudul());
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        keluar.write("|                                            Kembaikan Buku                                       |\n");
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        
                                        keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToReturn, bukuKembali.getJudul(), "Mahasiswa                                               "));
                                        
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        bukuList.add(bukuKembali);
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                } else if (returnChoice == 2) {
                                    // Proses pengembalian CD
                                    if (!cdDipinjam.isEmpty()) {
                                        System.out.println("CD yang sedang dipinjam:");
                                        for (int i = 0; i < cdDipinjam.size(); i++) {
                                            System.out.println((i + 1) + ". " + cdDipinjam.get(i).getJudul());
                                        }
                            
                                        System.out.println("Silahkan Pilih CD yang ingin Anda kembalikan (masukkan nomor urutnya):");
                                        int cdIndexToReturn = scan.nextInt();
                            
                                        if (cdIndexToReturn > 0 && cdIndexToReturn <= cdDipinjam.size()) {
                                            CD cdKembali = cdDipinjam.remove(cdIndexToReturn - 1);
                                            System.out.println("Anda mengembalikan CD: " + cdKembali.getJudul());
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("|                                             Kembaikan CD                                        |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("| No. | Judul CD                        | Pembaca                                                  |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            
                                            keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToReturn, cdKembali.getJudul(), "Mahasiswa                                               "));
                                            
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            cdList.add(cdKembali);
                                        } else {
                                            System.out.println("Pilihan tidak valid.");
                                        }
                                    } else {
                                        System.out.println("Tidak ada CD yang dipinjam.");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid. Silakan masukkan 1 untuk buku atau 2 untuk CD.");
                                }
                                break;
                            }
                        case 3:
                            // Memeriksa apakah ada buku atau CD yang dipinjam
                            if (!bukuDipinjam.isEmpty() || !cdDipinjam.isEmpty()) {
                                System.out.println("Pilih 1 untuk melaporkan buku atau 2 untuk melaporkan CD:");
                                int choice = scan.nextInt();
                                if (choice == 1) {
                                    System.out.println("Buku yang sedang dipinjam:");
                                    for (int i = 0; i < bukuDipinjam.size(); i++) {
                                        System.out.println((i + 1) + ". " + bukuDipinjam.get(i).getJudul());
                                    }
                                    System.out.println("Silahkan Pilih Buku yang ingin Anda laporkan keadaannya (masukkan nomor urutnya):");
                                    int bukuIndexToReport = scan.nextInt();

                                    if (bukuIndexToReport > 0 && bukuIndexToReport <= bukuDipinjam.size()) {
                                        System.out.println("Pilih 1 untuk melaporkan buku rusak, atau 2 untuk melaporkan buku hilang:");
                                        int reportOption = scan.nextInt();

                                        switch (reportOption) {
                                            case 1:
                                                System.out.println("Anda melaporkan bahwa buku '" + bukuDipinjam.get(bukuIndexToReport - 1).getJudul() + "' rusak.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda Buku Rusak                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToReport, bukuDipinjam.get(bukuIndexToReport - 1).getJudul(), "Mahasiswa                                               "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            case 2:
                                                System.out.println("Anda melaporkan bahwa buku '" + bukuDipinjam.get(bukuIndexToReport - 1).getJudul() + "' hilang.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda Buku Hilang                                 |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToReport, bukuDipinjam.get(bukuIndexToReport - 1).getJudul(), "Mahasiswa                                               "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            default:
                                                System.out.println("Pilihan tidak valid.");
                                                break;
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                } else if (choice == 2) {
                                    System.out.println("CD yang sedang dipinjam:");
                                    for (int i = 0; i < cdDipinjam.size(); i++) {
                                        System.out.println((i + 1) + ". " + cdDipinjam.get(i).getJudul());
                                    }
                                    System.out.println("Silahkan Pilih CD yang ingin Anda laporkan keadaannya (masukkan nomor urutnya):");
                                    int cdIndexToReport = scan.nextInt();

                                    if (cdIndexToReport > 0 && cdIndexToReport <= cdDipinjam.size()) {
                                        System.out.println("Pilih 1 untuk melaporkan CD rusak, atau 2 untuk melaporkan CD hilang:");
                                        int reportOption = scan.nextInt();

                                        switch (reportOption) {
                                            case 1:
                                                System.out.println("Anda melaporkan bahwa CD '" + cdDipinjam.get(cdIndexToReport - 1).getJudul() + "' rusak.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda CD Rusak                                    |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul CD                        | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToReport, cdDipinjam.get(cdIndexToReport - 1).getJudul(), "Mahasiswa                                               "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            case 2:
                                                System.out.println("Anda melaporkan bahwa CD '" + cdDipinjam.get(cdIndexToReport - 1).getJudul() + " hilang.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda CD Hilang                                   |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul CD                        | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToReport, cdDipinjam.get(cdIndexToReport - 1).getJudul(), "Mahasiswa                                               "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            default:
                                                System.out.println("Pilihan tidak valid.");
                                                break;
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid.");
                                }
                            } else {
                                System.out.println("Tidak ada buku atau CD yang dipinjam.");
                                break; // Kembali ke pilihan utama
                            }
                            break;
                        case 4:
                            // Pilihan untuk meminjam buku atau CD
                            System.out.println("Pilih 1 untuk meminjam buku atau 2 untuk meminjam CD:");
                            int jenisPinjaman = scan.nextInt();
                            
                            if (jenisPinjaman == 1) {
                                // Meminjam buku
                                System.out.println("Buku yang tersedia:");
                                for (int i = 0; i < bukuList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bukuList.get(i).getJudul());
                                }
                                System.out.println("Berapa banyak buku yang ingin Anda pinjam?");
                                int jumlahBuku = scan.nextInt();
                                for (int j = 0; j < jumlahBuku; j++) {
                                    System.out.println("Silahkan Pilih Buku yang ingin Anda pinjam (masukkan nomor urutnya):");
                                    int bukuIndexToBorrow = scan.nextInt();
                                    if (bukuIndexToBorrow > 0 && bukuIndexToBorrow <= bukuList.size()) {
                                        Buku_Majalahataujurnal bukuPinjam = bukuList.get(bukuIndexToBorrow - 1);
                                        if (bukuPinjam.getJ_tersedia() > 0) {
                                            // Kurangi jumlah tersedia
                                            bukuPinjam.kurangiJumlahTersedia();
                                            // Tambahkan jumlah dipinjam
                                            bukuPinjam.tambahJumlahDipinjam();
                                            // Pindahkan buku yang dipinjam ke daftar buku yang sedang dipinjam
                                            bukuDipinjam.add(bukuPinjam);
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("|                                               Pinjam Buku                                       |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            
                                            keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToBorrow, bukuPinjam, "Mahasiswa                                               "));

                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            System.out.println("Anda berhasil meminjam buku: " + bukuPinjam.getJudul());
                                        } else {
                                            System.out.println("Buku tidak tersedia untuk dipinjam saat ini.");
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                }
                            } else if (jenisPinjaman == 2) {
                                // Meminjam CD
                                System.out.println("CD yang tersedia:");
                                for (int i = 0; i < cdList.size(); i++) {
                                    System.out.println((i + 1) + ". " + cdList.get(i).getJudul());
                                }
                                System.out.println("Berapa banyak CD yang ingin Anda pinjam?");
                                int jumlahCD = scan.nextInt();
                                for (int j = 0; j < jumlahCD; j++) {
                                    System.out.println("Silahkan Pilih CD yang ingin Anda pinjam (masukkan nomor urutnya):");
                                    int cdIndexToBorrow = scan.nextInt();
                                    if (cdIndexToBorrow > 0 && cdIndexToBorrow <= cdList.size()) {
                                        CD cdPinjam = cdList.get(cdIndexToBorrow - 1);
                                        if (cdPinjam.getJ_tersedia() > 0) {
                                            // Kurangi jumlah tersedia
                                            cdPinjam.kurangiJumlahTersedia();
                                            // Tambahkan jumlah dipinjam
                                            cdPinjam.tambahJumlahDipinjam();
                                            // Pindahkan CD yang dipinjam ke daftar CD yang sedang dipinjam
                                            cdDipinjam.add(cdPinjam);
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("|                                               Pinjam Buku                                       |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            
                                            keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToBorrow, cdPinjam, "Mahasiswa                                               "));

                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            System.out.println("Anda berhasil meminjam CD: " + cdPinjam.getJudul());
                                        } else {
                                            System.out.println("CD tidak tersedia untuk dipinjam saat ini.");
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                }
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        
                        case 5:
                            System.out.println("Pilih 1 untuk melihat buku yang tersedia atau 2 untuk melihat CD yang tersedia:");
                            int pilihanTersedia = scan.nextInt();
                            if (pilihanTersedia == 1) {
                                System.out.println("Buku yang tersedia:");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                               Buku Tersedia                                    |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| Judul Buku          |   Buku Tersedia   |      Buku Dipinjam                                |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                for (Buku_Majalahataujurnal buku : bukuList) {
                                    if (buku.getJ_tersedia() > 0) { // Hanya tampilkan buku yang tersedia
                                        System.out.println(buku.getJudul() + " - Tersedia: " + buku.getJ_tersedia() + ", Dipinjam: " + buku.getJ_pinjam());
                                        keluar.write(String.format("| %-30s | %-20d | %-20d |\n", buku.getJudul(), buku.getJ_tersedia(), buku.getJ_pinjam()));
                                    }
                                }
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                            } else if (pilihanTersedia == 2) {
                                System.out.println("CD yang tersedia:");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                               CD Tersedia                                      |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| Judul CD            |   CD Tersedia     |      CD Dipinjam                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                for (CD cd : cdList) {
                                    if (cd.getJ_tersedia() > 0) { // Hanya tampilkan CD yang tersedia
                                        System.out.println(cd.getJudul() + " - Tersedia: " + cd.getJ_tersedia() + ", Dipinjam: " + cd.getJ_pinjam());
                                        keluar.write(String.format("| %-30s | %-20d | %-20d |\n", cd.getJudul(), cd.getJ_tersedia(), cd.getJ_pinjam()));
                                    }
                                }
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        case 6 : 
                            System.out.println("Terima Kasih");
                            a = false;
                        default:
                            System.out.println("Anda Telah Keluar");
                            break;
                        // case 5:
                        //     System.out.println("Informasi Buku Saat Ini:");
                        //     System.out.println("Buku yang tersedia:");
                        //     for (Buku_Majalahataujurnal buku : bukuList) {
                        //         System.out.println(buku.getJudul() + " - Tersedia: " + buku.getJumlahTersedia() + ", Dipinjam: " + buku.getJumlahDipinjam());
                        //     }
                        //     System.out.println("Buku yang sedang dipinjam:");
                        //     for (Buku_Majalahataujurnal buku : bukuDipinjam) {
                        //         System.out.println(buku.getJudul() + " - Tersedia: " + buku.getJumlahTersedia() + ", Dipinjam: " + buku.getJumlahDipinjam());
                        //     }
                        //     break;
                    }
                }
            } else if (input == 2) {
                System.out.println("Anda Login Sebagai dosen_staff");
                // Sisipkan logika untuk dosen_staff di sini
                Boolean a = true;
                while (a) {
                    System.out.println("1. Baca buku/CD");
                    System.out.println("2. Kembalikan buku/cd");
                    System.out.println("3. Bayar Denda");
                    System.out.println("4. Pinjam Buku/cd");
                    System.out.println("5. Ingfo buku/cd yang tersedia");
                    System.out.println("6. Log Out");
                    System.out.println("Apa yang anda ingin lakukan");
                    int inpu = scan.nextInt();
                    switch (inpu) {
                        case 1:
                            System.out.println("Pilih 1. Lihat Buku yang tersedia atau 2. Lihat CD yang tersedia");
                            int o = scan.nextInt();
                            if (o == 1) {
                                System.out.println("Buku yang tersedia:");
                                for (int i = 0; i < bukuList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bukuList.get(i).getJudul());
                                }
                                System.out.println("Silahkan Pilih Buku yang ingin anda baca (masukkan nomor urutnya):");
                                int bukuIndex = scan.nextInt();
                                Buku_Majalahataujurnal bukuPilihan = bukuList.get(bukuIndex - 1);
                                System.out.println("Anda memilih untuk membaca buku: " + bukuPilihan.getJudul());
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                              Baca Buku                                          |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                
                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndex, bukuPilihan.getJudul(), "Dosen/Staff                                                "));
                                
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                // Lanjutkan dengan tindakan berikutnya
                            } else if (o == 2) {
                                System.out.println("CD yang tersedia:");
                                for (int i = 0; i < cdList.size(); i++) {
                                    System.out.println((i + 1) + ". " + cdList.get(i).getJudul());
                                }
                                System.out.println("Silahkan Pilih CD yang ingin anda dengarkan (masukkan nomor urutnya):");
                                int cdIndex = scan.nextInt();
                                CD cdPilihan = cdList.get(cdIndex - 1);
                                System.out.println("Anda memilih untuk mendengarkan CD: " + cdPilihan.getJudul());
                                // Lanjutkan dengan tindakan berikutnya
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                             Gunakan CD                                          |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| No. | CD Pilihan                     | Pembaca                                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                
                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndex, cdPilihan.getJudul(), "Dosen/Staff                                                "));
                                
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                // Lanjutkan dengan tindakan berikutnya
                            } else {
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("Tekan 1 untuk mengembalikan buku, tekan 2 untuk mengembalikan CD:");
                            int returnChoice = scan.nextInt();
                            
                            if (returnChoice == 1) {
                                // Proses pengembalian buku
                                if (!bukuDipinjam.isEmpty()) {
                                    System.out.println("Buku yang sedang dipinjam:");
                                    for (int i = 0; i < bukuDipinjam.size(); i++) {
                                        System.out.println((i + 1) + ". " + bukuDipinjam.get(i).getJudul());
                                    }
                        
                                    System.out.println("Silahkan Pilih Buku yang ingin Anda kembalikan (masukkan nomor urutnya):");
                                    int bukuIndexToReturn = scan.nextInt();
                        
                                    if (bukuIndexToReturn > 0 && bukuIndexToReturn <= bukuDipinjam.size()) {
                                        Buku_Majalahataujurnal bukuKembali = bukuDipinjam.remove(bukuIndexToReturn - 1);
                                        System.out.println("Anda mengembalikan buku: " + bukuKembali.getJudul());
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        keluar.write("|                                            Kembaikan Buku                                       |\n");
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        
                                        keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToReturn, bukuKembali.getJudul(), "Dosen/Staff                                                "));
                                        
                                        keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                        bukuList.add(bukuKembali);
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                } else if (returnChoice == 2) {
                                    // Proses pengembalian CD
                                    if (!cdDipinjam.isEmpty()) {
                                        System.out.println("CD yang sedang dipinjam:");
                                        for (int i = 0; i < cdDipinjam.size(); i++) {
                                            System.out.println((i + 1) + ". " + cdDipinjam.get(i).getJudul());
                                        }
                            
                                        System.out.println("Silahkan Pilih CD yang ingin Anda kembalikan (masukkan nomor urutnya):");
                                        int cdIndexToReturn = scan.nextInt();
                            
                                        if (cdIndexToReturn > 0 && cdIndexToReturn <= cdDipinjam.size()) {
                                            CD cdKembali = cdDipinjam.remove(cdIndexToReturn - 1);
                                            System.out.println("Anda mengembalikan CD: " + cdKembali.getJudul());
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("|                                             Kembaikan CD                                        |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("| No. | Judul CD                        | Pembaca                                                  |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            
                                            keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToReturn, cdKembali.getJudul(), "Dosen/Staff                                               "));
                                            
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            cdList.add(cdKembali);
                                        } else {
                                            System.out.println("Pilihan tidak valid.");
                                        }
                                    } else {
                                        System.out.println("Tidak ada CD yang dipinjam.");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid. Silakan masukkan 1 untuk buku atau 2 untuk CD.");
                                }
                                break;
                            }
                        case 3:
                            // Memeriksa apakah ada buku atau CD yang dipinjam
                            if (!bukuDipinjam.isEmpty() || !cdDipinjam.isEmpty()) {
                                System.out.println("Pilih 1 untuk melaporkan buku atau 2 untuk melaporkan CD:");
                                int choice = scan.nextInt();
                                if (choice == 1) {
                                    System.out.println("Buku yang sedang dipinjam:");
                                    for (int i = 0; i < bukuDipinjam.size(); i++) {
                                        System.out.println((i + 1) + ". " + bukuDipinjam.get(i).getJudul());
                                    }
                                    System.out.println("Silahkan Pilih Buku yang ingin Anda laporkan keadaannya (masukkan nomor urutnya):");
                                    int bukuIndexToReport = scan.nextInt();

                                    if (bukuIndexToReport > 0 && bukuIndexToReport <= bukuDipinjam.size()) {
                                        System.out.println("Pilih 1 untuk melaporkan buku rusak, atau 2 untuk melaporkan buku hilang:");
                                        int reportOption = scan.nextInt();

                                        switch (reportOption) {
                                            case 1:
                                                System.out.println("Anda melaporkan bahwa buku '" + bukuDipinjam.get(bukuIndexToReport - 1).getJudul() + "' rusak.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda Buku Rusak                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToReport, bukuDipinjam.get(bukuIndexToReport - 1).getJudul(), "Dosen/Staff                                               "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            case 2:
                                                System.out.println("Anda melaporkan bahwa buku '" + bukuDipinjam.get(bukuIndexToReport - 1).getJudul() + "' hilang.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda Buku Hilang                                 |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToReport, bukuDipinjam.get(bukuIndexToReport - 1).getJudul(), "Dosen/Staff                                                "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            default:
                                                System.out.println("Pilihan tidak valid.");
                                                break;
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                } else if (choice == 2) {
                                    System.out.println("CD yang sedang dipinjam:");
                                    for (int i = 0; i < cdDipinjam.size(); i++) {
                                        System.out.println((i + 1) + ". " + cdDipinjam.get(i).getJudul());
                                    }
                                    System.out.println("Silahkan Pilih CD yang ingin Anda laporkan keadaannya (masukkan nomor urutnya):");
                                    int cdIndexToReport = scan.nextInt();

                                    if (cdIndexToReport > 0 && cdIndexToReport <= cdDipinjam.size()) {
                                        System.out.println("Pilih 1 untuk melaporkan CD rusak, atau 2 untuk melaporkan CD hilang:");
                                        int reportOption = scan.nextInt();

                                        switch (reportOption) {
                                            case 1:
                                                System.out.println("Anda melaporkan bahwa CD '" + cdDipinjam.get(cdIndexToReport - 1).getJudul() + "' rusak.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda CD Rusak                                    |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul CD                        | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToReport, cdDipinjam.get(cdIndexToReport - 1).getJudul(), "Dosen/Staff                                                "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            case 2:
                                                System.out.println("Anda melaporkan bahwa CD '" + cdDipinjam.get(cdIndexToReport - 1).getJudul() + " hilang.");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("|                                         Bayar Denda CD Hilang                                   |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                keluar.write("| No. | Judul CD                        | Pembaca                                                  |\n");
                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                
                                                keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToReport, cdDipinjam.get(cdIndexToReport - 1).getJudul(), "Dosen/Staff                                                "));

                                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                                System.out.println("Anda harus membayar denda sebesar Rp10.000.");
                                                break;
                                            default:
                                                System.out.println("Pilihan tidak valid.");
                                                break;
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid.");
                                }
                            } else {
                                System.out.println("Tidak ada buku atau CD yang dipinjam.");
                                break; // Kembali ke pilihan utama
                            }
                            break;
                        case 4:
                            // Pilihan untuk meminjam buku atau CD
                            System.out.println("Pilih 1 untuk meminjam buku atau 2 untuk meminjam CD:");
                            int jenisPinjaman = scan.nextInt();
                            
                            if (jenisPinjaman == 1) {
                                // Meminjam buku
                                System.out.println("Buku yang tersedia:");
                                for (int i = 0; i < bukuList.size(); i++) {
                                    System.out.println((i + 1) + ". " + bukuList.get(i).getJudul());
                                }
                                System.out.println("Berapa banyak buku yang ingin Anda pinjam?");
                                int jumlahBuku = scan.nextInt();
                                for (int j = 0; j < jumlahBuku; j++) {
                                    System.out.println("Silahkan Pilih Buku yang ingin Anda pinjam (masukkan nomor urutnya):");
                                    int bukuIndexToBorrow = scan.nextInt();
                                    if (bukuIndexToBorrow > 0 && bukuIndexToBorrow <= bukuList.size()) {
                                        Buku_Majalahataujurnal bukuPinjam = bukuList.get(bukuIndexToBorrow - 1);
                                        if (bukuPinjam.getJ_tersedia() > 0) {
                                            // Kurangi jumlah tersedia
                                            bukuPinjam.kurangiJumlahTersedia();
                                            // Tambahkan jumlah dipinjam
                                            bukuPinjam.tambahJumlahDipinjam();
                                            // Pindahkan buku yang dipinjam ke daftar buku yang sedang dipinjam
                                            bukuDipinjam.add(bukuPinjam);
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("|                                               Pinjam Buku                                       |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            
                                            keluar.write(String.format("| %-3d | %-30s | %-20s |\n", bukuIndexToBorrow, bukuPinjam, "Dosen/Staff                                                "));

                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            System.out.println("Anda berhasil meminjam buku: " + bukuPinjam.getJudul());
                                        } else {
                                            System.out.println("Buku tidak tersedia untuk dipinjam saat ini.");
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                }
                            } else if (jenisPinjaman == 2) {
                                // Meminjam CD
                                System.out.println("CD yang tersedia:");
                                for (int i = 0; i < cdList.size(); i++) {
                                    System.out.println((i + 1) + ". " + cdList.get(i).getJudul());
                                }
                                System.out.println("Berapa banyak CD yang ingin Anda pinjam?");
                                int jumlahCD = scan.nextInt();
                                for (int j = 0; j < jumlahCD; j++) {
                                    System.out.println("Silahkan Pilih CD yang ingin Anda pinjam (masukkan nomor urutnya):");
                                    int cdIndexToBorrow = scan.nextInt();
                                    if (cdIndexToBorrow > 0 && cdIndexToBorrow <= cdList.size()) {
                                        CD cdPinjam = cdList.get(cdIndexToBorrow - 1);
                                        if (cdPinjam.getJ_tersedia() > 0) {
                                            // Kurangi jumlah tersedia
                                            cdPinjam.kurangiJumlahTersedia();
                                            // Tambahkan jumlah dipinjam
                                            cdPinjam.tambahJumlahDipinjam();
                                            // Pindahkan CD yang dipinjam ke daftar CD yang sedang dipinjam
                                            cdDipinjam.add(cdPinjam);
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("|                                               Pinjam Buku                                       |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            keluar.write("| No. | Judul Buku                     | Pembaca                                                  |\n");
                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            
                                            keluar.write(String.format("| %-3d | %-30s | %-20s |\n", cdIndexToBorrow, cdPinjam, "Dosen/Staff                                               "));

                                            keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                            System.out.println("Anda berhasil meminjam CD: " + cdPinjam.getJudul());
                                        } else {
                                            System.out.println("CD tidak tersedia untuk dipinjam saat ini.");
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid.");
                                    }
                                }
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        
                        case 5:
                            System.out.println("Pilih 1 untuk melihat buku yang tersedia atau 2 untuk melihat CD yang tersedia:");
                            int pilihanTersedia = scan.nextInt();
                            if (pilihanTersedia == 1) {
                                System.out.println("Buku yang tersedia:");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                               Buku Tersedia                                    |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| Judul Buku          |   Buku Tersedia   |      Buku Dipinjam                                |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                for (Buku_Majalahataujurnal buku : bukuList) {
                                    if (buku.getJ_tersedia() > 0) { // Hanya tampilkan buku yang tersedia
                                        System.out.println(buku.getJudul() + " - Tersedia: " + buku.getJ_tersedia() + ", Dipinjam: " + buku.getJ_pinjam());
                                        keluar.write(String.format("| %-30s | %-20d | %-20d |\n", buku.getJudul(), buku.getJ_tersedia(), buku.getJ_pinjam()));
                                    }
                                }
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                            } else if (pilihanTersedia == 2) {
                                System.out.println("CD yang tersedia:");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                               CD Tersedia                                      |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| Judul CD            |   CD Tersedia     |      CD Dipinjam                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                for (CD cd : cdList) {
                                    if (cd.getJ_tersedia() > 0) { // Hanya tampilkan CD yang tersedia
                                        System.out.println(cd.getJudul() + " - Tersedia: " + cd.getJ_tersedia() + ", Dipinjam: " + cd.getJ_pinjam());
                                        keluar.write(String.format("| %-30s | %-20d | %-20d |\n", cd.getJudul(), cd.getJ_tersedia(), cd.getJ_pinjam()));
                                    }
                                }
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        case 6 : 
                            System.out.println("Terima Kasih");
                            a = false;
                        default:
                            System.out.println("Anda Telah Keluar");
                            break;
                    }
                }
            } else if (input == 3) {
                System.out.println("Anda Login Sebagai Pustakawan");
                boolean isPustakawanLoggedIn = true;
                while (isPustakawanLoggedIn) {
                    System.out.println("1. Tambah Daftar buku");
                    System.out.println("2. Cek Daftar buku/cd yang tersisa");
                    System.out.println("3. Lihat Daftar Buku/CD yang di Pinjam");
                    System.out.println("4. Log Out");
                    System.out.println("Pilih opsi:");
                    int o = scan.nextInt();

                    switch (o) {
                        case 1:
                            // Tambah Daftar buku atau CD
                            System.out.println("Pilih 1 untuk menambah buku atau 2 untuk menambah CD:");
                            int tambahOpsi = scan.nextInt();

                            if (tambahOpsi == 1) {
                                // Tambah buku
                                System.out.println("Masukkan informasi buku baru:");
                                System.out.println("ID Buku:");
                                int idBuku = scan.nextInt();
                                System.out.println("Judul Buku:");
                                String judulBuku = scan.nextLine(); // Membersihkan buffer
                                judulBuku = scan.nextLine();
                                System.out.println("Tahun Terbit:");
                                String tahunTerbit = scan.nextLine();
                                System.out.println("Jumlah Tersedia:");
                                int jumlahTersedia = scan.nextInt();
                                System.out.println("Jumlah Dipinjam:");
                                int jumlahDipinjam = scan.nextInt();
                                System.out.println("ISBN atau ISSN:");
                                int isbnatauissn = scan.nextInt();
                                System.out.println("Edisi:");
                                String edisi = scan.nextLine(); // Membersihkan buffer
                                edisi = scan.nextLine();
                                System.out.println("Jenis Sampul:");
                                String jenisSampul = scan.nextLine();
                                keluar.write("+-------------------------------------------------------------------------------------------------+");
                                keluar.write("|                                         Informasi Buku Baru                                     |");
                                keluar.write("+-------------------------------------------------------------------------------------------------+");
                                keluar.write("| ID Buku | Judul Buku                     | Tahun Terbit | Jumlah Tersedia | Jumlah Dipinjam | ISBN/ISSN | Edisi | Jenis Sampul |");
                                keluar.write("+-------------------------------------------------------------------------------------------------+");
                                keluar.write(String.format("| %-7d | %-30s | %-12s | %-15d | %-14d | %-9d | %-5s | %-12s |\n", idBuku, judulBuku, tahunTerbit, jumlahTersedia, jumlahDipinjam, isbnatauissn, edisi, jenisSampul));
                                keluar.write("+-------------------------------------------------------------------------------------------------+");

                                // Menambahkan buku baru ke dalam ArrayList bukuList
                                bukuList.add(new Buku_Majalahataujurnal(idBuku, judulBuku, tahunTerbit, jumlahTersedia, jumlahDipinjam, 0, jumlahTersedia, isbnatauissn, edisi, jenisSampul));
                                System.out.println("Buku berhasil ditambahkan.");
                            } else if (tambahOpsi == 2) {
                                // Tambah CD
                                System.out.println("Masukkan informasi CD baru:");
                                System.out.println("ID CD:");
                                int idCD = scan.nextInt();
                                System.out.println("Judul CD:");
                                String judulCD = scan.nextLine(); // Membersihkan buffer
                                judulCD = scan.nextLine();
                                System.out.println("Tahun Terbit:");
                                String tahunTerbitCD = scan.nextLine();
                                System.out.println("Jumlah Tersedia:");
                                int jumlahTersediaCD = scan.nextInt();
                                System.out.println("Jumlah Dipinjam:");
                                int jumlahDipinjamCD = scan.nextInt();
                                                                // Menampilkan informasi CD yang baru dimasukkan
                                keluar.write("+-------------------------------------------------------------------------------------------------+");
                                keluar.write("|                                         Informasi CD Baru                                       |");
                                keluar.write("+-------------------------------------------------------------------------------------------------+");
                                keluar.write("| ID CD | Judul CD                        | Tahun Terbit | Jumlah Tersedia | Jumlah Dipinjam |");
                                keluar.write("+-------------------------------------------------------------------------------------------------+");
                                keluar.write(String.format("| %-5d | %-30s | %-12s | %-15d | %-14d |\n", idCD, judulCD, tahunTerbitCD, jumlahTersediaCD, jumlahDipinjamCD));
                                keluar.write("+-------------------------------------------------------------------------------------------------+");

                                // Menambahkan CD baru ke dalam ArrayList cdList
                                cdList.add(new CD(idCD, judulCD, tahunTerbitCD, jumlahTersediaCD, jumlahDipinjamCD, 0, jumlahTersediaCD));
                                System.out.println("CD berhasil ditambahkan.");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        case 2:
                            System.out.println("Pilih 1 untuk melihat buku yang tersedia atau 2 untuk melihat CD yang tersedia:");
                            int pilihanTersedia = scan.nextInt();
                            if (pilihanTersedia == 1) {
                                System.out.println("Buku yang tersedia:");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                               Buku Tersedia                                    |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| Judul Buku          |   Buku Tersedia   |      Buku Dipinjam                                |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                for (Buku_Majalahataujurnal buku : bukuList) {
                                    if (buku.getJ_tersedia() > 0) { // Hanya tampilkan buku yang tersedia
                                        System.out.println(buku.getJudul() + " - Tersedia: " + buku.getJ_tersedia() + ", Dipinjam: " + buku.getJ_pinjam());
                                        keluar.write(String.format("| %-30s | %-20d | %-20d |\n", buku.getJudul(), buku.getJ_tersedia(), buku.getJ_pinjam()));
                                    }
                                }
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                            } else if (pilihanTersedia == 2) {
                                System.out.println("CD yang tersedia:");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("|                                               CD Tersedia                                      |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                keluar.write("| Judul CD            |   CD Tersedia     |      CD Dipinjam                                  |\n");
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                                for (CD cd : cdList) {
                                    if (cd.getJ_tersedia() > 0) { // Hanya tampilkan CD yang tersedia
                                        System.out.println(cd.getJudul() + " - Tersedia: " + cd.getJ_tersedia() + ", Dipinjam: " + cd.getJ_pinjam());
                                        keluar.write(String.format("| %-30s | %-20d | %-20d |\n", cd.getJudul(), cd.getJ_tersedia(), cd.getJ_pinjam()));
                                    }
                                }
                                keluar.write("+-------------------------------------------------------------------------------------------------+\n");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        case 3:
                            // Lihat daftar buku dan CD yang sedang dipinjam
                            boolean adaDipinjam = false;
                            keluar.write("Daftar Buku dan CD yang sedang dipinjam:");
                            keluar.write("+-------------------------------------------------------------------------------------------------+");
                            keluar.write("|                                       Daftar Buku Dipinjam                                      |");
                            keluar.write("+-------------------------------------------------------------------------------------------------+");
                            keluar.write("| No. | Judul Buku                        | Jumlah Dipinjam                                       |");
                            keluar.write("+-------------------------------------------------------------------------------------------------+");
                            int bukuCount = 1;
                            for (Buku_Majalahataujurnal buku : bukuDipinjam) {
                                System.out.printf("| %-3d | %-30s | %-20d |\n", bukuCount++, buku.getJudul(), buku.getJ_pinjam());
                                adaDipinjam = true;
                            }
                            keluar.write("+-------------------------------------------------------------------------------------------------+");

                            keluar.write("+-------------------------------------------------------------------------------------------------+");
                            keluar.write("|                                       Daftar CD Dipinjam                                        |");
                            keluar.write("+-------------------------------------------------------------------------------------------------+");
                            keluar.write("| No. | Judul CD                          | Jumlah Dipinjam                                       |");
                            keluar.write("+-------------------------------------------------------------------------------------------------+");
                            int cdCount = 1;
                            for (CD cd : cdDipinjam) {
                                System.out.printf("| %-3d | %-30s | %-20d |\n", cdCount++, cd.getJudul(), cd.getJ_pinjam());
                                adaDipinjam = true;
                            }
                            keluar.write("+-------------------------------------------------------------------------------------------------+");

                            if (!adaDipinjam) {
                                System.out.println("Tidak ada buku atau CD yang sedang dipinjam.");
                            }
                            break;
                        case 4 : 
                            System.out.println("Anda Telah Log Out");
                            isPustakawanLoggedIn = false;
                        } 
                        
                    } 
                    
                } else {
                    System.out.println("Anda Telah Log Out");
                    b = false;
                }
            } 
            // Tutup scanner
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            try {
                if (keluar != null) {
                    keluar.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
                }
            }
        
     // End of main method
// End of Main class