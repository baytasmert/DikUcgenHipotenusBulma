import java.util.Scanner;
import java.lang.Math;
public class HipotenusHesaplama {

    public static void main(String[] args) {
        double kenar1,kenar2,hipotenus;
        Scanner oku=new Scanner(System.in);

        System.out.println("Ucgenin dik olmayan ilk kenarini giriniz: ");
        kenar1=oku.nextInt();

        System.out.println("Ucgenin dik olmayan ikinci kenarini giriniz: ");
        kenar2=oku.nextInt();

        hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Ucgenin uzun kenari = "+hipotenus+" !");



    }
}
