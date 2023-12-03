package DesignPattern.MVVM;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {
    private String data;

    // 데이터 변경 감지하고, 변경이 있을 때 ViewModel에 알리는 메커니즘 제공
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        pcs.firePropertyChange("data", oldData, data);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
}