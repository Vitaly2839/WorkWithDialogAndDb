import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Представление (View) отвечает за отображение данных модели пользователю, реагируя на изменения модели
public class View extends JFrame implements ActionListener {
    private Controller controller;
    // private JFrame jFrame;
    //  private JMenuBar jMenuBar;
    private JMenu jMenu;

    public void setController(Controller controller) {
        this.controller = controller;

    }

    public void initGui() {

        initWindow();
        initMenuBar();
        setVisible(true); // Отобразить диалог


    }

    public void initWindow() {
        int length = 400;
        int width = 300;
        // jFrame = new JFrame("Window");

//        jFrame.setSize(length, width); //Длина, ширина
//        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); //Обработка нажатия пользователем на крестик
//        jFrame.setVisible(true); // Отобразить диалог
        setTitle("Window"); //Title окна
        setBounds(100, 200, 1000, 10000); //1-вправо 2 - вниз 3 - ширина 4- высота
        setSize(length, width); //Длина, ширина
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Обработка нажатия пользователем на крестик
    }

    public void initMenuBar() {
        //Создавать новый объект типа JMenuBar. Это и будет наша панель меню
        JMenuBar jMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Тест");

        jMenuBar.add(fileMenu);
        JMenuItem jMenuItemConnectionBd = new JMenuItem("Соединение с БД");
        jMenuItemConnectionBd.setActionCommand("ConnectionWithBd"); // установив значение, соответствующее каждой команде
        jMenuItemConnectionBd.addActionListener(this); //
        fileMenu.add(jMenuItemConnectionBd);
//        fileMenu.add("Соединение с БД");
        fileMenu.add("Новый тест");
        fileMenu.add("Добавить вопрос");
        fileMenu.add("Закачать вопрос из файла");
        fileMenu.add("Удалить вопрос");
        fileMenu.add("Удалить все вопросы");
        fileMenu.add("Выход");

//        jMenu = new JMenu();
//        jMenu.add("Menu");
//        jMenu.setVisible(true);
//        jMenuBar = new JMenuBar();
//        jMenuBar.add(jMenu);
//        jMenuBar.setVisible(true);
        //Добавлять в верхнюю часть панели контента текущего фрейма нашу панель меню, аналогично тому, как это мы делали с панелью вкладок
        getContentPane().add(jMenuBar, BorderLayout.NORTH); //BorderLayout.NORTH -север, верхняя панель
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //Получи из события команду с помощью метода getActionCommand(). Это будет обычная строка.
        //По этой строке ты можешь понять какой пункт меню создал данное событие.

        String command = actionEvent.getActionCommand();

        switch (command) {
            case "ConnectionWithBd":
                setSize(10, 10);
                break;
            default:
                break;
        }

    }
}

