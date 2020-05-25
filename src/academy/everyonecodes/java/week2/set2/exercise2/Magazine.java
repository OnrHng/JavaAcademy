package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

import java.util.List;

public class Magazine {
    private String title;
    private List<Article> articleList;

    public Magazine(String title, List<Article> articleList) {
        this.title = title;
        this.articleList = articleList;
    }

    public String getTitle() {
        return title;
    }

    public List<Article> getArticleList() {
        return articleList;
    }
}
