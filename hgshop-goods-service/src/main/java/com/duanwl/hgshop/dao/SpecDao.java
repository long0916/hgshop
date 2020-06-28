package com.duanwl.hgshop.dao;

import java.util.List;


import com.duanwl.hgshop.pojo.Spec;
import com.duanwl.hgshop.pojo.SpecOption;
/**
 * 
 * @ClassName: SpecDao 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月28日 下午6:46:31
 */
public interface SpecDao {

	int addSpec(Spec spec);

	int delOptions(int ...ids);

	int delSpec(int[] ids);

	int update(Spec spec);

	int addOption(SpecOption specOption);

	List<Spec> list(Spec spec);

	Spec findById(int id);

}
