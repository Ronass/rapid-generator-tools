<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case>   


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.goteam.framework.web.modules.mybatis.MybatisTools;

/*
 * ${table.sqlName}：Service层
 */

@Service
public class ${className}Service {
	
	@Autowired
	private ${className}Mapper ${classNameFirstLower}Mapper;
	
	/**
	 * 保存和新增
	 * @param ${classNameLowerCase}
	 * @return
	 */
	public boolean save(${className} ${classNameLowerCase}){
		return MybatisTools.save(${classNameFirstLower}Mapper,${classNameLowerCase}.getId(),${classNameLowerCase});
	}
	
	/**
     * 查询
     * @param id
     * @return
     */
    public ${className} selectById(Long id){
        return ${classNameFirstLower}Mapper.selectById(id);
    }
	
	
	
}
