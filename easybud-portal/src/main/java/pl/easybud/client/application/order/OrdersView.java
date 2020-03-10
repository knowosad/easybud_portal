package pl.easybud.client.application.order;

import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.UiHandlers;
import com.gwtplatform.mvp.client.View;

public interface OrdersView extends View, HasUiHandlers<OrdersView.Handlers> {

  void setContactsField(String textResult);

  interface Handlers extends UiHandlers {
    void getOrders();

  }
}
