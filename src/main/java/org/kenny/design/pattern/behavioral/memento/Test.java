package org.kenny.design.pattern.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("Kenny Design Pattern A", "notes content A", "content photo link url A");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("Title: " + article.getTitle() + " content: " + article.getContent() + " imgs: " + article.getImgs() + " took a snapshot successfully");
        System.out.println("Comprehensive article info.: " + article);

        System.out.println("---Start to amend article---");

        article.setTitle("Kenny Design Pattern Advanced Course");
        article.setContent("notes content Advanced Course");
        article.setImgs("content photo link url Advanced Course");

        System.out.println("---End of amend article---");

        System.out.println("finished article");

        System.out.println("Comprehensive article info.: " + article);
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);


        article.setTitle("Kenny Design Pattern Super Advanced Course");
        article.setContent("notes contentSuper Super Advanced Course");
        article.setImgs("content photo link url Super Advanced Course");

        System.out.println("go back to snapshot");

        System.out.println("pop out from stack 1");
        articleMemento = articleMementoManager.getMemento();
        System.out.println("articleMemento: " +articleMemento);

        article.undoFromMemento(articleMemento);
        System.out.println(article);

        System.out.println("pop out from stack 2");
        articleMemento = articleMementoManager.getMemento();
        System.out.println("articleMemento: " +articleMemento);

        article.undoFromMemento(articleMemento);
        System.out.println(article);

    }
}
