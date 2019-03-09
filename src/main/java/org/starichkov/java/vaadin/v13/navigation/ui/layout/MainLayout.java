package org.starichkov.java.vaadin.v13.navigation.ui.layout;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.RouterLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.route.MenuBar;

public class MainLayout extends FlexLayout implements RouterLayout {

  private final ViewLayout viewLayout;

  public MainLayout() {
    setWrapMode(WrapMode.NOWRAP);

    MenuBar menuBar = new MenuBar();
    add(menuBar);
    menuBar.setHeightFull();

    viewLayout = new ViewLayout();
    add(viewLayout);
    viewLayout.setHeightFull();

    setFlexGrow(1.0, menuBar);
    setFlexGrow(4.0, viewLayout);

    setHeightFull();
  }

  @Override
  public void showRouterLayoutContent(HasElement content) {
    viewLayout.showRouterLayoutContent(content);
  }
}
