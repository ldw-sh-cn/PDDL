package com.alibaba.cobar.client.router;

import com.alibaba.cobar.client.datasources.CobarDataSourceDescriptor;
import com.ibatis.sqlmap.engine.scope.StatementScope;

public class DefaultCobarTableRouter implements ICobarTableRouter{

	@Override
	public String[] doRoute(StatementScope statementScope, CobarDataSourceDescriptor dataSourceDescriptor, String sql, Object[] parameters) {
		return new String[]{sql,sql};
	}

}
