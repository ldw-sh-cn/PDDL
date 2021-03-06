package io.pddl.testcase.sqlparser;

import java.util.Arrays;
import java.util.List;

import io.pddl.datasource.DatabaseType;
import io.pddl.sqlparser.SQLParsedResult;
import io.pddl.sqlparser.SQLParserFactory;

public class OrVisitorTest {

	public static void main(String args[]){
		String sql= "select o.order_name,i.item_name from t_order o,t_item i where o.order_id= i.order_id and (o.user_id=? or o.user_id=?)";
		List<Object> parameters = Arrays.<Object>asList(new Object[]{26,37});
		
		SQLParsedResult result= SQLParserFactory.create(DatabaseType.PostgreSQL,sql, parameters).parse();
		
		System.out.println(sql);
		System.out.println(result);
		System.out.println(result.getSqlBuilder().toSQL());
		
		
		sql = "select a,b,c from test where (a=1 or b=2) and (c=1 or d=2) ";
		
		//sql = "select a,b,c from test where (a=1 or b=2) and (a=4 or b=3) ";
		//sql = "select a,b,c from test where (a=1 or b=2)";
		
		result= SQLParserFactory.create(DatabaseType.PostgreSQL,sql, parameters).parse();

		System.out.println(sql);
		System.out.println(result);
		System.out.println(result.getSqlBuilder().toSQL());
	}
}
