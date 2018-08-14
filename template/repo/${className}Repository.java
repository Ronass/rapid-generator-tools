<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.repo;
import ${basepackage}.model.${className}DO;

/*
 * ${table.sqlName}：Repository层
 */

public interface ${className}Repository extends BaseRepository<${className}DO,Long>{
}
