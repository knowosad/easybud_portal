package pl.easybud.client.application;

import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.UiHandlers;
import com.gwtplatform.mvp.client.View;

public interface LayoutView extends View, HasUiHandlers<LayoutView.Handlers> {

  interface Handlers extends UiHandlers {
  }
}
