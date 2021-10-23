class Temps{
    public static void CelsiusToKelvin(double t){
        System.out.println(t+" Celsius"+" = "+(t+273.15)+" Kelvin");
    }
    public static void CelsiusToFarenheit(double t){
        System.out.println(t+" Celsius"+" = "+(t*1.8+32)+" Farenheit");
    }
    public static void FarenheitToCelsius(double t){
        System.out.println(t+" Farenheit"+" = "+(t-32)*5/9+" Celsius");
    }
    public static void FarenheitToKelvin(double t){
        System.out.println(t+" Farenheit"+" = "+((t-32)*5/9+273.15)+" Kelvin");
    }
    public static void KelvinToCelsius(double t){
        System.out.println(t+" Kelvin"+" = "+(t-273.15)+" Celsius");
    }
    public static void KelvinToFarenheit(double t){
        System.out.println(t+" Kelvin"+" = "+((t - 273.15) * 9/5 + 32)+" Farenheit");
    }
    
    
    public static void main(String[] args) {
        Temps.CelsiusToKelvin(25);
        Temps.CelsiusToFarenheit(25);
        Temps.FarenheitToCelsius(100);
        Temps.FarenheitToKelvin(100);
        Temps.KelvinToCelsius(0);
        Temps.KelvinToFarenheit(0);
    }
}
