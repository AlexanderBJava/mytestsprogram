package exSpacePort;

public class Game {
    SpacePort spacePort;
    ControlRoom controlRoom;
    Launchable launchable;
    Launchable launchable2;
    Launchable launchable3;
    Pilot pilot;
    SpaceShip ship;
   // Dog dog;
  //  Dog dog2;





    public void init() {


        launchable=new SpaceShip();
        launchable2=new Dog("Belka");
        launchable3=new Dog("Strelka");
        pilot=new Pilot("Nikolay");
        controlRoom=new ControlRoom(launchable2);


        spacePort=new SpacePort(controlRoom);


    }

    public void start() {
        //System.out.println(pilot);//имя пилота
       spacePort.setLauchableDevice(launchable2); //назначаем Белку
        spacePort.controlRoom.launch(); //запускаем Белку
       // spacePort.setLauchableDevice(launchable3);// set Strelka
      //  spacePort.controlRoom2.launch();//launch Strelka
       spacePort.setLandinableDevice(new SpaceShip());
        spacePort.controlRoom.landing();

        //АНОНИМНЫЙ КЛАСС!!! маленький потомок без имени в одном экземпляре переопределяющий какой то метод.
        Dog dog3 =new Dog()  {
            @Override
            public void launch(){
                System.out.println("Анонимный класс полетел");
            }
        };
        //Запуск собаки3- анонимного класса:
     //   spacePort.setLauchableDevice(dog3);
       // spacePort.controlRoom.launch();

        //!!!!!!!! Использование анонимного класса прям сразу!!!!
        spacePort.setLauchableDevice(new Launchable() {
            @Override
            public void launch() {
                System.out.println("Ну допустим летающее ведро.");
            }
        });
        spacePort.controlRoom.launch();



           }
}
