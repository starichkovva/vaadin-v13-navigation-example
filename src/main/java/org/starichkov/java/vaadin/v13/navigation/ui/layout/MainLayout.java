package org.starichkov.java.vaadin.v13.navigation.ui.layout;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import org.starichkov.java.vaadin.v13.navigation.ui.route.FirstView;
import org.starichkov.java.vaadin.v13.navigation.ui.route.HomeView;
import org.starichkov.java.vaadin.v13.navigation.ui.route.ThirdView;

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

class ViewLayout extends BaseRootLayout implements RouterLayout {

}

@ParentLayout(MainLayout.class)
class MenuBar extends BaseRootLayout {

  MenuBar() {
    // 1. Recommended way from official tutorial
    Button menuButtonFirst = new Button("First");
    menuButtonFirst.addClickListener(e -> menuButtonFirst.getUI().ifPresent(ui -> ui.navigate(FirstView.class)));
    add(menuButtonFirst);

    // same as above, but using @Route(value) string parameter
    Button menuButtonSecond = new Button("Second");
    menuButtonSecond.addClickListener(e -> menuButtonSecond.getUI().ifPresent(ui -> ui.navigate("second")));
    add(menuButtonSecond);

    // 2. Using the RouterLink Component
    add(new RouterLink("Home", HomeView.class));

    // 3. Server-side Navigation

    // found on forum, but not secure, UI.getCurrent() can return null
    Button menuButtonThird = new Button("Third");
    menuButtonThird.addClickListener(e -> UI.getCurrent().navigate(ThirdView.class));
    add(menuButtonThird);
  }
}