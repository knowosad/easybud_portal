package pl.easybud.client.application;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;

public class LayoutPresenter
        extends Presenter<LayoutView, LayoutPresenter.LayoutProxy> implements LayoutView.Handlers{

    @ProxyStandard
    interface LayoutProxy extends Proxy<LayoutPresenter> {
    }

    public static final NestedSlot SLOT_MAIN = new NestedSlot();

    @Inject
    LayoutPresenter(
            EventBus eventBus,
            LayoutView view,
            LayoutProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
    }
}
