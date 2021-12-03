package edu.isu.cs.cs2263.hw02.views;

import javafx.scene.Node;
import lombok.getter;

public interface IAppView {

    Node getView();

    void initView();

    void updateData();
}
