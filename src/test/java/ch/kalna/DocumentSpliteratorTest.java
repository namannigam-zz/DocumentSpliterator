package ch.kalna;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DocumentSpliteratorTest {

    @Test
    public void testSplitDocuments1() {

        Document front = new Document("front", 2);
        Document doc1 = new Document("doc1", 4);
        Document doc2 = new Document("doc2", 2);
        Document doc3 = new Document("doc3", 6);

        List<Document> docs = new ArrayList<>();
        docs.add(doc1);
        docs.add(doc2);
        docs.add(doc3);

        List<Couvert> couvertList = DocumentSpliterator.splitDocuments(front, docs);
        Assert.assertEquals(3, couvertList.size());
        Assert.assertEquals(2, couvertList.get(0).getDocuments().size());
        Assert.assertEquals(1, couvertList.get(1).getDocuments().size());
        Assert.assertEquals(1, couvertList.get(2).getDocuments().size());
    }

    @Test
    public void testSplitDocuments2() {

        Document front = new Document("front", 2);
        Document doc1 = new Document("doc1", 2);
        Document doc2 = new Document("doc2", 3);
        Document doc3 = new Document("doc3", 6);

        List<Document> docs = new ArrayList<>();
        docs.add(doc1);
        docs.add(doc2);
        docs.add(doc3);

        List<Couvert> couvertList = DocumentSpliterator.splitDocuments(front, docs);
        Assert.assertEquals(2, couvertList.size());
        Assert.assertEquals(3, couvertList.get(0).getDocuments().size());
        Assert.assertEquals(1, couvertList.get(1).getDocuments().size());
    }

    @Test
    public void testSplitDocuments3() {

        Document front = new Document("front", 2);
        Document doc1 = new Document("doc1", 5);
        Document doc2 = new Document("doc2", 5);
        Document doc3 = new Document("doc3", 5);

        List<Document> docs = new ArrayList<>();
        docs.add(doc1);
        docs.add(doc2);
        docs.add(doc3);

        List<Couvert> couvertList = DocumentSpliterator.splitDocuments(front, docs);
        Assert.assertEquals(3, couvertList.size());
        Assert.assertEquals(2, couvertList.get(0).getDocuments().size());
        Assert.assertEquals(1, couvertList.get(1).getDocuments().size());
        Assert.assertEquals(1, couvertList.get(2).getDocuments().size());
    }
}