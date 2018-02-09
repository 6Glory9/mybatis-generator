package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdTagMapper;
import mybatis.ad.dao.model.AdTag;
import mybatis.ad.dao.model.AdTagExample;
import mybatis.ad.dao.mapper.AdTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdTagService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdTagServiceImpl extends BaseServiceImpl<AdTagMapper, AdTag, AdTagExample> implements AdTagService {

    private static final Logger logger = LoggerFactory.getLogger(AdTagServiceImpl.class);

    @Autowired
    private AdTagMapper adTagMapper;

}