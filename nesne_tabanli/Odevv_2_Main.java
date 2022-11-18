package nesne_tabanli;

public class Odevv_2_Main {


    public static void main(String[] args) {

        Odevv_2 a = new Odevv_2();

              //----------soru 1----------//
        double km = 2000;
        double mil = a.mil(km);
        System.out.println(km+ " km "+mil +" mil eder.");


              //----------soru 2----------//
        a.rectangleArea(1.3,2.5);

             //----------soru 3----------//
        int i=5;
        int f = a.factorial(i);
        System.out.println(i+" sayısının faktoriyeli: "+f);

            //----------soru 4----------//
        String sent = "DEnemeleEr";
        int result = a.totalE(sent);
        System.out.println(sent +" kelimesinde "+ result +" tane E harfi var.");

           //----------soru 5----------//

       int edge= 3;
       int totalAngle = a.angle(edge);
        System.out.println("İç açılar toplamı: "+totalAngle);


           //----------soru 6----------//
        int day = 20;
        int salary = a.totalSalary(day);
        System.out.println("Çalışanın maaşı:" +salary);


          //----------soru 7 ----------//
      int time=1;
      int price= a.totalPrice(time);
        System.out.println("Toplam Ödenecek Tutar: "+price);






    }
}
