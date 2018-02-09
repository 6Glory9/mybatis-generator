package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdSubject;
import mybatis.ad.dao.model.AdSubjectExample;
import org.apache.ibatis.annotations.Param;

public interface AdSubjectMapper {
    long countByExample(AdSubjectExample example);

    int deleteByExample(AdSubjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdSubject record);

    int insertSelective(AdSubject record);

    List<AdSubject> selectByExample(AdSubjectExample example);

    AdSubject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdSubject record, @Param("example") AdSubjectExample example);

    int updateByExample(@Param("record") AdSubject record, @Param("example") AdSubjectExample example);

    int updateByPrimaryKeySelective(AdSubject record);

    int updateByPrimaryKey(AdSubject record);
}