package io.pddl.datasource.support.strategy;

import javax.sql.DataSource;

import io.pddl.datasource.PartitionDataSource;
import io.pddl.datasource.support.WeightDataSourceProxy;

public class WeightStrategyWithMasterSupport extends WeightStrategySupport {
	
	@Override
	public DataSource getSlaveDataSource(PartitionDataSource pds) {
		return getDataSourceByWeight(pds,((WeightDataSourceProxy)pds.getMasterDataSource()).getWeight());
	}
	
	@Override
	public String getStrategyName(){
		return "weight-m";
	}
}
