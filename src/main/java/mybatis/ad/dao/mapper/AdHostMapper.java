package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdHost;
import mybatis.ad.dao.model.AdHostExample;
import org.apache.ibatis.annotations.Param;

public interface AdHostMapper {
    long countByExample(AdHostExample example);

    int deleteByExample(AdHostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdHost record);

    int insertSelective(AdHost record);

    List<AdHost> selectByExample(AdHostExample example);

    AdHost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdHost record, @Param("example") AdHostExample example);

    int updateByExample(@Param("record") AdHost record, @Param("example") AdHostExample example);

    int updateByPrimaryKeySelective(AdHost record);

    int updateByPrimaryKey(AdHost record);
}