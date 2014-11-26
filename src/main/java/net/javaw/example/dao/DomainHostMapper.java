package net.javaw.example.dao;

import java.util.List;
import net.javaw.example.model.DomainHost;
import net.javaw.example.model.DomainHostExample;
import org.apache.ibatis.annotations.Param;

public interface DomainHostMapper {
    int countByExample(DomainHostExample example);

    int deleteByExample(DomainHostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DomainHost record);

    int insertSelective(DomainHost record);

    List<DomainHost> selectByExample(DomainHostExample example);

    DomainHost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DomainHost record, @Param("example") DomainHostExample example);

    int updateByExample(@Param("record") DomainHost record, @Param("example") DomainHostExample example);

    int updateByPrimaryKeySelective(DomainHost record);

    int updateByPrimaryKey(DomainHost record);
}