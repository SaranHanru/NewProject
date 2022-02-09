package com.Vtiger.GenericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtilityVtigerCRM implements PathFilesVtigerCRM {
    
	public String readFromPropUtil(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(PropertyFilePath);
		
		Properties pdata= new Properties();
		
		pdata.load(fis);
		
		String value = pdata.getProperty(key);
		
		return(value);
	}
}
