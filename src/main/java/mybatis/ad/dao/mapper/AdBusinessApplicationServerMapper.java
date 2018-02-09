package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdBusinessApplicationServer;
import mybatis.ad.dao.model.AdBusinessApplicationServerExample;
import org.apache.ibatis.annotations.Param;

public interface AdBusinessApplicationServerMapper {
    long countByExample(AdBusinessApplicationServerExample example);

    int deleteByExample(AdBusinessApplicationServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdBusinessApplicationServer record);

    int insertSelective(AdBusinessApplicationServer record);

    List<AdBusinessApplicationServer> selectByExample(AdBusinessApplicationServerExample example);

    AdBusinessApplicationServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdBusinessApplicationServer record, @Param("example") AdBusinessApplicationServerExample example);

    int updateByExample(@Param("record") AdBusinessApplicationServer record, @Param("example") AdBusinessApplicationServerExample example);

    int updateByPrimaryKeySelective(AdBusinessApplicationServer record);

    int updateByPrimaryKey(AdBusinessApplicationServer record);
}