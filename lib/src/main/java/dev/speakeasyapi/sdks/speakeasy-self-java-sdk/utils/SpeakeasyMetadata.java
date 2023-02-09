package dev.speakeasyapi.sdks.speakeasy-self-java-sdk.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SpeakeasyMetadata {
    public String value() default "";
}
