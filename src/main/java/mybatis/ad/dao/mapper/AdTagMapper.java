package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdTag;
import mybatis.ad.dao.model.AdTagExample;
import org.apache.ibatis.annotations.Param;

public interface AdTagMapper {
    long countByExample(AdTagExample example);

    int deleteByExample(AdTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdTag record);

    int insertSelective(AdTag record);

    List<AdTag> selectByExample(AdTagExample example);

    AdTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdTag record, @Param("example") AdTagExample example);

    int updateByExample(@Param("record") AdTag record, @Param("example") AdTagExample example);

    int updateByPrimaryKeySelective(AdTag record);

    int updateByPrimaryKey(AdTag record);
}