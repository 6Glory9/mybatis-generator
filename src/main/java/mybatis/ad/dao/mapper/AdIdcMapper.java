package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdIdc;
import mybatis.ad.dao.model.AdIdcExample;
import org.apache.ibatis.annotations.Param;

public interface AdIdcMapper {
    long countByExample(AdIdcExample example);

    int deleteByExample(AdIdcExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdIdc record);

    int insertSelective(AdIdc record);

    List<AdIdc> selectByExample(AdIdcExample example);

    AdIdc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdIdc record, @Param("example") AdIdcExample example);

    int updateByExample(@Param("record") AdIdc record, @Param("example") AdIdcExample example);

    int updateByPrimaryKeySelective(AdIdc record);

    int updateByPrimaryKey(AdIdc record);
}