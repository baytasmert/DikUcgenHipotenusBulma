import java.util.Scanner;
import java.lang.Math;
public class CevreAlanHesaplama {

    public static void main(String[] args) {
        int k1;
        int k2;
        int k3;
        double u,alan,cevre;
        Scanner oku=new Scanner(System.in);

        System.out.println("Ucgenin ilk kenarini giriniz: ");
        k1=oku.nextInt();

        System.out.println("Ucgenin ikinci kenarini giriniz: ");
        k2=oku.nextInt();

        System.out.println("Ucgenin ucuncu kenarini giriniz: ");
        k3=oku.nextInt();

        u=(k1+k2+k3)/2;
        cevre=2*u;
        alan=Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));

        System.out.println("Cevre = "+cevre+"\nAlan= "+alan);






    }
}