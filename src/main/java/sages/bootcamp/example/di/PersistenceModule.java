package sages.bootcamp.example.di;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

public class PersistenceModule extends AbstractModule {
  @Override
  protected void configure() {
  }

  @Singleton
  @Provides
  public DSLContext createDslContext() {
    return DSL.using(
        "jdbc:postgresql://localhost:5432/postgres",
        "postgres",
        "postgres"
    );
  }
}
