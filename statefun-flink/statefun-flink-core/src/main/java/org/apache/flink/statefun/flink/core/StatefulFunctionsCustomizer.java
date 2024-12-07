package org.apache.flink.statefun.flink.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.flink.annotation.VisibleForTesting;

public class StatefulFunctionsCustomizer implements Serializable {

  private static final long serialVersionUID = 1L;

  @Nullable public final Supplier<Map<String, List<String>>> extraHeadersSupplier;

  @VisibleForTesting
  public StatefulFunctionsCustomizer(
      @Nullable Supplier<Map<String, List<String>>> extraHeadersSupplier) {
    this.extraHeadersSupplier = extraHeadersSupplier;
  }
}
