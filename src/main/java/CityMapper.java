import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CityMapper {

    @Select("select * from city")
    List<Map<String, Object>> query();
}
