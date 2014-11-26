package net.javaw.example.service;

import net.javaw.example.dao.DomainHostMapper;
import net.javaw.example.model.DomainHost;
import net.javaw.example.model.DomainHostExample;
import net.javaw.mybatis.generator.Page;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Helios on 14-11-26.
 */
public class DomainHostService {

    @Resource
    private DomainHostMapper domainHostMapper;


    /**
     * 分页查询域名记录
     *
     * @param page 分页对象
     * @return
     * @author Helios
     * @date 2014年11月13日 下午5:09:29
     */
    public Map<String, Object> queryDomainHostByDomainName(Page page) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        DomainHostExample example = new DomainHostExample();
        example.setOrderByClause("CREATE_TIME desc");
        example.setPage(page);

        page.setCount(domainHostMapper.countByExample(example));
        resultMap.put("page", page);

        List<DomainHost> resultList = domainHostMapper.selectByExample(example);
        resultMap.put("resultList", resultList);

        return resultMap;
    }
}
