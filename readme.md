# Integration using Apache Camel and Quarkus

## Purpose
Integrate Apache Camel with Quarkus for a lightweight integration.

## Version
- Java 21
- Quarkus 3.20.1
- Apache Camel 4.10.2 

## Quarkus Java Apps

### Build
```shell
$ podman build -f Dockerfile.jvm -t apache-camel-quarkus-hello-world-jvm .
```

### Run
```
$ podman run -p 8080:8080 apache-camel-quarkus-hello-world-jvm

INFO exec -a "java" java -XX:MaxRAMPercentage=80.0 -XX:+UseShenandoahGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:+ExitOnOutOfMemoryError -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -cp "." -jar /deployments/quarkus-run.jar
INFO running in /deployments
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2025-08-11 11:26:50,549 INFO  [io.haw.HawtioContextListener] (main) Initialising Hawtio services
2025-08-11 11:26:50,836 INFO  [io.haw.jmx.JmxTreeWatcher] (main) Welcome to Hawtio 4.2.0.redhat-00034
2025-08-11 11:26:50,856 INFO  [io.haw.web.aut.AuthenticationConfiguration] (main) Authentication throttling is enabled
2025-08-11 11:26:50,946 INFO  [io.haw.web.aut.AuthenticationConfiguration] (main) Starting hawtio authentication filter, JAAS authentication disabled
2025-08-11 11:26:51,215 INFO  [io.haw.web.aut.ClientRouteRedirectFilter] (main) Hawtio ClientRouteRedirectFilter is using 1800 sec. HttpSession timeout
2025-08-11 11:26:52,394 INFO  [org.apa.cam.qua.cor.CamelBootstrapRecorder] (main) Apache Camel Quarkus 3.20.0.redhat-00003 is starting
2025-08-11 11:26:52,396 INFO  [org.apa.cam.mai.MainSupport] (main) Apache Camel (Main) 4.10.3.redhat-00022 is starting
2025-08-11 11:26:52,642 INFO  [org.apa.cam.mai.BaseMainSupport] (main) Auto-configuration summary
2025-08-11 11:26:52,643 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.main.routesIncludePattern = camel/hello-world.camel.yaml
2025-08-11 11:26:52,643 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.context.name = apache-camel-quarkus-hello-world
2025-08-11 11:26:53,287 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 4.10.3.redhat-00022 (apache-camel-quarkus-hello-world) is starting
2025-08-11 11:26:53,612 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Using ThreadPoolFactory: org.apache.camel.opentelemetry.OpenTelemetryInstrumentedThreadPoolFactory@107ed6fc
2025-08-11 11:26:53,731 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Routes startup (total:1)
2025-08-11 11:26:53,731 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main)     Started route-3964 (rest://get:/)
2025-08-11 11:26:53,732 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 4.10.3.redhat-00022 (apache-camel-quarkus-hello-world) started in 444ms (build:0ms init:0ms start:444ms boot:3s600ms)
2025-08-11 11:26:53,878 INFO  [io.quarkus] (main) camel-quarkus-kaoto 1.0 on JVM (powered by Quarkus 3.20.1.redhat-00003) started in 4.990s. Listening on: http://0.0.0.0:8080
2025-08-11 11:26:53,879 INFO  [io.quarkus] (main) Profile prod activated.
2025-08-11 11:26:53,879 INFO  [io.quarkus] (main) Installed features: [camel-attachments, camel-core, camel-jackson, camel-management, camel-micrometer, camel-microprofile-health, camel-observability-services, camel-opentelemetry, camel-platform-http, camel-rest, camel-xml-io-dsl, camel-yaml-dsl, cdi, hawtio, micrometer, opentelemetry, servlet, smallrye-context-propagation, smallrye-health, vertx]
```

## Quarkus Native Apps

### Build
```shell
$ podman build -f Dockerfile.multistage -t apache-camel-quarkus-hello-world-native .
```

### Run
```
$ podman run -p 8080:8080 apache-camel-quarkus-hello-world-native

 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2025-08-11 13:50:00,482 INFO  [org.apa.cam.qua.cor.CamelBootstrapRecorder] (main) Apache Camel Quarkus 3.20.0.redhat-00003 is starting
2025-08-11 13:50:00,482 INFO  [org.apa.cam.mai.MainSupport] (main) Apache Camel (Main) 4.10.3.redhat-00022 is starting
2025-08-11 13:50:00,486 INFO  [org.apa.cam.mai.BaseMainSupport] (main) Auto-configuration summary
2025-08-11 13:50:00,486 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.main.routesIncludePattern = camel/hello-world.camel.yaml
2025-08-11 13:50:00,486 INFO  [org.apa.cam.mai.BaseMainSupport] (main)     [MicroProfilePropertiesSource] camel.context.name = apache-camel-quarkus-hello-world
2025-08-11 13:50:00,491 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 4.10.3.redhat-00022 (apache-camel-quarkus-hello-world) is starting
2025-08-11 13:50:00,529 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Using ThreadPoolFactory: org.apache.camel.opentelemetry.OpenTelemetryInstrumentedThreadPoolFactory@63f2e0b
2025-08-11 13:50:00,548 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Routes startup (total:1)
2025-08-11 13:50:00,548 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main)     Started route-3964 (rest://get:/)
2025-08-11 13:50:00,549 INFO  [org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 4.10.3.redhat-00022 (apache-camel-quarkus-hello-world) started in 57ms (build:0ms init:0ms start:57ms)
2025-08-11 13:50:00,551 INFO  [io.quarkus] (main) camel-quarkus-kaoto 1.0 native (powered by Quarkus 3.20.1.redhat-00003) started in 0.114s. Listening on: http://0.0.0.0:8080
2025-08-11 13:50:00,551 INFO  [io.quarkus] (main) Profile prod activated.
2025-08-11 13:50:00,551 INFO  [io.quarkus] (main) Installed features: [camel-attachments, camel-core, camel-jackson, camel-management, camel-micrometer, camel-microprofile-health, camel-observability-services, camel-opentelemetry, camel-platform-http, camel-rest, camel-xml-io-dsl, camel-yaml-dsl, cdi, micrometer, opentelemetry, smallrye-context-propagation, smallrye-health, vertx]

```