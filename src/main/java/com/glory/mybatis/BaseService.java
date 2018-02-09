package com.glory.mybatis;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * BaseService接口
 */
public interface BaseService<Record, Example> {
	
	/**
	 * 根据条件查询记录数量
	 * @param example
	 * @return
	 */
	int countByExample(Example example) throws DataAccessException;
	
	/**
	 * 根据条件删除记录
	 * @param example
	 * @return
	 */
	int deleteByExample(Example example) throws DataAccessException;
	
	/**
	 * 根据主键删除记录
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id) throws DataAccessException;
	
	/**
	 * 插入记录
	 * @param record
	 * @return
	 */
	int insert(Record record) throws DataAccessException;
	
	/**
	 * 插入记录有效字段
	 * @param record
	 * @return
	 */
	int insertSelective(Record record) throws DataAccessException;
	
	/**
	 * 根据条件查询记录，附带BLOB字段
	 * @param example
	 * @return
	 */
	List<Record> selectByExampleWithBLOBs(Example example) throws DataAccessException;
	
	/**
	 * 根据条件查询记录
	 * @param example
	 * @return
	 */
	List<Record> selectByExample(Example example) throws DataAccessException;
	
	/**
	 * 根据条件查询记录并按页码分页，附带BLOB字段
	 * @param example 条件
	 * @param pageNum 页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	List<Record> selectByExampleWithBLOBsForStartPage(	Example example, Integer pageNum,
														Integer pageSize) throws DataAccessException;
	
	/**
	 * 根据条件查询记录并按页码分页
	 * @param example 条件
	 * @param pageNum 页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	List<Record> selectByExampleForStartPage(	Example example, Integer pageNum,
												Integer pageSize) throws DataAccessException;
	
	/**
	 * 根据条件查询记录并按最后记录数分页，附带BLOB字段
	 * @param example 条件
	 * @param offset 跳过数量
	 * @param limit 查询数量
	 * @return
	 */
	List<Record> selectByExampleWithBLOBsForOffsetPage(	Example example, Integer offset,
														Integer limit) throws DataAccessException;
	
	/**
	 * 根据条件查询记录并按最后记录数分页
	 * @param example 条件
	 * @param offset 跳过数量
	 * @param limit 查询数量
	 * @return
	 */
	List<Record> selectByExampleForOffsetPage(	Example example, Integer offset,
												Integer limit) throws DataAccessException;
	
	/**
	 * 根据条件查询第一条记录
	 * @param example
	 * @return
	 */
	Record selectFirstByExample(Example example) throws DataAccessException;
	
	/**
	 * 根据条件查询第一条记录，附带BLOB字段
	 * @param example
	 * @return
	 */
	Record selectFirstByExampleWithBLOBs(Example example) throws DataAccessException;
	
	/**
	 * 根据主键查询记录
	 * @param id
	 * @return
	 */
	Record selectByPrimaryKey(Integer id) throws DataAccessException;
	
	/**
	 * 根据条件更新有效字段
	 * @param record
	 * @param example
	 * @return
	 */
	int updateByExampleSelective(	@Param("record") Record record,
									@Param("example") Example example) throws DataAccessException;
	
	/**
	 * 根据条件更新记录有效字段，附带BLOB字段
	 * @param record
	 * @param example
	 * @return
	 */
	int updateByExampleWithBLOBs(	@Param("record") Record record,
									@Param("example") Example example) throws DataAccessException;
	
	/**
	 * 根据条件更新记录
	 * @param record
	 * @param example
	 * @return
	 */
	int updateByExample(@Param("record") Record record,
						@Param("example") Example example) throws DataAccessException;
	
	/**
	 * 根据主键更新记录有效字段
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Record record) throws DataAccessException;
	
	/**
	 * 根据主键更新记录，附带BLOB字段
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeyWithBLOBs(Record record) throws DataAccessException;
	
	/**
	 * 根据主键更新记录
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(Record record) throws DataAccessException;
	
	/**
	 * 根据主键批量删除记录
	 * @param ids
	 * @return
	 */
	int deleteByPrimaryKeys(String ids) throws DataAccessException;
	
}