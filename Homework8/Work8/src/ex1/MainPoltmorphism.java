package ex1;

public class MainPoltmorphism {
    public static void main(String[] args) {
        //объект через призму типа ссылочной переменной
        Transport t1 = new Airplane(350, 4, 30);
        Transport t2 = new MilitaryAirplane(100, 10, 30, 100);
        Transport t3 = new Tank(10, 100, 5, 0.3);

        //видно только методы предков
        //полиморфизм  - работаем с объектами рахных типов так
        // как будто они принадлежат одному типу
        Transport transports[] = {t1, t2, t3};
        for (int i = 0; i < transports.length; i++) {
            transports[i].stop();
        }

        //нисходящее преобразвание только тогда когда знаешь какой объект содержится
        //явное преобразование
        //преобразует Транспорт в Танк и вызовет метод, который есть в объекте Танк
        ((Tank)(t3)).fire();
    }
}
