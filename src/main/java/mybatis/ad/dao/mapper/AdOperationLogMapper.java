package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdOperationLog;
import mybatis.ad.dao.model.AdOperationLogExample;
import org.apache.ibatis.annotations.Param;

public interface AdOperationLogMapper {
    long countByExample(AdOperationLogExample example);

    int deleteByExample(AdOperationLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdOperationLog record);

    int insertSelective(AdOperationLog record);

    List<AdOperationLog> selectByExampleWithBLOBs(AdOperationLogExample example);

    List<AdOperationLog> selectByExample(AdOperationLogExample example);

    AdOperationLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdOperationLog record, @Param("example") AdOperationLogExample example);

    int updateByExampleWithBLOBs(@Param("record") AdOperationLog record, @Param("example") AdOperationLogExample example);

    int updateByExample(@Param("record") AdOperationLog record, @Param("example") AdOperationLogExample example);

    int updateByPrimaryKeySelective(AdOperationLog record);

    int updateByPrimaryKeyWithBLOBs(AdOperationLog record);

    int updateByPrimaryKey(AdOperationLog record);
}