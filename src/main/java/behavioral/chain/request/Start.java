package behavioral.chain.request;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Start {

  public static void main(String[] args) {
    // 1. Создаем цепочку обработчиков
    Handler fullHandler =
        new LogHandler(
            new SecurityHandler(
                new CacheHandler()
            )
        );

    Handler partHandler =
        new LogHandler(
            new SecurityHandler()
        );

    Handler logHandler = new LogHandler();

    // 2. Запускам цепочку
    fullHandler.handle();
    partHandler.handle();
    logHandler.handle();
  }
}
