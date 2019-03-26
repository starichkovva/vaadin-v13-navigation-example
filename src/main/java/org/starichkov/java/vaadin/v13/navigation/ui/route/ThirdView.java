package org.starichkov.java.vaadin.v13.navigation.ui.route;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.BaseComponentLayout;
import org.starichkov.java.vaadin.v13.navigation.ui.layout.MainLayout;

/**
 * @author Vadim Starichkov
 * @since 26.03.2019 14:58
 */
@PageTitle("Third View")
@Route(value = "third", layout = MainLayout.class)
public class ThirdView extends BaseComponentLayout {

  public ThirdView() {
    getStyle().set("background-color", "green");
  }
}
