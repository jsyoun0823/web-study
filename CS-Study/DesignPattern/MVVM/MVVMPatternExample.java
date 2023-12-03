package DesignPattern.MVVM;

public class MVVMPatternExample {
    public static void main(String[] args) {
        Model model = new Model();
        ViewModel viewModel = new ViewModel(model);

        // ViewMModel의 메서드를 호출해서 데이터를 업데이트 하면, 이벤트가 발생하고 이에 의해 뷰모델이 모델을 업데이트하고 뷰에 알린다.
        viewModel.updateModel("MVVM Pattern Example");
    }
}