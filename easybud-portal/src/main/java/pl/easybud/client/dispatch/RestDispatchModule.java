package pl.easybud.client.dispatch;

import com.google.gwt.inject.client.AbstractGinModule;
import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.dispatch.rest.client.gin.RestDispatchAsyncModule;

public class RestDispatchModule extends AbstractGinModule {

  @Override
  protected void configure() {
    //    RestDispatchAsyncModule.Builder dispatchBuilder = new RestDispatchAsyncModule.Builder();
    //    install(dispatchBuilder.build());

//    install(new RestDispatchAsyncModule.Builder().core().headerFactory(AuthHeaderFactory.class).build());

    install(new RestDispatchAsyncModule());

    bindConstant().annotatedWith(RestApplicationPath.class).to("http://127.0.0.1:8080");
  }
}
