package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLink;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseRootLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@ParentLayout(MainLayout.class)
public class MenuBar extends BaseRootLayout {

  public MenuBar() {
    addMenuElement(HomeView.class, "Home");
    addMenuElement(OneMoreView.class, "One More");
    addMenuElement(AnotherView.class, "Another");
  }

  private void addMenuElement(Class<? extends Component> navigationTarget, String name) {
    add(new RouterLink(name, navigationTarget));
  }
}