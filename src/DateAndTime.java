public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());  //milliseconds passed since i jan 1970
        System.out.println(System.currentTimeMillis()/1000);   //seconds passed since i jan 1970
        System.out.println(System.currentTimeMillis()/1000/60);  //minutes passed since i jan 1970
        System.out.println(System.currentTimeMillis()/1000/60/60);  //hours passed since i jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24);  //days passed since i jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);  //years passed since i jan 1970
    }
}
