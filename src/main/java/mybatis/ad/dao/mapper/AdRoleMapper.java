package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdRole;
import mybatis.ad.dao.model.AdRoleExample;
import org.apache.ibatis.annotations.Param;

public interface AdRoleMapper {
    long countByExample(AdRoleExample example);

    int deleteByExample(AdRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdRole record);

    int insertSelective(AdRole record);

    List<AdRole> selectByExample(AdRoleExample example);

    AdRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdRole record, @Param("example") AdRoleExample example);

    int updateByExample(@Param("record") AdRole record, @Param("example") AdRoleExample example);

    int updateByPrimaryKeySelective(AdRole record);

    int updateByPrimaryKey(AdRole record);
}