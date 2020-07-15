package academy.everyonecodes.java.week9.optionalExceptions;

import java.util.Scanner;

public class ChatBotApp {
    public static void main(String[] args)  {
        System.out.println("Hi Hansel! What do you want from me to do ? ");
        Scanner scanner = new Scanner(System.in);
        String arguments = scanner.nextLine();
        arguments = arguments.toLowerCase().trim();
        String[] argArr = arguments.split(" ");

        ChatBot bot = new ChatBot();
        try {
            bot.handle(argArr[0], argArr[1]);
        } catch (WrongFirstArgumentException | WrongSecondArgumentException e) {
            e.printStackTrace();
        }
    }
}
