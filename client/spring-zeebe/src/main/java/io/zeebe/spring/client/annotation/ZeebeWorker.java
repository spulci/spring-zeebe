package io.zeebe.spring.client.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ZeebeWorker {

  String type();

  String name() default "${zeebe.worker.name}";

  long timeout() default 10000L;

  int maxJobsActive() default 2; // FIXME: DEFAULT_TASK_FETCH_SIZE
}
