package javamt0201;

class Vreme {

    private double sekunde;

    private Vreme() {
    }

    private Vreme(double sekunde) {
        this.sekunde = sekunde;
    }

    public static Vreme fromSeconds(double sekunde) {

        return new Vreme(sekunde);
    }

    public static Vreme fromMinutes(double minute) {

        return new Vreme(minute * 60);
    }

    public static Vreme fromHours(double sati) {

        return new Vreme(sati * 60 * 60);
    }

    public double toSeconds() {

        return this.sekunde;
    }

    public double toMinutes() {

        return this.sekunde / 60;
    }

    public double tiHours() {

        return this.sekunde / 3600;
    }

    public double toMiliseconds() {

        return this.sekunde * 1000;
    }

    public void addSeconds(double sekunde) {

        this.sekunde += sekunde;
    }

    public void addMinutes(double sekunde) {

        this.sekunde += sekunde * 60;
    }

    public void addHours(double sekunde) {

        this.sekunde += sekunde * 3600;
    }

}
