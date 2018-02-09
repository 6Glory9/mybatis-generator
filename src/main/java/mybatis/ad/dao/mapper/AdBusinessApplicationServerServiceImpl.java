package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdBusinessApplicationServerMapper;
import mybatis.ad.dao.model.AdBusinessApplicationServer;
import mybatis.ad.dao.model.AdBusinessApplicationServerExample;
import mybatis.ad.dao.mapper.AdBusinessApplicationServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdBusinessApplicationServerService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdBusinessApplicationServerServiceImpl extends BaseServiceImpl<AdBusinessApplicationServerMapper, AdBusinessApplicationServer, AdBusinessApplicationServerExample> implements AdBusinessApplicationServerService {

    private static final Logger logger = LoggerFactory.getLogger(AdBusinessApplicationServerServiceImpl.class);

    @Autowired
    private AdBusinessApplicationServerMapper adBusinessApplicationServerMapper;

}