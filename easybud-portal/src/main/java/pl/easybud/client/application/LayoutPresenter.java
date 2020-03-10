package pl.easybud.client.application;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.presenter.slots.PermanentSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
import pl.easybud.client.application.home.HomePresenter;
import pl.easybud.client.place.NameTokens;

public class LayoutPresenter
        extends Presenter<LayoutView, LayoutPresenter.LayoutProxy> implements LayoutView.Handlers{

    @ProxyCodeSplit
    @NameToken(NameTokens.HOME)
    interface LayoutProxy extends Proxy<LayoutPresenter> {
    }

    public static final NestedSlot SLOT_CONTENT = new NestedSlot();


    @Inject
    LayoutPresenter(EventBus eventBus, LayoutView view, LayoutProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);

        view.setUiHandlers(this);
    }

}
