package DesignPattern.MVP;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateData(String newData) {
        model.setData(newData);
        view.displayData(model.getData());
    }
}