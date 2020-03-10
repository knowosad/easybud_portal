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
  public OrdersPresenter(EventBus eventBus, OrdersView view) {
    super(eventBus, view);

    getView().setUiHandlers(this);
  }

  @Inject
  private ResourceDelegate<OrdersResource> ordersResource;

  @Override
  public void getOrders() {
      ordersResource.withCallback(new AsyncCallback<List<OrderDTO>>() {
        @Override
        public void onFailure(Throwable throwable) {
          getView().setContactsField("ResourceDelegate failure");
          GWT.log(throwable.getMessage());

        }

        @Override
        public void onSuccess(List<OrderDTO> orders) {
          getView().setContactsField("ResourceDelegate success");

        }
      }).listOrders();
  }
}
