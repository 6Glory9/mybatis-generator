package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdApplicationServerMapper;
import mybatis.ad.dao.model.AdApplicationServer;
import mybatis.ad.dao.model.AdApplicationServerExample;
import mybatis.ad.dao.mapper.AdApplicationServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdApplicationServerService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdApplicationServerServiceImpl extends BaseServiceImpl<AdApplicationServerMapper, AdApplicationServer, AdApplicationServerExample> implements AdApplicationServerService {

    private static final Logger logger = LoggerFactory.getLogger(AdApplicationServerServiceImpl.class);

    @Autowired
    private AdApplicationServerMapper adApplicationServerMapper;

}