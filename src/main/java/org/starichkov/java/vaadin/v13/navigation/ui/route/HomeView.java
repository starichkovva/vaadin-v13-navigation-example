package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseComponentLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@PageTitle("Home Page")
@Route(value = "", layout = MainLayout.class)
public class HomeView extends BaseComponentLayout {

  public HomeView() {
    add(new Label("Home page"));
    getStyle().set("background-color", "blue");
  }
}
