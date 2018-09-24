//Всем управляет
//Контроллер (Controller) интерпретирует действия пользователя, оповещая модель о необходимости изменений
public class Controller {
    private View view;
    private Model model;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {
        //Создавать объект представления
        View view = new View();
        //Создавать контроллер, используя представление
        Controller controller = new Controller(view);
        //Устанавливать у представления контроллер
        view.setController(controller);
        view.initGui();

    }

    //Выполнение отсюда
    //Берем данные
    void execute() {

    }
}
