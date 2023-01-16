package ex1;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank(10,100,2,0.5);
        tank.go(5);
        tank.fire();
        tank.fire();
        tank.fire();
        System.out.println(tank.getFuelAmount());
        System.out.println(tank.getBulletsCount());

        Airplane airplane = new Airplane(350,4,30);
        airplane.go(10);
        System.out.println(airplane.getFuelAmount());

        //абстракция, смысла от них нет, можно запретить их создавать ключевым словом abstract
        //смысл только для создания иерархии, создание шаблонов
        //хранение общего для потомков

        //ex1.Transport transport = new ex1.Transport(100, 10);
        //ex1.Millitary millitary = new ex1.Millitary(10,5, 10)

        //объектная переменная указывает на ссылку объекта потомка
       //неявное преобразование. Явное когда (transport)airplane
        Transport transport = airplane;
        Millitary millitary = tank;

        //восходящее преобразование - объектной перемнной класса предка которой можно присвоить ссылку на объект класса потомка
        //транспорт объектная переменная,
        // которая содержит самолет
        transport.go(100);
        millitary.fire();
        millitary.stop();

        transport = tank;
        transport.stop();

        airplane.stop();
        tank.stop();
    }
}