package net.spicesoftware.api.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @since 2015/11/17
 */
public final class ReflectionUtil {

    public static <T> List<Class<? super T>> getSuperClasses(Class<T> clazz) {
        List<Class<? super T>> list = new ArrayList<>();
        getSuperClasses(list, clazz);
        return list;
    }

    private static <T, A extends T> void getSuperClasses(List<Class<? super A>> classList, Class<T> clazz) {
        Class<? super T> superclass = clazz.getSuperclass();
        if (superclass == null) {
            return;
        }
        classList.add(superclass);
        getSuperClasses(classList, superclass);
    }

    public static <T> List<Field> getFieldsIncludeSuperClasses(Class<T> clazz) {
        List<Field> fields = new ArrayList<>();

        List<Class<? super T>> classes = new ArrayList<>();
        classes.add(clazz);
        getSuperClasses(classes, clazz);

        for (Class<? super T> class0 : classes) {
            Collections.addAll(fields, class0.getDeclaredFields());
        }

        return fields;
    }
}
