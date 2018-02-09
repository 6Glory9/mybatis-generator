package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdAgent;
import mybatis.ad.dao.model.AdAgentExample;
import org.apache.ibatis.annotations.Param;

public interface AdAgentMapper {
    long countByExample(AdAgentExample example);

    int deleteByExample(AdAgentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdAgent record);

    int insertSelective(AdAgent record);

    List<AdAgent> selectByExample(AdAgentExample example);

    AdAgent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdAgent record, @Param("example") AdAgentExample example);

    int updateByExample(@Param("record") AdAgent record, @Param("example") AdAgentExample example);

    int updateByPrimaryKeySelective(AdAgent record);

    int updateByPrimaryKey(AdAgent record);
}