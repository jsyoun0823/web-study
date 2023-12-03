package DesignPattern.MVP;

public class MVPPatternExample {
    public static void main(String[] args) {
        Model model = new Model();

        // Creating a View implementation
        View view = new View() {
            @Override
            public void displayData(String data) {
                System.out.println("View: " + data);
            }
        };

        Presenter presenter = new Presenter(model, view);

        presenter.updateData("MVP Pattern Example");
    }
}