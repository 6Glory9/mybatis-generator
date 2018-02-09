package mybatis.ad.dao.mapper;

import java.util.List;
import mybatis.ad.dao.model.AdResourceHeartbeat;
import mybatis.ad.dao.model.AdResourceHeartbeatExample;
import org.apache.ibatis.annotations.Param;

public interface AdResourceHeartbeatMapper {
    long countByExample(AdResourceHeartbeatExample example);

    int deleteByExample(AdResourceHeartbeatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdResourceHeartbeat record);

    int insertSelective(AdResourceHeartbeat record);

    List<AdResourceHeartbeat> selectByExampleWithBLOBs(AdResourceHeartbeatExample example);

    List<AdResourceHeartbeat> selectByExample(AdResourceHeartbeatExample example);

    AdResourceHeartbeat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdResourceHeartbeat record, @Param("example") AdResourceHeartbeatExample example);

    int updateByExampleWithBLOBs(@Param("record") AdResourceHeartbeat record, @Param("example") AdResourceHeartbeatExample example);

    int updateByExample(@Param("record") AdResourceHeartbeat record, @Param("example") AdResourceHeartbeatExample example);

    int updateByPrimaryKeySelective(AdResourceHeartbeat record);

    int updateByPrimaryKeyWithBLOBs(AdResourceHeartbeat record);

    int updateByPrimaryKey(AdResourceHeartbeat record);
}