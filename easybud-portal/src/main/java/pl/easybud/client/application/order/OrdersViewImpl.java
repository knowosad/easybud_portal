package pl.easybud.client.application.order;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;

import javax.inject.Inject;

public class OrdersViewImpl extends ViewWithUiHandlers<OrdersView.Handlers> implements OrdersView {

  interface Binder extends UiBinder<Widget, OrdersViewImpl> {


  }
  @UiField
  MaterialTextArea textResult;

  @UiField
  MaterialTextBox orderLabel;

  @UiField
  MaterialTextBox orderName;

//  @UiField
//  MaterialDataTable<OrderDTO> table;

  @Inject
  public OrdersViewImpl(OrdersViewImpl.Binder binder) {
    initWidget(binder.createAndBindUi(this));
//    table.addAttachHandler(attachEvent -> initTable());
  }

//  private void initTable() {
////    table.setDataSource(getUiHandlers().getDataSource());
//    appendTableColumn();
//
//  }

//  private void appendTableColumn() {
//      table.addColumn("Label", new TextColumn<>());
//      table.addColumn("Name", new TextColumn<>());
//  }

  @UiHandler("getOrders")
  void getOrders(ClickEvent event) {
    getUiHandlers().getOrders();
  }

  @Override
  public void setContactsField(String message) {
      textResult.setText(message);
  }

  @UiHandler("addOrder")
  void addOrder(ClickEvent event) {
    getUiHandlers().addOrder(orderLabel.getText(), orderName.getText());
  }
}
