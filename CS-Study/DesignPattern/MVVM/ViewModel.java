package DesignPattern.MVVM;

/*
1) 모델로부터 데이터를 가져와 뷰에 매핑시키고, 뷰에서 발생한 이벤트 처리
2) 데이터 바인딩을 통해 뷰와 바인딩되어 데이터의 변화를 자동으로 감지하고 업데이트 처리
**/
public class ViewModel {
    private Model model;

    public ViewModel(Model model) {
        this.model = model;
        this.model.addPropertyChangeListener(evt -> updateView(model.getData()));
    }

    public void updateView(String data) {
        System.out.println("View: " + data);
    }

    public void updateModel(String newData) {
        model.setData(newData);
    }
}