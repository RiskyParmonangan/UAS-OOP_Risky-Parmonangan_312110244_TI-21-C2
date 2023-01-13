public class DataDiri extends Saya {
    protected int Umur;
    
    public DataDiri (String Nama, int NIM, int Umur) {
        super (Nama, NIM);
        this.Umur = Umur;
    }
    @Override
    public void getInfo() {
        System.out.println("Nama : "+Nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Usia : "+Umur);
    }
}
