package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdIdcMapper;
import mybatis.ad.dao.model.AdIdc;
import mybatis.ad.dao.model.AdIdcExample;
import mybatis.ad.dao.mapper.AdIdcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdIdcService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdIdcServiceImpl extends BaseServiceImpl<AdIdcMapper, AdIdc, AdIdcExample> implements AdIdcService {

    private static final Logger logger = LoggerFactory.getLogger(AdIdcServiceImpl.class);

    @Autowired
    private AdIdcMapper adIdcMapper;

}