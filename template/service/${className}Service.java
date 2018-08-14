<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case>   
package ${basepackage}.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ${basepackage}.model.${className}DO;
import ${basepackage}.repo.${className}Repository;
import ${basepackage}.controller.form.${className}SearchForm;

/*
 * ${table.sqlName}：Service层
 */

@Service
public class ${className}Service extends CommonService{
	
	@Autowired
	private ${className}Repository ${classNameFirstLower}Repository;
	
	
}
