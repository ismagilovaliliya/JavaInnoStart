package nested;

public class TablePrinter {

/*
    private static final String TABLE_HEADER_FORMAT = "%10s|%10s\n";
    private static final String TABLE_ROW_FORMAT = "%10s|%10s\n";

    public void printTable(Table table, String ketName, String  valueName){
        TableEntry entries[] = table.getTable();

        System.out.printf(TABLE_HEADER_FORMAT,ketName,valueName);
        System.out.println("--------------------");
        for (int i=0; i<table.getCount(); i++){
            System.out.printf(TABLE_ROW_FORMAT,entries[i].getKey(),entries[i].getValue());
        }
    }*/


    private String tableHeaderFormat;
    //="%10s|%10s\n";
    private String tableRowFormat;
    // "%10s|%10s\n";

    private Table table;
    public TablePrinter(Table table, int keyWeight, int valueWeight){
        this.table = table;
        this.tableHeaderFormat = "%"+keyWeight + "s|%"+valueWeight+"s\n";
        this.tableRowFormat = "%"+keyWeight + "s|%"+valueWeight+"d\n";
    }
    public void printTable(String ketName, String  valueName){
        /*TableEntry entries[] = table.getTable();

        System.out.printf(tableHeaderFormat,ketName,valueName);
        System.out.println("--------------------");
        for (int i=0; i<table.getCount(); i++){
            System.out.printf(tableRowFormat,entries[i].getKey(),entries[i].getValue());
        }*/
    }
}
