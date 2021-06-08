public enum Sort {
    Дороже("Дороже", 3),
    Дешевле("Дешевле", 2),
    По_умолчанию("По умолчанию", 1),
    По_дате("По дате",4);


    public String type;
    public int id;

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    Sort(String type, int id) {
        this.type = type;
        this.id = id;
    }
}
