package mybatis.ad.dao.mapper;

import com.glory.mybatis.BaseService;
import com.glory.mybatis.BaseServiceImpl;
import mybatis.ad.dao.mapper.AdRoleMapper;
import mybatis.ad.dao.model.AdRole;
import mybatis.ad.dao.model.AdRoleExample;
import mybatis.ad.dao.mapper.AdRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AdRoleService实现
* Created by glory on 2018/2/9.
*/
@Service
@Transactional
public class AdRoleServiceImpl extends BaseServiceImpl<AdRoleMapper, AdRole, AdRoleExample> implements AdRoleService {

    private static final Logger logger = LoggerFactory.getLogger(AdRoleServiceImpl.class);

    @Autowired
    private AdRoleMapper adRoleMapper;

}