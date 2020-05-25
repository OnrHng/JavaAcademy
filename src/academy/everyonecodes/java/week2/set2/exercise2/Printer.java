package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

public class Printer {
    public void print(Magazine magazine){
        System.out.println( magazine.getTitle() + " MAGAZINE ");
        System.out.println("----Our articles------- ");
        for (Article article : magazine.getArticleList()) {
            System.out.println(article.getTitle());
            System.out.println(article.getText());
            System.out.println("-----------------o----------------");
        }
    }
}
