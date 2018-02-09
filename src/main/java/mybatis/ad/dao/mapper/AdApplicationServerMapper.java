package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdApplicationServer;
import mybatis.ad.dao.model.AdApplicationServerExample;
import org.apache.ibatis.annotations.Param;

public interface AdApplicationServerMapper {
    long countByExample(AdApplicationServerExample example);

    int deleteByExample(AdApplicationServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdApplicationServer record);

    int insertSelective(AdApplicationServer record);

    List<AdApplicationServer> selectByExample(AdApplicationServerExample example);

    AdApplicationServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdApplicationServer record, @Param("example") AdApplicationServerExample example);

    int updateByExample(@Param("record") AdApplicationServer record, @Param("example") AdApplicationServerExample example);

    int updateByPrimaryKeySelective(AdApplicationServer record);

    int updateByPrimaryKey(AdApplicationServer record);
}