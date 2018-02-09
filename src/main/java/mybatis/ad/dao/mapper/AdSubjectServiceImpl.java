package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdSubjectMapper;
import mybatis.ad.dao.model.AdSubject;
import mybatis.ad.dao.model.AdSubjectExample;
import mybatis.ad.dao.mapper.AdSubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdSubjectService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdSubjectServiceImpl extends BaseServiceImpl<AdSubjectMapper, AdSubject, AdSubjectExample> implements AdSubjectService {

    private static final Logger logger = LoggerFactory.getLogger(AdSubjectServiceImpl.class);

    @Autowired
    private AdSubjectMapper adSubjectMapper;

}