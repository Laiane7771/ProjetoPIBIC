package edu.ifg.formosa.principal.client.util;

import com.google.gwt.user.client.ui.Composite;

public class TabelaPaginacao extends Composite{
	
	public TabelaPaginacao(){
		/*
        Panel panel = new Panel();  
        initWidget(panel);
        panel.setBorder(false);  
        panel.setPaddings(15);  
  
        PagingMemoryProxy proxy = new PagingMemoryProxy(getCompanyData());  
        RecordDef recordDef = new RecordDef(  
                new FieldDef[]{  
                        new StringFieldDef("company"),  
                        new FloatFieldDef("price"),  
                        new FloatFieldDef("change"),  
                        new FloatFieldDef("pctChange"),  
                        new DateFieldDef("lastChanged", "n/j h:ia"),  
                        new StringFieldDef("symbol"),  
                        new StringFieldDef("industry")  
                }  
        );  
  
        ArrayReader reader = new ArrayReader(recordDef);  
        final Store store = new Store(proxy, reader, true);  
  
          
  
        ColumnModel columnModel = new ColumnModel(columns);  
  
        GridPanel grid = new GridPanel();  
        grid.setStore(store);  
        grid.setColumnModel(columnModel);  
  
        grid.setFrame(true);  
        grid.setStripeRows(true);  
        grid.setAutoExpandColumn("company");  
        grid.setWidth(600);  
        grid.setHeight(250);  
        grid.setTitle("Grid that pages Local / In-Memory data");  
        grid.setAutoExpandColumn("company");  
  
        final PagingToolbar pagingToolbar = new PagingToolbar(store);  
        pagingToolbar.setPageSize(5);  
        pagingToolbar.setDisplayInfo(true);  
        pagingToolbar.setDisplayMsg("Displaying companies {0} - {1} of {2}");  
        pagingToolbar.setEmptyMsg("No records to display");  
  
        NumberField pageSizeField = new NumberField();  
        pageSizeField.setWidth(40);  
        pageSizeField.setSelectOnFocus(true);  
        pageSizeField.addListener(new FieldListenerAdapter() {  
            public void onSpecialKey(Field field, EventObject e) {  
                if (e.getKey() == EventObject.ENTER) {  
                    int pageSize = Integer.parseInt(field.getValueAsString());  
                    pagingToolbar.setPageSize(pageSize);  
                }  
            }  
        });  
  
        ToolTip toolTip = new ToolTip("Enter page size");  
        toolTip.applyTo(pageSizeField);  
  
        pagingToolbar.addField(pageSizeField);  
        grid.setBottomToolbar(pagingToolbar);  
        store.load(0, 5);  
  
        panel.add(grid);  
		  
		     
	}
	
	public void adicionaCabecalho(){
		
		ColumnConfig[] columns = new ColumnConfig[]{  
                //column ID is company which is later used in setAutoExpandColumn  
                new ColumnConfig("Company", "company", 160, true, null, "company"),  
                new ColumnConfig("Price", "price", 35),  
                new ColumnConfig("Change", "change", 45),  
                new ColumnConfig("% Change", "pctChange", 65),  
                new ColumnConfig("Last Updated", "lastChanged", 65),  
                new ColumnConfig("Industry", "industry", 60, true)  
        };
		
	}
	
	public void adicionaLinhas(){
		
	}
*/
	}
}
