package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdBusinessGroupMapper;
import mybatis.ad.dao.model.AdBusinessGroup;
import mybatis.ad.dao.model.AdBusinessGroupExample;
import mybatis.ad.dao.mapper.AdBusinessGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdBusinessGroupService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdBusinessGroupServiceImpl extends BaseServiceImpl<AdBusinessGroupMapper, AdBusinessGroup, AdBusinessGroupExample> implements AdBusinessGroupService {

    private static final Logger logger = LoggerFactory.getLogger(AdBusinessGroupServiceImpl.class);

    @Autowired
    private AdBusinessGroupMapper adBusinessGroupMapper;

}