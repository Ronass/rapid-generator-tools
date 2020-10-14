<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case>   


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.goteam.framework.web.modules.mybatis.MybatisTools;
import com.goteam.framework.core.basics.constant.Default;


/**
 * ${table.tableAlias} Service
 * @version 1.0
 * @author rapid
 */

@Service
public class ${className}Service {
	
	@Autowired
	private ${className}Mapper ${classNameFirstLower}Mapper;
	
	/**
	 * 保存和新增
	 * @param model
	 * @return
	 */
	public boolean save(${className} model){
		return MybatisTools.save(${classNameFirstLower}Mapper,model.getId(),model);
	}
	
	/**
     * 查询
     * @param id
     * @return
     */
    public ${className} selectById(Long id){
        return ${classNameFirstLower}Mapper.selectById(id);
    }


	/**
	 * 删除ID
	 * @param id
	 * @return
	 */
    public boolean deleteById(Long id){
		return ${classNameFirstLower}Mapper.deleteById(id) > Default.NumberReg.INT_ZERO;
	}
	
	
}
