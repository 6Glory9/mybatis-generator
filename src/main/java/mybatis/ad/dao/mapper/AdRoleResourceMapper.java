package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdRoleResource;
import mybatis.ad.dao.model.AdRoleResourceExample;
import org.apache.ibatis.annotations.Param;

public interface AdRoleResourceMapper {
    long countByExample(AdRoleResourceExample example);

    int deleteByExample(AdRoleResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdRoleResource record);

    int insertSelective(AdRoleResource record);

    List<AdRoleResource> selectByExample(AdRoleResourceExample example);

    AdRoleResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdRoleResource record, @Param("example") AdRoleResourceExample example);

    int updateByExample(@Param("record") AdRoleResource record, @Param("example") AdRoleResourceExample example);

    int updateByPrimaryKeySelective(AdRoleResource record);

    int updateByPrimaryKey(AdRoleResource record);
}