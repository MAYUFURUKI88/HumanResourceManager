package com.rapideact.local.humanresource;

import java.net.URL;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvURLDataSet;
import org.springframework.core.io.Resource;

import com.github.springtestdbunit.dataset.AbstractDataSetLoader;

public class CsvDataSetLoader extends AbstractDataSetLoader {

	@Override
	protected IDataSet createDataSet(Resource resource) throws Exception {
		String path = resource.getURL().toString();
		// なぜかmainパッケージで来るのでtestに置き換える
		path = path.replace("main", "test");
		return new CsvURLDataSet(new URL(path));
	}

}