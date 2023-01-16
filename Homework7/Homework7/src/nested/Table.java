package nested;

public class Table {

    //макс кол-во элементов в массиве
    private static final int MAX_TABLE_SIZE = 10;

    //вложенный класс( вложенный статический)
    private TableEntry table[];

    //количество элементов таблицы
    private int count = 0 ;

    public Table(){
        this.table = new TableEntry[MAX_TABLE_SIZE];
    }
    public void put(String key, int value){
        if(count< MAX_TABLE_SIZE){
            TableEntry tableEntry = new TableEntry(key,value);
            table[count] = tableEntry;
            count++;
        }else{}
        System.err.println("Table is full");
    }

    public int get(String key){
        for (int i =0; i< count; i++){
            TableEntry current = table[i];

            if(current.getKey().equals(key)){
                return current.getValue();
            }
        }
        System.out.println("Not found");
        return  -1;
    }

    public TableEntry[] getTable(){
        return  table;
    }

    public int getCount(){
        return  count;
    }

    //вложенный класс(вложенный статический) - ассоциирован с классом
    private static class TableEntry {

        String key;
        int value;

         TableEntry(String key, int value) {
            this.key = key;
            this.value = value;
        }

         String getKey(){
            return key;
        }

        int getValue(){
            return value;
        }


    }

    public class TablePrinter {
        private String tableHeaderFormat;
        //="%10s|%10s\n";
        private String tableRowFormat;
        // "%10s|%10s\n";

        public class TableEntry {

            private String key;
            private int value;


            public TableEntry(String key, int value) {
                this.key = key;
                this.value = value;
            }

            public String getKey(){
                return key;
            }

            public  int getValue(){
                return value;
            }


        }

        //внутренний класс(inner) - accоциирован с объектом обрамлчющего класса(Table)
        public TablePrinter( int keyWeight, int valueWeight){

            this.tableHeaderFormat = "%"+keyWeight + "s|%"+valueWeight+"s\n";
            this.tableRowFormat = "%"+keyWeight + "s|%"+valueWeight+"d\n";
        }
        public void printTable(String ketName, String  valueName){


            System.out.printf(tableHeaderFormat,ketName,valueName);
            System.out.println("--------------------");
            for (int i=0; i<count; i++){
                System.out.printf(tableRowFormat,table[i].getKey(),table[i].getValue());
            }
        }
    }
}
