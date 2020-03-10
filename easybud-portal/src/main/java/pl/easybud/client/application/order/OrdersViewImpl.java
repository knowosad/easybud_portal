package pl.easybud.client.application.order;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;

public class OrdersViewImpl extends ViewWithUiHandlers<OrdersView.Handlers> implements OrdersView {

  interface Binder extends UiBinder<Widget, OrdersViewImpl> {

  }

  @Inject
  public OrdersViewImpl(OrdersViewImpl.Binder binder) {
    initWidget(binder.createAndBindUi(this));
  }
}
