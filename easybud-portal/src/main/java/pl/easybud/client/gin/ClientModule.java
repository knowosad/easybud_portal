package pl.easybud.client.gin;

import pl.easybud.client.application.LayoutModule;
import pl.easybud.client.place.NameTokens;
import pl.easybud.client.resources.ResourceLoader;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule
                .Builder()
                .defaultPlace(NameTokens.HOME)
                .errorPlace(NameTokens.HOME)
                .unauthorizedPlace(NameTokens.HOME)
                .build());
        install(new LayoutModule());

        bind(ResourceLoader.class).asEagerSingleton();
    }
}
