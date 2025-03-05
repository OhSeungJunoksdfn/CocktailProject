package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import com.sist.commons.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CocktailbarDAO {
	private static SqlSessionFactory ssf;
	static
	{
		ssf=CreateSqlSessionFactory.getSsf();
	}
	
	public static CocktailbarVO cocktailbarHouseData()
	{
		SqlSession session = ssf.openSession();
		CocktailbarVO vo = session.selectOne("cocktailbarHouseData");
		session.close();
		return vo;
	}
}
