<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.dao.mysql;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * ${table.tableAlias}Mapper
 * @author rapid
 * @date <#if now??>- ${now?string('yyyy')}</#if>
 */
public interface ${className}Mapper extends BaseMapper<${className}>{
    
   
}