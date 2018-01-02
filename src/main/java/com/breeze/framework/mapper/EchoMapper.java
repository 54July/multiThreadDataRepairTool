package com.breeze.framework.mapper;

import java.util.List;
import java.util.Map;

import com.breeze.framework.common.MergeQuery;
import com.breeze.framework.entity.ContractCreate;
import com.breeze.framework.entity.InternetUse;

/**
 * @author JuanChensh
 *
 */
public interface EchoMapper {
	
	public List<Map<String,Object>> selectAll(MergeQuery<ContractCreate> query);
	public Long selectAllCount();
	public void insertInternet(InternetUse internetUse);
	public void insertAll(ContractCreate contractCreate);
	public void updateContractcreate(ContractCreate contractCreate);
}
