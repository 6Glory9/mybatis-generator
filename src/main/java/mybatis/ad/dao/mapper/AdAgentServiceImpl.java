package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdAgentMapper;
import mybatis.ad.dao.model.AdAgent;
import mybatis.ad.dao.model.AdAgentExample;
import mybatis.ad.dao.mapper.AdAgentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdAgentService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdAgentServiceImpl extends BaseServiceImpl<AdAgentMapper, AdAgent, AdAgentExample> implements AdAgentService {

    private static final Logger logger = LoggerFactory.getLogger(AdAgentServiceImpl.class);

    @Autowired
    private AdAgentMapper adAgentMapper;

}