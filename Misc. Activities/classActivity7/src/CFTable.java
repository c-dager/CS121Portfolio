public class CFTable {
    public static void main(String[] args) {
        System.out.println("Celcius\t\tFahrenheit");
        System.out.println();
        for (int i = 0; i < 21; i++){
            double fahr;
            fahr = (9/5.0)*i + 32;
            System.out.println(i+ "\t\t\t\t" + fahr);
        }
    }
}
