/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.routing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.test.Helpers;

public class DependencyInjectedRoutingDslTest extends AbstractRoutingDslTest {

  private static Application app;

  @BeforeClass
  public static void startApp() {
    app = new GuiceApplicationBuilder().build();
    Helpers.start(app);
  }

  @Override
  Application application() {
    return app;
  }

  @Override
  RoutingDsl routingDsl() {
    return app.injector().instanceOf(RoutingDsl.class);
  }

  @AfterClass
  public static void stopApp() {
    Helpers.stop(app);
  }
}
