package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseComponentLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@PageTitle("First View")
@Route(value = "first", layout = MainLayout.class)
public class FirstView extends BaseComponentLayout {

  public FirstView() {
    getStyle().set("background-color", "red");
  }
}
