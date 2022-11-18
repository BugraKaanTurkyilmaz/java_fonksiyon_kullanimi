package nesne_tabanli;

public class Odevv_2 {

//----------Buğra Kaan Türkyılmaz----------//
    //----------soru 1----------//
    public double mil(double km){
        double result = km * 0.621;
        return result;
    }
    //----------soru 2 ----------//
    public void rectangleArea(double shortEdge, double longEdge){
        double area = shortEdge*longEdge;
        System.out.println("Dikdörtgenin alanı: " +area);
    }
    //----------soru 3 ----------//
    public int factorial(int f){
        int result =1;
        for(int i=1;i<=f;i++){
            result = result*i;
        }
        return result;
    }
    //----------soru 4 ----------//
    public int totalE(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'e' || s.charAt(i) == 'E')
                count++;


        }




        return count;
    }
    //----------soru 5 ----------//
      public int angle(int edge){

        int totalAngle =((edge-2)*180)/edge;
        return totalAngle;
      }


    //----------soru 6 ----------//
    public int totalSalary(int day){
        int workHour = day*8;
        int result = workHour * 40;
        if(workHour > 150){
            int shift = (workHour - 150) * 80;
            result +=shift;
        }
        return result;
    }


    //----------soru 7 ----------//
    public int totalPrice(int time){
        int pay = 50*time;
        if (time>1){
          pay = (time*10)+50;

        }
       return pay;



    }

    


}
