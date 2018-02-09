package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdHostMapper;
import mybatis.ad.dao.model.AdHost;
import mybatis.ad.dao.model.AdHostExample;
import mybatis.ad.dao.mapper.AdHostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdHostService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdHostServiceImpl extends BaseServiceImpl<AdHostMapper, AdHost, AdHostExample> implements AdHostService {

    private static final Logger logger = LoggerFactory.getLogger(AdHostServiceImpl.class);

    @Autowired
    private AdHostMapper adHostMapper;

}