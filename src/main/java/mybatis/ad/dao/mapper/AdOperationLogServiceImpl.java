package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdOperationLogMapper;
import mybatis.ad.dao.model.AdOperationLog;
import mybatis.ad.dao.model.AdOperationLogExample;
import mybatis.ad.dao.mapper.AdOperationLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdOperationLogService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdOperationLogServiceImpl extends BaseServiceImpl<AdOperationLogMapper, AdOperationLog, AdOperationLogExample> implements AdOperationLogService {

    private static final Logger logger = LoggerFactory.getLogger(AdOperationLogServiceImpl.class);

    @Autowired
    private AdOperationLogMapper adOperationLogMapper;

}