public class IfStatement {
    public static void main(String[] args) {
        
        var nilai = 82;
        var absen = 90;

        if(nilai >= 75 && absen >= 75){
            System.out.println("lulus");
        } else {
            System.out.println("gagal");
        }

        if(nilai >= 70 && absen >= 70) {
            System.out.println("Nilai A");
        }
        else if(nilai >= 60 && absen >= 60) {
            System.out.println("Nilai B");
        }
        else{
            System.out.println("Nilai E");
        }
    }
    
}
