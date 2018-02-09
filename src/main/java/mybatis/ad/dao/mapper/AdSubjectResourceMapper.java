package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdSubjectResource;
import mybatis.ad.dao.model.AdSubjectResourceExample;
import org.apache.ibatis.annotations.Param;

public interface AdSubjectResourceMapper {
    long countByExample(AdSubjectResourceExample example);

    int deleteByExample(AdSubjectResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdSubjectResource record);

    int insertSelective(AdSubjectResource record);

    List<AdSubjectResource> selectByExample(AdSubjectResourceExample example);

    AdSubjectResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdSubjectResource record, @Param("example") AdSubjectResourceExample example);

    int updateByExample(@Param("record") AdSubjectResource record, @Param("example") AdSubjectResourceExample example);

    int updateByPrimaryKeySelective(AdSubjectResource record);

    int updateByPrimaryKey(AdSubjectResource record);
}