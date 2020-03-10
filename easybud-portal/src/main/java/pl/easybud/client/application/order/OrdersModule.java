package pl.easybud.client.application.order;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class OrdersModule extends AbstractPresenterModule {

  @Override
  protected void configure() {

    bindPresenterWidget(OrdersPresenter.class, OrdersView.class, OrdersViewImpl.class);
  }
}
