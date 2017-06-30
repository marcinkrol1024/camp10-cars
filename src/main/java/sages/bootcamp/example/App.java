package sages.bootcamp.example;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.jooq.DSLContext;
import sages.bootcamp.example.di.PersistenceModule;
import sages.bootcamp.example.jooq.Tables;

public class App {

  private final DSLContext dslContext;

  @Inject
  public App(DSLContext dslContext) {
    this.dslContext = dslContext;
  }

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new PersistenceModule()
    );
    App app = injector.getInstance(App.class);
    app.run();
  }

  public void run() {
    dslContext
        .deleteFrom(Tables.CARS)
        .execute();

    dslContext
        .insertInto(Tables.CARS, Tables.CARS.MODEL)
        .values("renault")
        .execute();

    dslContext
        .selectFrom(Tables.CARS)
        .fetch()
        .forEach(car -> System.out.println(car.getModel()));
  }
}
