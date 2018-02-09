package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdBusinessMapper;
import mybatis.ad.dao.model.AdBusiness;
import mybatis.ad.dao.model.AdBusinessExample;
import mybatis.ad.dao.mapper.AdBusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdBusinessService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdBusinessServiceImpl extends BaseServiceImpl<AdBusinessMapper, AdBusiness, AdBusinessExample> implements AdBusinessService {

    private static final Logger logger = LoggerFactory.getLogger(AdBusinessServiceImpl.class);

    @Autowired
    private AdBusinessMapper adBusinessMapper;

}