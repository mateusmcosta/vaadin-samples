package com.rhcloud.balerion.view;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created by HP on 10/10/2015.
 */
public class MyVaadinApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new Label("HELLO world!"));
    }
}
