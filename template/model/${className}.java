<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.*;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
 

@TableName(value = "${table.sqlName}")
@NoArgsConstructor
@Getter
@Setter
public class ${className} implements Serializable {

	<#list table.columns as column>
	@ApiModelProperty(value = "${column.columnAlias}")
	<#if column.pk>
	@TableId(type = IdType.AUTO)
	</#if>
	private ${column.simpleJavaType} ${column.columnNameLower};
	
	</#list>
}
