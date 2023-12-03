package DesignPattern.MVC;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateData(String newData) {
        model.setData(newData);
        view.displayData(model.getData());
    }
}