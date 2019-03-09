package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseComponentLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@PageTitle("Another View")
@Route(value = "another", layout = MainLayout.class)
public class AnotherView extends BaseComponentLayout {

  public AnotherView() {
    getStyle().set("background-color", "red");
  }
}
