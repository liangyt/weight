package cn.liangyt.common.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * 描述：json
 * 创建时间 2018-07-30 13:28
 * 作者 liangyongtong
 */
public class JacksonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> T jsonToObject(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        }
        catch (Exception e) {
            return null;
        }
    }

    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}
