package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int pilih;

        do {

            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Depan");
            System.out.println("2. Tambah Belakang");
            System.out.println("3. Insert After");
            System.out.println("4. Hapus Depan");
            System.out.println("5. Hapus Belakang");
            System.out.println("6. Tampilkan");
            System.out.println("7. Tampilkan Reverse");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim1 = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama1 = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas1 = sc.nextLine();

                    System.out.print("IPK   : ");
                    double ipk1 = sc.nextDouble();
                    sc.nextLine();

                    dll.addFirst(
                            new Mahasiswa(
                                    nim1,
                                    nama1,
                                    kelas1,
                                    ipk1));

                    System.out.println("Data berhasil ditambahkan di depan");
                    break;

                case 2:

                    System.out.print("NIM   : ");
                    String nim2 = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama2 = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas2 = sc.nextLine();

                    System.out.print("IPK   : ");
                    double ipk2 = sc.nextDouble();
                    sc.nextLine();

                    dll.addLast(
                            new Mahasiswa(
                                    nim2,
                                    nama2,
                                    kelas2,
                                    ipk2));

                    System.out.println("Data berhasil ditambahkan di belakang");
                    break;

                case 3:

                    System.out.print("Masukkan NIM setelah data : ");
                    String key = sc.nextLine();

                    System.out.print("NIM baru   : ");
                    String nim3 = sc.nextLine();

                    System.out.print("Nama baru  : ");
                    String nama3 = sc.nextLine();

                    System.out.print("Kelas baru : ");
                    String kelas3 = sc.nextLine();

                    System.out.print("IPK baru   : ");
                    double ipk3 = sc.nextDouble();
                    sc.nextLine();

                    dll.insertAfter(
                            key,
                            new Mahasiswa(
                                    nim3,
                                    nama3,
                                    kelas3,
                                    ipk3));

                    break;

                case 4:
                    dll.removeFirst();
                    break;

                case 5:
                    dll.removeLast();
                    break;

                case 6:
                    dll.print();
                    break;

                case 7:
                    dll.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai...");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);

        sc.close();
    }
}