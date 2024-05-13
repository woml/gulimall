package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价表
 * 
 * @author danghongbo
 * @email danghongbo@qq.com
 * @date 2024-05-13 19:32:45
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * 商品名字
	 */
	private String spuName;
	/**
	 * 会员昵称
	 */
	private String memberNickName;
	/**
	 * 星级
	 */
	private Integer star;
	/**
	 * 会员ip
	 */
	private String memberIp;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 显示状态
	 */
	private Integer showStatus;
	/**
	 * 购买时属性组合
	 */
	private String spuAttributes;
	/**
	 * 点赞数
	 */
	private Integer likesCount;
	/**
	 * 回复数
	 */
	private Integer replyCount;
	/**
	 * 评论图片/视频
	 */
	private String resources;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 用户头像
	 */
	private String memberIcon;
	/**
	 * 评论类型
	 */
	private Integer commentType;

}
