package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdBusinessGroup;
import mybatis.ad.dao.model.AdBusinessGroupExample;
import org.apache.ibatis.annotations.Param;

public interface AdBusinessGroupMapper {
    long countByExample(AdBusinessGroupExample example);

    int deleteByExample(AdBusinessGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdBusinessGroup record);

    int insertSelective(AdBusinessGroup record);

    List<AdBusinessGroup> selectByExample(AdBusinessGroupExample example);

    AdBusinessGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdBusinessGroup record, @Param("example") AdBusinessGroupExample example);

    int updateByExample(@Param("record") AdBusinessGroup record, @Param("example") AdBusinessGroupExample example);

    int updateByPrimaryKeySelective(AdBusinessGroup record);

    int updateByPrimaryKey(AdBusinessGroup record);
}