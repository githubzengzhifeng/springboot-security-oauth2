package com.unionman.springbootsecurityauth2.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

/**
 * @description: 抽取持久层通用方法
 * @param <T>
 * @author: Rong.Jia
 * @date: 2019/01/14 17:00
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Integer>, JpaSpecificationExecutor<T> {

    /**
     * @param id 信息唯一标识
     * @return T 获取的信息
     * @description: 根据id 获取信息
     * @author: Rong.Jia
     * @date: 2019/01/14 17:00
     */
    @Override
    Optional<T> findById(Integer id);

    /**
     * @return 将获取的信息封装到List中 返回
     * @description: 获取所有的信息
     * @author: Rong.Jia
     * @date: 2019/01/14 17:00
     */
    @Override
    List<T> findAll();

    /**
     * @param entity 实体类信息
     * @description: 删除指定的信息
     * @author: Rong.Jia
     * @date: 2019/01/14 17:00
     */
    @Override
    void delete(T entity);

    /**
     * @param id 唯一标识
     * @description: 根据id 删除信息
     * @author: Rong.Jia
     * @date: 2019/01/14 17:00
     */
    @Override
    void deleteById(Integer id);

}
