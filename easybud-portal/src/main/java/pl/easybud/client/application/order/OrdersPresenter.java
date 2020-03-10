package pl.easybud.client.application.order;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;

import javax.inject.Inject;

public class OrdersPresenter extends PresenterWidget<OrdersView> implements OrdersView.Handlers {

  @Inject
  public OrdersPresenter(EventBus eventBus, OrdersView view) {
    super(eventBus, view);

    getView().setUiHandlers(this);
  }
}
