<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.model;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.*;
import javax.persistence.*;
<#assign hasBigDecimal = 0>
<#assign hasDate = 0>
<#list table.columns as column>
	<#if column.javaType == 'BigDecimal'>
		<#if hasBigDecimal == 0>
			<#assign hasBigDecimal = 1>
import java.math.BigDecimal;
		</#if>
	<#elseif column.javaType == 'Date'>
		<#if hasDate == 0>
			<#assign hasDate = 1>
import java.util.Date;
		</#if>
	</#if>
</#list>

/**
 * ${table.tableAlias}
 * @version 1.0
 * @author rapid
 */
@ApiModel(value="用户实体model")
@Entity
@Table(name = "${table.sqlName}")
public class ${className}DO implements Serializable {

	<#list table.columns as column>
	
	@ApiModelProperty(value = "${column.columnAlias}",notes="${column.columnAlias}",dataType="${column.simpleJavaType}")
	<#if column.pk>
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	</#if>
	<#if (column_index > 0)>
	@Column(name = "${column.sqlName}")
	</#if>
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>
		
	<#list table.columns as column>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	</#list>
}
<#macro generateJavaColumns>
	<#list table.columns as column>
    <@generateBycondition column.sqlName>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	</@generateBycondition>
	</#list>
</#macro>