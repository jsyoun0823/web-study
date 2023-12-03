package DesignPattern.MVC;

public class MVCPatternExample {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateData("MVC Pattern Example");
    }
}