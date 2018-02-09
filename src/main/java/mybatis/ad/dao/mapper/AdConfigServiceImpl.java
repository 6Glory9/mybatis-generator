package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdConfigMapper;
import mybatis.ad.dao.model.AdConfig;
import mybatis.ad.dao.model.AdConfigExample;
import mybatis.ad.dao.mapper.AdConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdConfigService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdConfigServiceImpl extends BaseServiceImpl<AdConfigMapper, AdConfig, AdConfigExample> implements AdConfigService {

    private static final Logger logger = LoggerFactory.getLogger(AdConfigServiceImpl.class);

    @Autowired
    private AdConfigMapper adConfigMapper;

}