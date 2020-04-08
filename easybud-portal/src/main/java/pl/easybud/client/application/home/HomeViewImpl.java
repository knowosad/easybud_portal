package pl.easybud.client.application.home;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialContainer;

public class HomeViewImpl extends ViewWithUiHandlers<HomeView.Handlers> implements HomeView {

    interface Binder extends UiBinder<Widget, HomeViewImpl> {
    }

    @UiField
    MaterialContainer tableContainer;

    @Inject
    HomeViewImpl(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        bindSlot(HomePresenter.SLOT_ORDERS, tableContainer);
    }
}
