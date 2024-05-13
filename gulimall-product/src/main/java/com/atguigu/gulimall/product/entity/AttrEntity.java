package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性表
 * 
 * @author danghongbo
 * @email danghongbo@qq.com
 * @date 2024-05-13 19:32:45
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 属性id
	 */
	@TableId
	private Long attrId;
	/**
	 * 属性名
	 */
	private String attrName;
	/**
	 * 是否需要检索
	 */
	private Integer searchType;
	/**
	 * 属性图标
	 */
	private String icon;
	/**
	 * 可选值
	 */
	private String valueSelect;
	/**
	 * 属性类型
	 */
	private Integer attrType;
	/**
	 * 启用状态
	 */
	private Long enable;
	/**
	 * 所属分类冗余
	 */
	private Long catelogId;
	/**
	 * 展示在介绍上
	 */
	private Integer showDesc;

}
