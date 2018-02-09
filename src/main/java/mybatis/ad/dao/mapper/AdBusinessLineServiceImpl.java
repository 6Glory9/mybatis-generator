package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdBusinessLineMapper;
import mybatis.ad.dao.model.AdBusinessLine;
import mybatis.ad.dao.model.AdBusinessLineExample;
import mybatis.ad.dao.mapper.AdBusinessLineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdBusinessLineService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdBusinessLineServiceImpl extends BaseServiceImpl<AdBusinessLineMapper, AdBusinessLine, AdBusinessLineExample> implements AdBusinessLineService {

    private static final Logger logger = LoggerFactory.getLogger(AdBusinessLineServiceImpl.class);

    @Autowired
    private AdBusinessLineMapper adBusinessLineMapper;

}