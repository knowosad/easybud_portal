package pl.easybud.client.application.home;

import com.gwtplatform.mvp.client.presenter.slots.PermanentSlot;
import pl.easybud.client.application.LayoutPresenter;
import pl.easybud.client.application.order.OrdersPresenter;
import pl.easybud.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class HomePresenter extends Presenter<HomeView, HomePresenter.HomeProxy> implements HomeView.Handlers {

    @ProxyStandard
    @NameToken(NameTokens.HOME)
    interface HomeProxy extends ProxyPlace<HomePresenter> {
    }

    public static final PermanentSlot<OrdersPresenter> SLOT_ORDERS = new PermanentSlot<>();

    private OrdersPresenter ordersPresenter;

    @Inject
    HomePresenter(EventBus eventBus, HomeView view, HomeProxy proxy, OrdersPresenter ordersPresenter) {
        super(eventBus, view, proxy, LayoutPresenter.SLOT_CONTENT);
        getView().setUiHandlers(this);

        this.ordersPresenter = ordersPresenter;
    }

    @Override
    protected void onBind() {
        super.onBind();

        setInSlot(SLOT_ORDERS, ordersPresenter);
    }
}
