package com.example.prometheusdemo.util;

import io.micrometer.core.instrument.Metrics;

public class MetricsUtil {

    public static void incrementSayHiRequestCounter(String name) {
        Metrics.counter("get_user_say_hi_request",
                "_namespace_", "prometheusDemo", "who", name).increment();
    }
}
