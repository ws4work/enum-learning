import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Class<PrizeTypeEnum> clazz = PrizeTypeEnum.class;
        Field[] clazzFields = clazz.getFields();
        Map<String, Object> map = new HashMap<>();
        for (Field field : clazzFields) {
            String name = field.getName();
            PrizeTypeEnum value = PrizeTypeEnum.valueOf(name);
            String prizeType = value.getPrizeType();
            map.put(name, prizeType);
        }
        System.out.println("执行完毕");
    }
}
