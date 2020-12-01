package ch.kalna;

class Document {

    private final String id;
    private final int length;

    public Document(String id, int length) {
        this.id = id;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "ch.kalna.Document{" +
                "id='" + id + '\'' +
                ", length=" + length +
                '}';
    }
}
