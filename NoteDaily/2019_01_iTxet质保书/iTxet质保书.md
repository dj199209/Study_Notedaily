https://10.1.1.73/svn/Code/zdgcfx
##思路梳理

## 常用变量名

### 建材质保书

### pdf长度转换
- ★1英寸=72点

- BuildSteel(buildSteel)
### 合金钢质保书
- AlloySteel(alloySteel)

## itext质保书抽象成方法
### 生成表格

* @param value 表格内每行单元格个数
* @return PdfPTable 表格

```java
	
	public static PdfPTable creatTable(int value) {
		PdfPTable headerTable = new PdfPTable(value);
		headerTable.setTotalWidth(800);
		headerTable.setHorizontalAlignment(Element.ALIGN_CENTER);
		headerTable.setLockedWidth(true);
		return headerTable;
	}
```
### 生成单元格
* @param value 单元格内容
* @param font  单元格内容字体
* @param horizontalAlignment  单元格横向默认居中
* @param verticalAlignment   单元格纵向默认居中
* @param border   默认无边框
* @param colspans 横向合并个数, 默认无合并
* @param rowspans 纵向合并个数,默认无合并
```java
	public static void creatCell(PdfPTable pdfTables,String value, Font font,Integer horizontalAlignment,Integer verticalAlignment,Integer border,Integer colspans,Integer rowspans) {
		int horizontalAlignmentValue = horizontalAlignment==null?Element.ALIGN_CENTER:horizontalAlignment;
		int verticalAlignmentValue = verticalAlignment==null?Element.ALIGN_MIDDLE:verticalAlignment;
		int borderValue = border==null?Rectangle.BOX:border;
		PdfPCell headerCell = new PdfPCell(new Phrase(value, font));
		headerCell.setHorizontalAlignment(horizontalAlignmentValue);
		headerCell.setVerticalAlignment(verticalAlignmentValue);
		if(colspans!=null) {
			headerCell.setColspan(colspans);
		}
		if(rowspans!=null) {
			headerCell.setRowspan(rowspans);
		}
		headerCell.setBorder(borderValue);
		//return headerCell;
		pdfTables.addCell(headerCell);
	}
```
### 生成图片单元格 
* @param value 图片链接
* @param horizontalAlignment  单元格横向默认居中
* @param verticalAlignment   单元格纵向默认居中
* @param border   默认无边框
* @param colspans 横向合并个数, 默认无合并
* @param rowspans 纵向合并个数,默认无合并

```java
	public static void creatImgCell(PdfPTable pdfTables,String value,Integer horizontalAlignment,Integer verticalAlignment,Integer border,Integer colspans,Integer rowspans) {
		PdfPCell CellImg = new PdfPCell();
		String filePath = "";
		try {
			Image img = Image.getInstance(filePath + value);
			CellImg.setImage(img);
		} catch (Exception e) {
			// TODO: handle exception
		}
		int horizontalAlignmentValue = horizontalAlignment==null?Element.ALIGN_CENTER:horizontalAlignment;
		int verticalAlignmentValue = verticalAlignment==null?Element.ALIGN_MIDDLE:verticalAlignment;
		int borderValue = border==null?Rectangle.BOX:border;
		int colspanValue = colspans==null?0:colspans;
		int rowspanValue = rowspans==null?0:rowspans;
		CellImg.setHorizontalAlignment(horizontalAlignmentValue);
		CellImg.setVerticalAlignment(verticalAlignmentValue);
		CellImg.setColspan(colspanValue);
		CellImg.setRowspan(rowspanValue);
		CellImg.setBorder(borderValue);
		//return CellImg;
		pdfTables.addCell(CellImg);
	}
```

