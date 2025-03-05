package com.sist.vo;

import lombok.Data;

/*
COCKTAIL_NO	NUMBER
ID	VARCHAR2(20 BYTE)
NAME	VARCHAR2(100 BYTE)
ENAME	VARCHAR2(100 BYTE)
COMMENTS	VARCHAR2(260 BYTE)
ALC	VARCHAR2(100 BYTE)
IMAGE	VARCHAR2(260 BYTE)
CONTENT	CLOB
DETAIL	CHAR(1 BYTE)
HIT	NUMBER
LIKES	NUMBER
 */
@Data
public class CocktailVO {
	private int cocktail_no,hit,likes;
	private String id,name,ename,comments,alc,image,dontent,detail;
}
