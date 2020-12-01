package ch.kalna;

import java.util.ArrayList;
import java.util.List;

public class DocumentSpliterator {

    private static final int MAX = 7;

    public static List<Couvert> splitDocuments(Document front, List<Document> docs) {

        List<Couvert> couvertList = new ArrayList<>();

        Couvert couvert = new Couvert();
        couvert.getDocuments().add(front);

        int pageCount = front.getLength();
        for(Document document : docs) {
            int pageCountDoc = document.getLength();
            if(pageCount + pageCountDoc <= MAX) {
                couvert.getDocuments().add(document);
                pageCount+=pageCountDoc;
            } else {
                couvertList.add(couvert);
                couvert = new Couvert();
                couvert.getDocuments().add(document);
                pageCount = pageCountDoc;
            }
        }
        couvertList.add(couvert);

        return couvertList;
    }
}

