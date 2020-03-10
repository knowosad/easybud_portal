package pl.easybud.client.application;

import pl.easybud.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import pl.easybud.client.application.order.OrdersModule;

public class LayoutModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());
        install(new OrdersModule());

        bindPresenter(LayoutPresenter.class, LayoutView.class, LayoutViewImpl.class,
                LayoutPresenter.LayoutProxy.class);
    }
}
