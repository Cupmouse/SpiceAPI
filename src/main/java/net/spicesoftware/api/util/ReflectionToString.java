package net.spicesoftware.api.util;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @since 2015/11/19
 */
public final class ReflectionToString {

    private ReflectionToString() {
    }

    public static <T> String rts(T t) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t.getClass().getName()).append('{');

        List<Field> fields = ReflectionUtil.getFieldsIncludeSuperClasses(t.getClass());

        boolean processedFirstEntry = false;

        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            ToString annotation = field.getDeclaredAnnotation(ToString.class);

            if (annotation != null) {
                if (processedFirstEntry) {
                    stringBuilder.append(", ");
                }

                String fieldName = annotation.value().isEmpty() ? field.getName() : annotation.value();
                stringBuilder.append(fieldName).append('=');

                try {
                    stringBuilder.append(field.get(t));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                processedFirstEntry = true;
            }
        }

        stringBuilder.append('}');

        return stringBuilder.toString();
    }
}
