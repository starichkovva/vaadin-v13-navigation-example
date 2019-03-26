package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseComponentLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@PageTitle("Second View")
@Route(value = "second", layout = MainLayout.class)
public class SecondView extends BaseComponentLayout {

  public SecondView() {
    getStyle().set("background-color", "yellow");
  }
}
