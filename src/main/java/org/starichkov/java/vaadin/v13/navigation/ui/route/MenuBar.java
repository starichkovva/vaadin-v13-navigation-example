package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLink;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseRootLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

@ParentLayout(MainLayout.class)
public class MenuBar extends BaseRootLayout {

  public MenuBar() {
    // 1. Using the RouterLink Component
    add(new RouterLink("Home", HomeView.class));

    // 2. Server-side Navigation

    // found on forum, but not secure, UI.getCurrent() can return null
    Button menuButtonOneMore = new Button("One More");
    menuButtonOneMore.addClickListener(e -> UI.getCurrent().navigate(OneMoreView.class));
    add(menuButtonOneMore);

    // recommended way from official tutorial
    Button menuButtonAnother = new Button("Another");
    //menuButtonAnother.addClickListener(e -> menuButtonAnother.getUI().ifPresent(ui -> ui.navigate("another")));
    menuButtonAnother.addClickListener(e -> menuButtonAnother.getUI().ifPresent(ui -> ui.navigate(AnotherView.class)));
    add(menuButtonAnother);
  }
}