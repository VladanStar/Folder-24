package javamt0201;

class Put {

    private double metri;

    private Put() {
    }

    private Put(double metri) {
        this.metri = metri;
    }

    public static Put fromMeters(double metri) {
        return new Put(metri);

    }

    public static Put fromKilometers(double kilometri) {
        return new Put(kilometri * 1000.0);

    }

    public double toMeters() {
        return this.metri;
    }

    public double toKilometers() {

        return this.metri / 1000.0;
    }

    public void addMeters(double metara) {
        this.metri += metara;
    }

    public void addKilometers(double kilometara) {

        this.metri += kilometara * 1000;
    }

}
