package ch.kalna;

import java.util.ArrayList;
import java.util.List;

class Couvert {

    private final List<Document> documents = new ArrayList<>();

    public List<Document> getDocuments() {
        return documents;
    }

    @Override
    public String toString() {
        return "ch.kalna.Couvert{" +
                "documents=" + documents +
                '}';
    }
}
