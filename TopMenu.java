import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TopMenu {
    List<TopMenuElement> elements = new ArrayList<TopMenuElement>();

    JMenuBar menuBar = new JMenuBar();

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public TopMenu() {
        // Создаем вкладку создания файлов
        TopMenuElement createNewFile = new TopMenuElement(0, 4);
        createNewFile.CreateMenuElement(new String("Создание файлов"),
                new String[] {},
                new String[] { "Формат TXT", "Формат World", "Формат Excel", "Формат CSV" });
        elements.add(createNewFile);

        TopMenuElement openFile = new TopMenuElement(4, 3);
        openFile.CreateMenuElement(new String("Работа с файлами"),
                new String[] { "Формат TXT", "Формат World", "Формат Excel", "Формат CSV" },
                new String[] { "Записать в файл", "Дописать в файл", "Чтение из файла" });
        elements.add(openFile);

        TopMenuElement showReports = new TopMenuElement(0, 0);
        showReports.CreateMenuElement(new String("Отчёты"), new String[] {}, new String[] {});
        elements.add(showReports);

        TopMenuElement options = new TopMenuElement(0, 4);
        options.CreateMenuElement("Администрирование",
                new String[] {},
                new String[] { "Настройки", "Пользователи", "Создание архива", "Восстановление из архива" });
        elements.add(options);

        TopMenuElement exit = new TopMenuElement(0, 0);
        exit.CreateMenuElement(new String("Выход"), new String[] {}, new String[] {});
        elements.add(exit);

        for (TopMenuElement topMenuElement : elements) {
            System.out.println(topMenuElement.toString());
            menuBar.add(topMenuElement.getjMenu());
        }
    }
}
