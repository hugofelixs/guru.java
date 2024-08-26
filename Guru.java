

public class Guru {
    //variabel
    int nip;
    String nama;
    String mapel;
    String status;
    
    //constructor parameter
    public Guru(int i, String n, String k, String f){
        nip = i;
        nama = n;
        mapel = k;
        status = f;
    }
        public void print() {
            System.out.println("ID: "+nip);
            System.out.println("Nama: "+nama);
            System.out.println("Mapel: "+mapel);
            System.out.println("Status: "+status);
        }

}
