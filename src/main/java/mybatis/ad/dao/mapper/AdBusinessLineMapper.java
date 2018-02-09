package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdBusinessLine;
import mybatis.ad.dao.model.AdBusinessLineExample;
import org.apache.ibatis.annotations.Param;

public interface AdBusinessLineMapper {
    long countByExample(AdBusinessLineExample example);

    int deleteByExample(AdBusinessLineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdBusinessLine record);

    int insertSelective(AdBusinessLine record);

    List<AdBusinessLine> selectByExample(AdBusinessLineExample example);

    AdBusinessLine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdBusinessLine record, @Param("example") AdBusinessLineExample example);

    int updateByExample(@Param("record") AdBusinessLine record, @Param("example") AdBusinessLineExample example);

    int updateByPrimaryKeySelective(AdBusinessLine record);

    int updateByPrimaryKey(AdBusinessLine record);
}