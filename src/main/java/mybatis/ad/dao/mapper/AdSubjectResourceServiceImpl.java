package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdSubjectResourceMapper;
import mybatis.ad.dao.model.AdSubjectResource;
import mybatis.ad.dao.model.AdSubjectResourceExample;
import mybatis.ad.dao.mapper.AdSubjectResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdSubjectResourceService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdSubjectResourceServiceImpl extends BaseServiceImpl<AdSubjectResourceMapper, AdSubjectResource, AdSubjectResourceExample> implements AdSubjectResourceService {

    private static final Logger logger = LoggerFactory.getLogger(AdSubjectResourceServiceImpl.class);

    @Autowired
    private AdSubjectResourceMapper adSubjectResourceMapper;

}