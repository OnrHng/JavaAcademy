package academy.everyonecodes.java.week9.optionalExceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatBotTest {

    @Test
    void handle() {

    assertThrows(WrongFirstArgumentException.class, () -> {
        ChatBot bot = new ChatBot();
        bot.handle("bla", "aaa");
        });
    }

    @Test
    void handleForSecondArg() {
        assertThrows(WrongSecondArgumentException.class, () -> {
            ChatBot bot = new ChatBot();
            bot.handle("lights", "aaa");
        });
    }

    @Test
    void handleWithoutException() {
        assertDoesNotThrow( () -> {
            ChatBot bot = new ChatBot();
            bot.handle("lights", "on");
        });
    }
}
