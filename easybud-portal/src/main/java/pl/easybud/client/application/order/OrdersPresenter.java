package pl.easybud.client.application.order;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.delegates.client.ResourceDelegate;
import com.gwtplatform.mvp.client.PresenterWidget;
import pl.easybud.client.api.OrdersResource;
import pl.easybud.client.dto.OrderDTO;

import javax.inject.Inject;
import java.util.List;

public class OrdersPresenter extends PresenterWidget<OrdersView> implements OrdersView.Handlers {


  @Inject
  private ResourceDelegate<OrdersResource> ordersResource;

  @Inject
  public OrdersPresenter(EventBus eventBus, OrdersView view) {
    super(eventBus, view);

    getView().setUiHandlers(this);
  }

  @Override
  public void getOrders() {
      ordersResource.withCallback(new AsyncCallback<List<OrderDTO>>() {
        @Override
        public void onFailure(Throwable throwable) {
          getView().setContactsField("getOrders failure");
          GWT.log(throwable.getMessage());

        }

        @Override
        public void onSuccess(List<OrderDTO> orders) {
          getView().setContactsField("getOrders success");

        }
      }).listOrders();
  }

  @Override
  public void addOrder(String label, String name) {
    OrderDTO order = new OrderDTO();
    order.setLabel(label);
    order.setName(name);

    ordersResource.withCallback(new AsyncCallback<OrderDTO>() {
      @Override
      public void onFailure(Throwable throwable) {
        getView().setContactsField("addOrder failure");
        GWT.log(throwable.getMessage());
      }

      @Override
      public void onSuccess(OrderDTO orderDTO) {
        getView().setContactsField("addOrder success");
      }
    }).addOrder(order);
  }

}
