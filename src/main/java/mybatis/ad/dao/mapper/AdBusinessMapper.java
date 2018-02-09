package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdBusiness;
import mybatis.ad.dao.model.AdBusinessExample;
import org.apache.ibatis.annotations.Param;

public interface AdBusinessMapper {
    long countByExample(AdBusinessExample example);

    int deleteByExample(AdBusinessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdBusiness record);

    int insertSelective(AdBusiness record);

    List<AdBusiness> selectByExample(AdBusinessExample example);

    AdBusiness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdBusiness record, @Param("example") AdBusinessExample example);

    int updateByExample(@Param("record") AdBusiness record, @Param("example") AdBusinessExample example);

    int updateByPrimaryKeySelective(AdBusiness record);

    int updateByPrimaryKey(AdBusiness record);
}