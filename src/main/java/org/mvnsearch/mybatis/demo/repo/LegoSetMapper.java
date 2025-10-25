package org.mvnsearch.mybatis.demo.repo;

import org.apache.ibatis.annotations.Mapper;
import org.jspecify.annotations.Nullable;
import org.mvnsearch.mybatis.demo.model.LegoSet;

/**
 * lego set mapper
 *
 * @author linux_china
 */
@Mapper
public interface LegoSetMapper {

    @Nullable
    LegoSet findById(Integer id);

    @Nullable
    LegoSet findByName(String name);
}
