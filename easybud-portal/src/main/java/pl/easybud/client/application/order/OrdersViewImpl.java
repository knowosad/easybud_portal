package pl.easybud.client.application.order;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialTextArea;

import javax.inject.Inject;

public class OrdersViewImpl extends ViewWithUiHandlers<OrdersView.Handlers> implements OrdersView {

  interface Binder extends UiBinder<Widget, OrdersViewImpl> {


  }
  @UiField
  MaterialTextArea textResult;

  @Inject
  public OrdersViewImpl(OrdersViewImpl.Binder binder) {
    initWidget(binder.createAndBindUi(this));
  }

  @UiHandler("getOrders")
  void getOrders(ClickEvent event) {
    getUiHandlers().getOrders();
  }

  @Override
  public void setContactsField(String message) {
      textResult.setText(message);
  }
}
