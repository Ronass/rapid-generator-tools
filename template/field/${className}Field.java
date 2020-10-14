<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.model;


/**
 * ${table.tableAlias}Field
 * @version 1.0
 * @author rapid
 */

public interface ${className}Field {

	<#list table.columns as column>
	/**
	 * ${column.columnAlias}
	 */
	String ${column.constantName}  = "${column.sqlName}";
	</#list>
}
