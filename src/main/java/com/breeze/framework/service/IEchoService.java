package com.breeze.framework.service;

import java.util.Map;

import com.breeze.framework.common.MergeQuery;
import com.breeze.framework.entity.ContractCreate;
/**
 * @author JuanChensh
 *
 */
public interface IEchoService {
	public Map<String,String> selectAll();
	public Map<String,String> selectAllTest();
}
