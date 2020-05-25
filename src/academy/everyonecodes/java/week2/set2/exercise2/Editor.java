package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

import java.util.List;

public class Editor {
    public Magazine writeMagazine(){
        Article article1 = new Article("Baby Turtles", "In March, thousands of sea turtles come to a beach in eastern India." +
                "\n" + " They lay eggs in the sand. One and a half months later, the small baby turtles come out from the sand. They want to get to the sea. They know where the sea is." +
                "\n" + "However, it is a dangerous way. Some animals and birds wait for this special moment. They want to eat the baby turtles. Many turtles do not get to the sea." +
                "\n" + "This kind of turtle has a green shell. It is the smallest sea turtle. It lives in tropical oceans." +
                "\n" + "In the past, people kill this turtle. People eat turtle meat. They use its skin, too." +
                "\n" + "Now, there are rules. People must not kill too many turtles. Some people do illegal business with turtle eggs.");
        Article article2 = new Article("The Coronavirus App", "Companies Apple and Google make a special software. It helps stop the coronavirus." +
                "\n" + " People install an app in their phones. The app sends a message when someone meets a person with the coronavirus.");
        Article article3 = new Article("Fake Fans", "The baseball league starts in South Korea. It starts later than is usual." +
                "\n" + " The coronavirus makes the start of the league happen later. Officials make hard rules.");
        List<Article> articleList = List.of(article1, article2, article3);

    return new Magazine("TIME IN AUSTRIA", articleList);
    }
}
