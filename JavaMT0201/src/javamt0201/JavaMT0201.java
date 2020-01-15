package javamt0201;

public class JavaMT0201 {

    public static void main(String[] args) {

        Vreme v1 = Vreme.fromHours(4);
        System.out.println("Vreme je: " + v1.toSeconds());
        prikaziPredjeniPut(Brzina.fromKilometersPerHour(156), Vreme.fromHours(4));

    }

    public static void prikaziPredjeniPut(Brzina brzina, Vreme vreme) {
        Put p = Put.fromMeters(brzina.toMetersPerSeconds() * vreme.toSeconds());

        System.out.println("Predjeni pput je: " + p.toKilometers() + " km");

    }
}
