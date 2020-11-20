public class Kalibrr {
    
    public static void main(String[] args) {
        String hasil = "persoalan";

      System.out.print(h(pow(2,1000000000000000L),"fruits"));
    }

    public static String g(String str) {
        String Hasil = "";
        int i = 0;
        while (i < str.length() - 1) {
            Hasil = Hasil + str.charAt(i + 1);
            i = i + 1;
        }

        return Hasil;
    }

    public static String f(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } else {
            return f(g(str)) + str.charAt(0);
        }

    }

    public static String h(long n, String str) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            str = f(str);
        }

        return str;
    }

    public static long pow( long x,  long y) {
       
        if(y == 0){
        return 1;
        }else{
            return x * pow(x,y-1);
        }
    }


}
