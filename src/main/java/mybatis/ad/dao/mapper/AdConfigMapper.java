package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdConfig;
import mybatis.ad.dao.model.AdConfigExample;
import org.apache.ibatis.annotations.Param;

public interface AdConfigMapper {
    long countByExample(AdConfigExample example);

    int deleteByExample(AdConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdConfig record);

    int insertSelective(AdConfig record);

    List<AdConfig> selectByExample(AdConfigExample example);

    AdConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdConfig record, @Param("example") AdConfigExample example);

    int updateByExample(@Param("record") AdConfig record, @Param("example") AdConfigExample example);

    int updateByPrimaryKeySelective(AdConfig record);

    int updateByPrimaryKey(AdConfig record);
}