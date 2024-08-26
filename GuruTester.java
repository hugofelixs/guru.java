import java.util.Scanner;

public class GuruTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mata Pelajaran : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println("NIP : ");
        int nip = input.nextInt();
        input.close();

        Guru buLala = new Guru(nip, nama, mapel, status);
        buLala.print();


        // membuat objek
        Guru buPasha = new Guru(1, "Bu Pasha", "Produktif RPL", "Tetap");
        Guru buAulia = new Guru(2, "Bu Aulia", "Produktif RPL", "Tetap");
        Guru pakTulus = new Guru(3, "Pak Tulus", "IPAS", "Tetap");
        Guru pakFalah = new Guru(4, "Pak Falah", "Bahasa Inddonesia", "Tetap");
        Guru pakThoriq = new Guru(5, "Pak Thoriq", "Olahraga", "Tetap");

        buPasha.print();
        buAulia.print();
        pakTulus.print();
        pakFalah.print();
        pakThoriq.print();
    }
}
