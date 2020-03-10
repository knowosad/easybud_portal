package pl.easybud.client.application;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialColumn;

public class LayoutViewImpl extends ViewWithUiHandlers<LayoutView.Handlers> implements LayoutView {

    interface Binder extends UiBinder<Widget, LayoutViewImpl> {
    }

    @UiField
    MaterialColumn content;

    @Inject
    LayoutViewImpl(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        bindSlot(LayoutPresenter.SLOT_CONTENT, content);
    }
}