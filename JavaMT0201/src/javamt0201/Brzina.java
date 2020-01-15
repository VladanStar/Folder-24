package javamt0201;

class Brzina {

    private double mps;

    private Brzina() {
    }

    private Brzina(double mps) {
        this.mps = mps;
    }

    public static Brzina fromMetersPerSeconds(double mps) {

        return new Brzina(mps);

    }

    public static Brzina fromKilometersPerHour(double kmps) {
        return new Brzina(kmps / 3.6);

    }

    public double toMetersPerSeconds() {
        return this.mps;

    }

    public double toKilometersPerHours() {

        return this.mps * 3.6;

    }

    public void addMetersPerSeconds(double mps) {
        this.mps += mps;
    }

    public void addKilometersPerHour(double kmps) {
        this.mps += kmps / 3.6;
    }

}
