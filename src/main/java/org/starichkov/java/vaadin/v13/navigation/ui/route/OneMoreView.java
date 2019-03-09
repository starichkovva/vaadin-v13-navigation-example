package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseComponentLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@PageTitle("One More View")
@Route(value = "one-more", layout = MainLayout.class)
public class OneMoreView extends BaseComponentLayout {

  public OneMoreView() {
    getStyle().set("background-color", "yellow");
  }
}
