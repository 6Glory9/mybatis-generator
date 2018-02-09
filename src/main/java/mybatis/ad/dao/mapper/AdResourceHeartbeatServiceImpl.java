package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdResourceHeartbeatMapper;
import mybatis.ad.dao.model.AdResourceHeartbeat;
import mybatis.ad.dao.model.AdResourceHeartbeatExample;
import mybatis.ad.dao.mapper.AdResourceHeartbeatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdResourceHeartbeatService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdResourceHeartbeatServiceImpl extends BaseServiceImpl<AdResourceHeartbeatMapper, AdResourceHeartbeat, AdResourceHeartbeatExample> implements AdResourceHeartbeatService {

    private static final Logger logger = LoggerFactory.getLogger(AdResourceHeartbeatServiceImpl.class);

    @Autowired
    private AdResourceHeartbeatMapper adResourceHeartbeatMapper;

}