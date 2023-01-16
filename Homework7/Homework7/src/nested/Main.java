package nested;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        table.put("HH",26);
        table.put("AA",25);
        table.put("RR",27);

     /*   System.out.println(table.get("HH"));
        System.out.println(table.get("AA"));
        System.out.println(table.get("RR"));
        System.out.println(table.get("EE"));*/


       /* TablePrinter tablePrinter = new TablePrinter(table,15,10 );
        tablePrinter.printTable("Name", "age");*/

        //создание объекта Tableprinter, который ассоциирован с объектом table
        Table.TablePrinter printer = table.new TablePrinter(20, 20);
        printer.printTable("Name", "Age");

        /*
        Table.TablePrinter printer1 = table1.new TablePrinter(20, 20);
        printer.printTable("Name", "Age");*/

        //Table.TableEntry tableEntry = new Table.TableEntry("TT",36);
    }
}
